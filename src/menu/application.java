/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * application.java
 *
 * Created on 13 févr. 2012, 12:16:58
 */
package menu;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;

/**
 *
 * @author khalid
 */

public class application extends javax.swing.JFrame {
    Fichier f = new Fichier();
    /** Creates new form application */
    public application() {
        initComponents();
        
        
        //scrollIntro.setViewportView(coursIntroduction);
        panelCours.setVisible(false);
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCours = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursTitre = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scrollIntro = new javax.swing.JScrollPane();
        coursIntroduction = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuNouveauCours = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        menuOuvrir = new javax.swing.JMenuItem();
        menuEnregistrer = new javax.swing.JMenuItem();
        menuEnregistrerSous = new javax.swing.JMenuItem();
        menuImprimer = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuExporter = new javax.swing.JMenuItem();
        html = new javax.swing.JMenuItem();
        pdf = new javax.swing.JMenuItem();
        menuQuitter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editeur Sémantique");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        coursTitre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        coursTitre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                coursTitreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                coursTitreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                coursTitreKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(coursTitre);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Titre : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Introduction : ");

        coursIntroduction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                coursIntroductionKeyReleased(evt);
            }
        });
        scrollIntro.setViewportView(coursIntroduction);

        javax.swing.GroupLayout panelCoursLayout = new javax.swing.GroupLayout(panelCours);
        panelCours.setLayout(panelCoursLayout);
        panelCoursLayout.setHorizontalGroup(
            panelCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoursLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(53, 53, 53)
                .addGroup(panelCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollIntro)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelCoursLayout.setVerticalGroup(
            panelCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCoursLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCoursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(scrollIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(779, 779, 779))
        );

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("Fichier");

        jMenu3.setText("Nouveau");

        menuNouveauCours.setText("cours                                 ");
        menuNouveauCours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNouveauCoursActionPerformed(evt);
            }
        });
        jMenu3.add(menuNouveauCours);

        jMenu5.setText("Exercice");

        jMenuItem2.setText("Execice de closure");
        jMenu5.add(jMenuItem2);

        jMenuItem9.setText("QCM");
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Phtase en désordre");
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Mots Croisés");
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Metre en Relation");
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Quiz à Plusieurs Reponses correctes");
        jMenu5.add(jMenuItem13);

        jMenu3.add(jMenu5);

        jMenu1.add(jMenu3);

        menuOuvrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOuvrir.setBackground(new java.awt.Color(51, 51, 51));
        menuOuvrir.setText("Ouvrir      ");
        menuOuvrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOuvrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuOuvrir);

        menuEnregistrer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuEnregistrer.setText("Enregistrer");
        menuEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEnregistrerActionPerformed(evt);
            }
        });
        jMenu1.add(menuEnregistrer);

        menuEnregistrerSous.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuEnregistrerSous.setText("Enregistrer-sous");
        menuEnregistrerSous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEnregistrerSousActionPerformed(evt);
            }
        });
        jMenu1.add(menuEnregistrerSous);

        menuImprimer.setText("Imprimer");
        menuImprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuImprimerActionPerformed(evt);
            }
        });
        jMenu1.add(menuImprimer);

        jMenu4.setText("Exporter");

        menuExporter.setText("Word");
        menuExporter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExporterActionPerformed(evt);
            }
        });
        jMenu4.add(menuExporter);

        html.setText("HTML");
        html.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htmlActionPerformed(evt);
            }
        });
        jMenu4.add(html);

        pdf.setText("Pdf");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        jMenu4.add(pdf);

        jMenu1.add(jMenu4);

        menuQuitter.setText("Quitter");
        jMenu1.add(menuQuitter);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCours, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCours, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void menuOuvrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOuvrirActionPerformed
    panelCours.setVisible(true);
    f.ouvrirFichier(coursTitre, coursIntroduction);
}//GEN-LAST:event_menuOuvrirActionPerformed

private void coursTitreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coursTitreKeyPressed
                  
      
}//GEN-LAST:event_coursTitreKeyPressed

private void coursTitreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coursTitreKeyTyped

}//GEN-LAST:event_coursTitreKeyTyped

private void coursTitreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coursTitreKeyReleased
    f.setTitre(coursTitre.getText());
}//GEN-LAST:event_coursTitreKeyReleased

private void menuNouveauCoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNouveauCoursActionPerformed
      f.init();
      panelCours.setVisible(true);
      coursTitre.setText("");
      coursIntroduction.setText("");
      
}//GEN-LAST:event_menuNouveauCoursActionPerformed

private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

}//GEN-LAST:event_formWindowClosed

private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      f.deleteTemp();
}//GEN-LAST:event_formWindowClosing

private void menuEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEnregistrerActionPerformed
    f.enregistrerFichier();
}//GEN-LAST:event_menuEnregistrerActionPerformed

private void menuEnregistrerSousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEnregistrerSousActionPerformed
    f.enregistrerSousFichier();
}//GEN-LAST:event_menuEnregistrerSousActionPerformed

private void menuExporterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExporterActionPerformed
        try {
            Impression i = new Impression();
            i.imprimerDocx(coursTitre.getText(), coursIntroduction.getText());
        } catch (Exception ex) {
            Logger.getLogger(application.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
}//GEN-LAST:event_menuExporterActionPerformed

private void coursIntroductionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coursIntroductionKeyReleased
       f.setIntroduction(coursIntroduction.getText());
}//GEN-LAST:event_coursIntroductionKeyReleased

private void htmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htmlActionPerformed
    try {
            Impression i = new Impression();
            i.imprimerHTML(coursTitre.getText(), coursIntroduction.getText());
        } catch (Exception ex) {
            Logger.getLogger(application.class.getName()).log(Level.SEVERE, null, ex);
        } 
}//GEN-LAST:event_htmlActionPerformed

private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
    try {
            Impression i = new Impression();
            i.imprimerPdf(coursTitre.getText(), coursIntroduction.getText());
        } catch (Exception ex) {
            Logger.getLogger(application.class.getName()).log(Level.SEVERE, null, ex);
        } 
}//GEN-LAST:event_pdfActionPerformed

private void menuImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuImprimerActionPerformed
        JTextPane txt = new JTextPane();
        txt.setText(coursTitre.getText()+ coursIntroduction.getText());
        Impression i = new Impression();
        i.imprimer(txt);
}//GEN-LAST:event_menuImprimerActionPerformed


    /**
     * @param args the command line arguments
     */
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new application().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane coursIntroduction;
    private javax.swing.JTextPane coursTitre;
    private javax.swing.JMenuItem html;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuEnregistrer;
    private javax.swing.JMenuItem menuEnregistrerSous;
    private javax.swing.JMenuItem menuExporter;
    private javax.swing.JMenuItem menuImprimer;
    private javax.swing.JMenuItem menuNouveauCours;
    private javax.swing.JMenuItem menuOuvrir;
    private javax.swing.JMenuItem menuQuitter;
    private javax.swing.JPanel panelCours;
    private javax.swing.JMenuItem pdf;
    private javax.swing.JScrollPane scrollIntro;
    // End of variables declaration//GEN-END:variables
}
