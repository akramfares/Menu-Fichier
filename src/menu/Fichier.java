/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.io.File;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import java.io.FileOutputStream;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import org.jdom.input.SAXBuilder;
/**
 *
 * @author Akram Fares
 */
public class Fichier {
    boolean fichierCourant = false;
    private static String fichier;
    private String temp;
    private static Element racine = new Element("cours");
    private Element titre = new Element("titre");
    private Element intro = new Element("introduction");
    private static Document document = new Document(racine);
    private static org.jdom.Document documentLu;
    private static Element racineLu;
    
    Fichier(){
        racine.addContent(titre);
        racine.addContent(intro);
        long time = new Date().getTime();
        fichier = String.valueOf(time)+".xml";
        temp = fichier;
    }
    void init(){
        long time = new Date().getTime();
        fichier = String.valueOf(time)+".xml";
        temp = fichier;
    }
    
    void setFichier(String f){
        fichier = f;
    }
    
    void setTitre(String texte){
        titre.setText(texte);
        enregistre();
    }
    
    void setIntroduction(String texte){
        intro.setText(texte);
        enregistre();
    }
    
    void deleteTemp(){
        File file = new File(temp);
        file.delete();
    }
    
    private static void enregistre()
    {
       try
       {
          //On utilise ici un affichage classique avec getPrettyFormat()
          XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
          //Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
          //avec en argument le nom du fichier pour effectuer la sérialisation.
          FileOutputStream fout = new FileOutputStream(fichier);
          sortie.output(document, fout);
          fout.close();
       }
       catch (java.io.IOException e){}
    }
    
    private static void enregistre(String fichier)
    {
       try
       {
          //On utilise ici un affichage classique avec getPrettyFormat()
          XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
          //Remarquez qu'il suffit simplement de créer une instance de FileOutputStream
          //avec en argument le nom du fichier pour effectuer la sérialisation.
          FileOutputStream fout = new FileOutputStream(fichier);
          sortie.output(document, fout);
          fout.close();
       }
       catch (java.io.IOException e){}
    }

    void ouvrirFichier(JTextPane coursTitre,JTextPane coursIntroduction) {
      JFileChooser jfc = new JFileChooser();

      int resultat = jfc.showOpenDialog(null);
      if (resultat == JFileChooser.APPROVE_OPTION) {
            File fichierC = jfc.getSelectedFile();
            fichier = fichierC.getAbsolutePath();
            fichierCourant = true;
            //On crée une instance de SAXBuilder
              SAXBuilder sxb = new SAXBuilder();
              try
              {
                 documentLu = sxb.build(new File(fichier));
              }
              catch(Exception e){}
              racineLu = documentLu.getRootElement();
              
              coursTitre.setText(racineLu.getChild("titre").getText());
              coursIntroduction.setText(racineLu.getChild("introduction").getText());
      }
      else {
         //fichierCourant = null;
      }
   }
    
   void enregistrerFichier(){
       if(fichierCourant) enregistre();
       else{
          JFileChooser jfc = new JFileChooser();
          jfc.setDialogTitle("Enregistrer");
          jfc.setApproveButtonText("Enregistrer");
          jfc.setApproveButtonToolTipText("Enregistrer le fichier à cet emplacement");

          int resultat = jfc.showOpenDialog(null);
          if (resultat == JFileChooser.APPROVE_OPTION){
              fichierCourant = true;
              File fichierC = jfc.getSelectedFile();
              fichier = fichierC.getAbsolutePath();
              enregistre();
          }
       }
   }
   
   void enregistrerSousFichier(){
      JFileChooser jfc = new JFileChooser();
      jfc.setDialogTitle("Enregistrer-Sous");
      jfc.setApproveButtonText("Enregistrer");
      jfc.setApproveButtonToolTipText("Enregistrer le fichier à cet emplacement");

      int resultat = jfc.showOpenDialog(null);
      if (resultat == JFileChooser.APPROVE_OPTION){
          File fichierC = jfc.getSelectedFile();
          enregistre(fichierC.getAbsolutePath());
      }
       
   }
   

    
}
