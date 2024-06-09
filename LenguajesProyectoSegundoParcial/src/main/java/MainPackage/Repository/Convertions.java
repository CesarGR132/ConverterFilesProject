package MainPackage.Repository;

import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Iterator;
import java.util.List;

public class Convertions implements repository{
    String currentWorkingDirectory = System.getProperty("user.dir");
    String filesFolderPath = currentWorkingDirectory + File.separator + "\\src\\main\\java\\MainPackage\\Files";
    String defaultPath = filesFolderPath.replace("\\", "\\");
    String pdfFilePath = filesFolderPath + File.separator;

    @Override
    public void convertTxtToPdf(File txtFile) {
        BufferedReader br = null;
        Document document = new Document();

        try{
            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath + txtFile.getName().replace(".txt", ".pdf")));
            document.open();
            br = new BufferedReader(new FileReader(txtFile.getAbsoluteFile()));
            String line;
            while ((line = br.readLine()) != null) {
                Paragraph p = new Paragraph(line);
                p.setAlignment(Element.ALIGN_JUSTIFIED);
                document.add(new Paragraph(line));
            }

            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }finally {
                if(br != null) {
                    try {
                        br.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Something went wrong");
                    }
                }
                document.close();
            }
        int explorerOption = JOptionPane.showConfirmDialog(null, "Abrir el explorador de archivos?", "File explorer", JOptionPane.YES_NO_OPTION);
        if(explorerOption == JOptionPane.YES_OPTION){
            openFileExplorerFolder();
        }
    }

    @Override
    public void convertWordToPdf(File wordFile) {
        String wordFilePath = String.valueOf(wordFile.getAbsoluteFile());
        try(FileInputStream fis = new FileInputStream(wordFilePath)){
            XWPFDocument document = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = document.getParagraphs();

            Document pdfDoc = new Document();

            PdfWriter.getInstance(pdfDoc, new FileOutputStream(pdfFilePath +  wordFile.getName().replace(".docx", ".pdf")));
            pdfDoc.open();

            for(XWPFParagraph para : paragraphs) {
                pdfDoc.add(new Paragraph(para.getText()));
            }
            pdfDoc.close();

        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        int explorerOption = JOptionPane.showConfirmDialog(null, "Abrir el explorador de archivos?", "File explorer", JOptionPane.YES_NO_OPTION);
        if(explorerOption == JOptionPane.YES_OPTION){
            openFileExplorerFolder();
        }
    }

    @Override
    public void convertExcelToPdf(File excelFile) {
        String excelFilePath = String.valueOf(excelFile.getAbsoluteFile());
        try(FileInputStream fis = new FileInputStream(excelFilePath)){
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);

            Document pdfDocument = new Document();
            PdfWriter.getInstance(pdfDocument, new FileOutputStream(pdfFilePath+ excelFile.getName().replace(".xlsx", ".pdf")));
            pdfDocument.open();

            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> callIterator = row.cellIterator();
                while(callIterator.hasNext()) {
                    Cell cell = callIterator.next();
                    Paragraph p = new Paragraph(cell.toString());
                    pdfDocument.add(p);
                }
            }

            pdfDocument.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
        int explorerOption = JOptionPane.showConfirmDialog(null, "Abrir el explorador de archivos?", "File explorer", JOptionPane.YES_NO_OPTION);
        if(explorerOption == JOptionPane.YES_OPTION){
            openFileExplorerFolder();
        }
    }

    @Override
    public void convertJpgToPdf(File jpgFile) {
        String imageFilePath = String.valueOf(jpgFile.getAbsoluteFile());
        try{
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(pdfFilePath + jpgFile.getName().replace(".jpg", ".pdf")));
            document.open();
            Image img = Image.getInstance(imageFilePath);
            float scaler = ((document.getPageSize().getWidth() - document.leftMargin()
                    - document.rightMargin() - 0) / img.getWidth()) * 100;
            img.scalePercent(scaler);
            img.setAlignment(Element.ALIGN_CENTER);

            document.add(img);
            document.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
        int explorerOption = JOptionPane.showConfirmDialog(null, "Abrir el explorador de archivos?", "File explorer", JOptionPane.YES_NO_OPTION);
        if(explorerOption == JOptionPane.YES_OPTION){
            openFileExplorerFolder();
        }
    }

    @Override
    public void convertCsvToPdf(File csvFile) {
        String csvFilePath = String.valueOf(csvFile.getAbsoluteFile());
            try{
                Reader in = new FileReader(csvFilePath);
                Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);

                Document pdfDocument = new Document();
                PdfWriter.getInstance(pdfDocument, new FileOutputStream(pdfFilePath + csvFile.getName().replace(".csv", ".pdf")));
                pdfDocument.open();

                PdfPTable table = new PdfPTable(records.iterator().next().size()); // number of columns is determined by the number of fields in the first record

                for(CSVRecord record : records){
                    for(String field: record){
                        table.addCell(field);
                    }
                }

                pdfDocument.add(table);

                pdfDocument.close();
                in.close();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
        int explorerOption = JOptionPane.showConfirmDialog(null, "Abrir el explorador de archivos?", "File explorer", JOptionPane.YES_NO_OPTION);
        if(explorerOption == JOptionPane.YES_OPTION){
            openFileExplorerFolder();
        }
    }

    @Override
    public void openFileExplorerFolder() {
        try {
            File directory = new File(defaultPath);
            Desktop.getDesktop().open(directory);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ups! there was an error opening the file explorer.");
        }
    }
}
