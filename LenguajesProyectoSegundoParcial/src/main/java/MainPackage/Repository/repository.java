package MainPackage.Repository;

import java.io.File;

public interface repository {
    void convertTxtToPdf(File txtFile);
    void convertWordToPdf(File wordFile);
    void convertExcelToPdf(File excelFile);
    void convertJpgToPdf(File jpgFile);
    void convertCsvToPdf(File csvFile);

    void openFileExplorerFolder();
}
