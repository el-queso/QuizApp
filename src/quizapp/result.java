/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp;

/**
 *
 * @author pantsos xenofon
 */
public class result extends javax.swing.JFrame {
int corect=0;

    public result() {
        initComponents();
    }

    result(int correct_guesses) {
        corect=correct_guesses;
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkScore = new javax.swing.JButton();
        resultText = new javax.swing.JTextField();
        playagainButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CheckWinner.png"))); // NOI18N
        checkScore.setText(" show");
        checkScore.setBorderPainted(false);
        checkScore.setContentAreaFilled(false);
        checkScore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkScoreActionPerformed(evt);
            }
        });
        getContentPane().add(checkScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 160, 190));

        resultText.setEditable(false);
        resultText.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        resultText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        resultText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        resultText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTextActionPerformed(evt);
            }
        });
        getContentPane().add(resultText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 290, -1));

        playagainButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PlayAgainArrow.png"))); // NOI18N
        playagainButton.setText("play again");
        playagainButton.setBorderPainted(false);
        playagainButton.setContentAreaFilled(false);
        playagainButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playagainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainButtonActionPerformed(evt);
            }
        });
        getContentPane().add(playagainButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 182, 161));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkScoreActionPerformed
      resultText.setText(" "+ corect+"/10");
    }//GEN-LAST:event_checkScoreActionPerformed

    private void playagainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playagainButtonActionPerformed
        this.setVisible(false);
        new categories().setVisible(true);
    }//GEN-LAST:event_playagainButtonActionPerformed

    private void resultTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTextActionPerformed

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
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton playagainButton;
    private javax.swing.JTextField resultText;
    // End of variables declaration//GEN-END:variables
}
