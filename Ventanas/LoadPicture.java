/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class LoadPicture extends javax.swing.JFrame {


    public LoadPicture() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserLoad = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jFileChooserLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoadPicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadPicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadPicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadPicture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadPicture().setVisible(true);
            }
        });
    }
    
    public void generateReport(JTable jTable, File pdfNewFile, String title){
        try {

            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));
            } catch (FileNotFoundException fileNotFoundException) {
                System.out.println("No se encontró el fichero para generar el pdf" + fileNotFoundException);
            }
            document.open();

            document.addTitle("Exportamos la tabla a PDF");
            document.addSubject("Using iText (usando iText)");
            document.addKeywords("Java, PDF, iText");
            document.addAuthor("carlosacg");
            document.addCreator("carlosacg");
            Font categoryFont = new Font();


            Anchor anchor = new Anchor("Reportes en PDF");
            anchor.setName("Reportes en PDF");


            Chapter catPart = new Chapter(new Paragraph(anchor), 1);
            Font subCategoryFont = new Font();
            

            Paragraph subPara = new Paragraph("Hecho por: carlosacg", subCategoryFont);
            Section subCatPart = catPart.addSection(subPara);
            subCatPart.add(new Paragraph("Tabla prestamos por proyectos"));

            PdfPTable table = new PdfPTable(jTable.getColumnCount()); 

            PdfPCell columnHeader;
          
            for (int column = 0; column < jTable.getColumnCount(); column++) {                 
                columnHeader = new PdfPCell(new Phrase(jTable.getColumnName(column)));
                columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(columnHeader);
            }
            table.setHeaderRows(1);
            for (int row = 0; row < jTable.getRowCount(); row++) {                
                for (int column = 0; column < jTable.getColumnCount(); column++) { 
                    table.addCell(jTable.getValueAt(row, column).toString());
                }
            } 
            subCatPart.add(table);

            document.add(catPart);

            document.close();
            JOptionPane.showMessageDialog(null, "El PDF ha sido creado de forma exitosa",
                    "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException documentException) {
            System.out.println("Se ha producido un error al generar un documento: " + documentException);
            JOptionPane.showMessageDialog(null, "Se ha producido un error al generar un documento: " + documentException,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }     
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFileChooser jFileChooserLoad;
    // End of variables declaration//GEN-END:variables
}
