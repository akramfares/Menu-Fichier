/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import PrintUtilities.PrintUtilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.xml.bind.JAXBException;
import org.docx4j.convert.out.html.AbstractHtmlExporter;
import org.docx4j.convert.out.html.AbstractHtmlExporter.HtmlSettings;
import org.docx4j.convert.out.html.HtmlExporterNG2;
import org.docx4j.fonts.IdentityPlusMapper;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.Part;
/**
 *
 * @author Akram Fares
 */
public class Impression {
    
    WordprocessingMLPackage wordMLPackage;
    
    Impression(){}
    // Impression manuelle
    void imprimer(JTextPane txt){
        
        PrintUtilities.printComponent(txt);
    }
    // Exporter au format Word
    void imprimerDocx(String titre, String intro) throws InvalidFormatException, Docx4JException, JAXBException{
       
      JFileChooser jfc = new JFileChooser();
      jfc.setDialogTitle("Enregistrer-Sous");
      jfc.setApproveButtonText("Enregistrer");
      jfc.setApproveButtonToolTipText("Enregistrer le fichier à cet emplacement");

      int resultat = jfc.showOpenDialog(null);
      if (resultat == JFileChooser.APPROVE_OPTION){
          File fichierC = jfc.getSelectedFile(); 
          wordMLPackage = WordprocessingMLPackage.createPackage();
          Part wordDocumentPart = new org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart();
          
          ((org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart) wordDocumentPart).unmarshalDefaultStyles();
          
          wordMLPackage.addTargetPart(wordDocumentPart);
          
          
          wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading1", "Cours : "+titre);
          wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading2", "Introduction :");
          
          Pattern p = Pattern.compile("\n");
            String[] items = p.split(intro);
            for (int i = 0; i < items.length; i++) {
              wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", items[i]);
            }
          
          wordMLPackage.save(fichierC);
      }
      
    }
    
    // Exporter au format HTML
    void imprimerHTML(String titre, String intro) throws FileNotFoundException, Exception{
        JFileChooser jfc = new JFileChooser();

      jfc.setDialogTitle("Enregistrer-Sous");
      jfc.setApproveButtonText("Enregistrer");
      jfc.setApproveButtonToolTipText("Enregistrer le fichier à cet emplacement");

      int resultat = jfc.showOpenDialog(null);
      if (resultat == JFileChooser.APPROVE_OPTION){
          File fichierC = jfc.getSelectedFile(); 
            wordMLPackage = WordprocessingMLPackage.createPackage();
              Part wordDocumentPart = new org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart();

              ((org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart) wordDocumentPart).unmarshalDefaultStyles();

              wordMLPackage.addTargetPart(wordDocumentPart);


              wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading1", "Cours : "+titre);
              wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading2", "Introduction :");

              Pattern p = Pattern.compile("\n");
                String[] items = p.split(intro);
                for (int i = 0; i < items.length; i++) {
                  wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", items[i]);
                }

            AbstractHtmlExporter exporter = new HtmlExporterNG2();
          OutputStream os = new java.io.FileOutputStream(fichierC.getAbsolutePath());

          javax.xml.transform.stream.StreamResult result 
               = new javax.xml.transform.stream.StreamResult(os);

          HtmlSettings html = null;

          exporter.html(wordMLPackage, result, html);
      }
      
    }
    
    // Exporter au format Pdf
    void imprimerPdf(String titre, String intro) throws FileNotFoundException, Exception{
        JFileChooser jfc = new JFileChooser();

      jfc.setDialogTitle("Enregistrer-Sous");
      jfc.setApproveButtonText("Enregistrer");
      jfc.setApproveButtonToolTipText("Enregistrer le fichier à cet emplacement");
      int resultat = jfc.showOpenDialog(null);
      if (resultat == JFileChooser.APPROVE_OPTION){
          File fichierC = jfc.getSelectedFile(); 
            wordMLPackage = WordprocessingMLPackage.createPackage();
              Part wordDocumentPart = new org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart();

              ((org.docx4j.openpackaging.parts.WordprocessingML.StyleDefinitionsPart) wordDocumentPart).unmarshalDefaultStyles();

              wordMLPackage.addTargetPart(wordDocumentPart);


              wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading1", "Cours : "+titre);
              wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Heading2", "Introduction :");

              Pattern p = Pattern.compile("\n");
                String[] items = p.split(intro);
                for (int i = 0; i < items.length; i++) {
                  wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Normal", items[i]);
                }
              
              wordMLPackage.setFontMapper(new IdentityPlusMapper());
              org.docx4j.convert.out.pdf.PdfConversion c 
                  = new org.docx4j.convert.out.pdf.viaXSLFO.Conversion(wordMLPackage);

              OutputStream os = new java.io.FileOutputStream(fichierC.getAbsolutePath());      
              c.output(os, null);
            
      }
      
    }
    
}
