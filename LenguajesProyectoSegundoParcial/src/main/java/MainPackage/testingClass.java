package MainPackage;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class testingClass {
    public static void main(String[] args) throws IOException {
        File SelectedFile = null;
        JFileChooser txtFileChooser = new JFileChooser();
        txtFileChooser.setFileFilter(new FileNameExtensionFilter("Archivo txt", "txt"));



    }
}
