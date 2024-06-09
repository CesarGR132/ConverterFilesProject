/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

import MainPackage.Repository.Convertions;
import com.aspose.words.Document;
import com.aspose.words.SaveFormat;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.io.File;

/**
 *
 * @author cesar
 */
public class menu extends javax.swing.JFrame {
    Convertions convertions = new Convertions();
    String defaultPath = new File(".").getAbsolutePath();
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTxtToPdf = new javax.swing.JButton();
        btnExcelToPDF = new javax.swing.JButton();
        btnWordToPDF = new javax.swing.JButton();
        btnCsvToPdf = new javax.swing.JButton();
        btnJpgToPdf = new javax.swing.JButton();
        btnMaximizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(49, 51, 53));
        setMaximumSize(new java.awt.Dimension(1450, 900));
        setMinimumSize(new java.awt.Dimension(1450, 900));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1450, 900));
        getContentPane().setLayout(null);

        btnExit.setBackground(new java.awt.Color(255, 0, 0));
        btnExit.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1390, 20, 40, 40);

        btnMinimizar.setBackground(new java.awt.Color(255, 0, 0));
        btnMinimizar.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setText("-");
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar);
        btnMinimizar.setBounds(1290, 20, 40, 40);

        jLabel1.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        jLabel1.setText("Convertidor de archivos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 70, 360, 30);

        btnTxtToPdf.setBackground(new java.awt.Color(49, 51, 53));
        btnTxtToPdf.setFont(new java.awt.Font("Lemon", 1, 18)); // NOI18N
        btnTxtToPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnTxtToPdf.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Documents\\Universidad_UNEDL\\4tosemestre\\Lenguajes_programacion\\LenguajesProyectoSegundoParcial\\src\\main\\java\\MainPackage\\img\\pdf.png")); // NOI18N
        btnTxtToPdf.setText("TXT a PDF");
        btnTxtToPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTxtToPdf.setLabel("TXT a PDF");
        btnTxtToPdf.setVerifyInputWhenFocusTarget(false);
        btnTxtToPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTxtToPdfActionPerformed(evt);
            }
        });
        getContentPane().add(btnTxtToPdf);
        btnTxtToPdf.setBounds(30, 170, 270, 110);

        btnExcelToPDF.setBackground(new java.awt.Color(49, 51, 53));
        btnExcelToPDF.setFont(new java.awt.Font("Lemon", 1, 18)); // NOI18N
        btnExcelToPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnExcelToPDF.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Documents\\Universidad_UNEDL\\4tosemestre\\Lenguajes_programacion\\LenguajesProyectoSegundoParcial\\src\\main\\java\\MainPackage\\img\\excel.png")); // NOI18N
        btnExcelToPDF.setText("Excel a PDF");
        btnExcelToPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcelToPDF.setLabel("TXT a PDF");
        btnExcelToPDF.setVerifyInputWhenFocusTarget(false);
        btnExcelToPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelToPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcelToPDF);
        btnExcelToPDF.setBounds(1150, 170, 270, 110);

        btnWordToPDF.setBackground(new java.awt.Color(49, 51, 53));
        btnWordToPDF.setFont(new java.awt.Font("Lemon", 1, 18)); // NOI18N
        btnWordToPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnWordToPDF.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Documents\\Universidad_UNEDL\\4tosemestre\\Lenguajes_programacion\\LenguajesProyectoSegundoParcial\\src\\main\\java\\MainPackage\\img\\word.png")); // NOI18N
        btnWordToPDF.setText(" word a PDF");
        btnWordToPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWordToPDF.setLabel("TXT a PDF");
        btnWordToPDF.setVerifyInputWhenFocusTarget(false);
        btnWordToPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWordToPDFActionPerformed(evt);
            }
        });
        getContentPane().add(btnWordToPDF);
        btnWordToPDF.setBounds(310, 170, 270, 110);

        btnCsvToPdf.setBackground(new java.awt.Color(49, 51, 53));
        btnCsvToPdf.setFont(new java.awt.Font("Lemon", 1, 18)); // NOI18N
        btnCsvToPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnCsvToPdf.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Documents\\Universidad_UNEDL\\4tosemestre\\Lenguajes_programacion\\LenguajesProyectoSegundoParcial\\src\\main\\java\\MainPackage\\img\\csv (1).png")); // NOI18N
        btnCsvToPdf.setText("CSV A PDF");
        btnCsvToPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCsvToPdf.setLabel("TXT a PDF");
        btnCsvToPdf.setVerifyInputWhenFocusTarget(false);
        btnCsvToPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCsvToPdfActionPerformed(evt);
            }
        });
        getContentPane().add(btnCsvToPdf);
        btnCsvToPdf.setBounds(590, 170, 270, 110);

        btnJpgToPdf.setBackground(new java.awt.Color(49, 51, 53));
        btnJpgToPdf.setFont(new java.awt.Font("Lemon", 1, 18)); // NOI18N
        btnJpgToPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnJpgToPdf.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Documents\\Universidad_UNEDL\\4tosemestre\\Lenguajes_programacion\\LenguajesProyectoSegundoParcial\\src\\main\\java\\MainPackage\\img\\jpg.png")); // NOI18N
        btnJpgToPdf.setText("JPG A PDF");
        btnJpgToPdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJpgToPdf.setLabel("TXT a PDF");
        btnJpgToPdf.setVerifyInputWhenFocusTarget(false);
        btnJpgToPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJpgToPdfActionPerformed(evt);
            }
        });
        getContentPane().add(btnJpgToPdf);
        btnJpgToPdf.setBounds(870, 170, 270, 110);

        btnMaximizar.setBackground(new java.awt.Color(255, 0, 0));
        btnMaximizar.setFont(new java.awt.Font("Lemon", 1, 14)); // NOI18N
        btnMaximizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMaximizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Documents\\Universidad_UNEDL\\4tosemestre\\Lenguajes_programacion\\LenguajesProyectoSegundoParcial\\src\\main\\java\\MainPackage\\img\\maximize.png")); // NOI18N
        btnMaximizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizarActionPerformed(evt);
            }
        });
        btnTxtToPdf.setLabel("TXT a PDF");
        btnExcelToPDF.setLabel("Excel a PDF");
        btnWordToPDF.setLabel("Word a PDF");
        btnCsvToPdf.setLabel("CSV a PDF");
        btnJpgToPdf.setLabel("JPG a PDF");

        getContentPane().add(btnMaximizar);
        btnMaximizar.setBounds(1340, 20, 40, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int option = JOptionPane.showConfirmDialog(this,"Esta seguro que quiere salir?","Advertencia", JOptionPane.OK_CANCEL_OPTION);
        if(option == 0){
            System.exit(0);
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnTxtToPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTxtToPdfActionPerformed
        File SelectedFile = null;
        JFileChooser txtFileChooser = new JFileChooser();
        txtFileChooser.setFileFilter(new FileNameExtensionFilter("Archivo txt", "txt"));

        int returnValue = txtFileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            SelectedFile = txtFileChooser.getSelectedFile();
            convertions.convertTxtToPdf(SelectedFile);
        }
    }//GEN-LAST:event_btnTxtToPdfActionPerformed

    private void btnExcelToPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelToPDFActionPerformed
        File SelectedFile = null;
        JFileChooser txtFileChooser = new JFileChooser();
        txtFileChooser.setFileFilter(new FileNameExtensionFilter("Archivo xlsx", "xlsx"));

        int returnValue = txtFileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            SelectedFile = txtFileChooser.getSelectedFile();
            convertions.convertExcelToPdf(SelectedFile);
        }
    }//GEN-LAST:event_btnExcelToPDFActionPerformed

    private void btnWordToPDFActionPerformed(ActionEvent evt){//GEN-FIRST:event_btnWordToPDFActionPerformed
        File SelectedFile = null;
        JFileChooser txtFileChooser = new JFileChooser();
        txtFileChooser.setFileFilter(new FileNameExtensionFilter("Archivo docx", "docx"));

        int returnValue = txtFileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            SelectedFile = txtFileChooser.getSelectedFile();
            convertions.convertWordToPdf(SelectedFile);
        }

    }//GEN-LAST:event_btnWordToPDFActionPerformed

    private void btnCsvToPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCsvToPdfActionPerformed
        File SelectedFile = null;
        JFileChooser txtFileChooser = new JFileChooser();
        txtFileChooser.setFileFilter(new FileNameExtensionFilter("Archivo csv", "csv"));

        int returnValue = txtFileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            SelectedFile = txtFileChooser.getSelectedFile();
            convertions.convertCsvToPdf(SelectedFile);
        }
    }//GEN-LAST:event_btnCsvToPdfActionPerformed

    private void btnJpgToPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJpgToPdfActionPerformed
        File SelectedFile = null;
        JFileChooser txtFileChooser = new JFileChooser();
        txtFileChooser.setFileFilter(new FileNameExtensionFilter("Archivo jpg", "jpg"));

        int returnValue = txtFileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            SelectedFile = txtFileChooser.getSelectedFile();
            convertions.convertJpgToPdf(SelectedFile);
        }
    }//GEN-LAST:event_btnJpgToPdfActionPerformed

    private void btnMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizarActionPerformed
        if(this.getExtendedState() != JFrame.MAXIMIZED_BOTH) { 
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(JFrame.NORMAL); 
        }
    }//GEN-LAST:event_btnMaximizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        UIManager.put("Button.arc", 10);
        
        SwingUtilities.updateComponentTreeUI(new menu());
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCsvToPdf;
    private javax.swing.JButton btnExcelToPDF;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnJpgToPdf;
    private javax.swing.JButton btnMaximizar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnTxtToPdf;
    private javax.swing.JButton btnWordToPDF;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}