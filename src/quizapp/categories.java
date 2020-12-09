package quizapp;


public class categories extends javax.swing.JFrame {

    public categories() {
        initComponents();
    }
    
    int index1,index2,flag=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        geographyCheckBox = new javax.swing.JCheckBox();
        technologyCheckBox = new javax.swing.JCheckBox();
        historyCheckBox = new javax.swing.JCheckBox();
        scienceCheckBox = new javax.swing.JCheckBox();
        sportsCheckBox = new javax.swing.JCheckBox();
        musicCheckBox = new javax.swing.JCheckBox();
        gamesCheckBox = new javax.swing.JCheckBox();
        moviesCheckBox = new javax.swing.JCheckBox();
        healthCheckBox = new javax.swing.JCheckBox();
        animalsCheckBox = new javax.swing.JCheckBox();
        nextButton = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECT 2 CATEGORIES");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 360, 53));

        geographyCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        geographyCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        geographyCheckBox.setText("Geography");
        geographyCheckBox.setBorder(null);
        geographyCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geographyCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        geographyCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        geographyCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        geographyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geographyCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(geographyCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 150, 70));

        technologyCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        technologyCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        technologyCheckBox.setText("Technology");
        technologyCheckBox.setBorder(null);
        technologyCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        technologyCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        technologyCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        technologyCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        technologyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technologyCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(technologyCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 150, 70));

        historyCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        historyCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        historyCheckBox.setText("History");
        historyCheckBox.setBorder(null);
        historyCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historyCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historyCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        historyCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        historyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(historyCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 150, 70));

        scienceCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        scienceCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        scienceCheckBox.setText("Science");
        scienceCheckBox.setBorder(null);
        scienceCheckBox.setBorderPainted(true);
        scienceCheckBox.setBorderPaintedFlat(true);
        scienceCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        scienceCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scienceCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        scienceCheckBox.setIconTextGap(6);
        scienceCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        scienceCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scienceCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(scienceCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 150, 70));

        sportsCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        sportsCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        sportsCheckBox.setText("Sports");
        sportsCheckBox.setBorder(null);
        sportsCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sportsCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sportsCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sportsCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sportsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(sportsCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 150, 70));

        musicCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        musicCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        musicCheckBox.setText("Music");
        musicCheckBox.setBorder(null);
        musicCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        musicCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        musicCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        musicCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        musicCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(musicCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 70));

        gamesCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        gamesCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        gamesCheckBox.setText("Games");
        gamesCheckBox.setBorder(null);
        gamesCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gamesCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamesCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gamesCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gamesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamesCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(gamesCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 150, 70));

        moviesCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        moviesCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        moviesCheckBox.setText("Movies");
        moviesCheckBox.setBorder(null);
        moviesCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moviesCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moviesCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        moviesCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        moviesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(moviesCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 150, 70));

        healthCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        healthCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        healthCheckBox.setText("Health");
        healthCheckBox.setBorder(null);
        healthCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        healthCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        healthCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        healthCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        healthCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(healthCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 150, 70));

        animalsCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        animalsCheckBox.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        animalsCheckBox.setText("Animals");
        animalsCheckBox.setBorder(null);
        animalsCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalsCheckBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalsCheckBox.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        animalsCheckBox.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        animalsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalsCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(animalsCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 150, 70));

        nextButton.setVisible(false);
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ArrpwNext.png"))); // NOI18N
        nextButton.setText("NEXT");
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 200, 90));

        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ArrowBack.png"))); // NOI18N
        backButton1.setContentAreaFilled(false);
        backButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/6.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void healthCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthCheckBoxActionPerformed
        if (healthCheckBox.isSelected()){
            if (index1 == 0){
                index1=8;
            }
            else if(index2 == 0){
                index2=8;
            }
            flag++;
        }
        else{
            if (index1==8){
                index1=0;
            }
            else if (index2==8){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_healthCheckBoxActionPerformed

    private void scienceCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scienceCheckBoxActionPerformed
        if (scienceCheckBox.isSelected()){
            if (index1 == 0){
                index1=9;
            }
            else if(index2 == 0){
                index2=9;
            }
            flag++;
        }
        else{
            if (index1==9){
                index1=0;
            }
            else if (index2==9){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_scienceCheckBoxActionPerformed

    private void sportsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsCheckBoxActionPerformed
        if (sportsCheckBox.isSelected()){
            if (index1 == 0){
                index1=1;
            }
            else if(index2 == 0){
                index2=1;
            }
            flag++;
        }
        else{
            if (index1==1){
                index1=0;
            }
            else if (index2==1){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_sportsCheckBoxActionPerformed

    private void animalsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalsCheckBoxActionPerformed
        if (animalsCheckBox.isSelected()){
            if (index1 == 0){
                index1=2;
            }
            else if(index2 == 0){
                index2=2;
            }
            flag++;
        }
        else{
            if (index1==2){
                index1=0;
            }
            else if (index2==2){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_animalsCheckBoxActionPerformed

    private void moviesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesCheckBoxActionPerformed
        if (moviesCheckBox.isSelected()){
            if (index1 == 0){
                index1=3;
            }
            else if(index2 == 0){
                index2=3;
            }
            flag++;
        }
        else{
            if (index1==3){
                index1=0;
            }
            else if (index2==3){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_moviesCheckBoxActionPerformed

    private void geographyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geographyCheckBoxActionPerformed
        if (geographyCheckBox.isSelected()){
            if (index1 == 0){
                index1=4;
            }
            else if(index2 == 0){
                index2=4;
            }
            flag++;
        }
        else{
            if (index1==4){
                index1=0;
            }
            else if (index2==4){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_geographyCheckBoxActionPerformed

    private void musicCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicCheckBoxActionPerformed
        if (musicCheckBox.isSelected()){
           if (index1 == 0){
                index1=5;
            }
            else if(index2 == 0){
                index2=5;
            }
           flag++;
        }
        else{
            if (index1==5){
                index1=0;
            }
            else if (index2==5){
                index2=0;
            }
            flag--;
        }
       if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_musicCheckBoxActionPerformed

    private void historyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyCheckBoxActionPerformed
        if (historyCheckBox.isSelected()){
            if (index1 == 0){
                index1=6;
            }
            else if(index2 == 0){
                index2=6;
            }
            flag++;
        }
        else{
            if (index1==6){
                index1=0;
            }
            else if (index2==6){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_historyCheckBoxActionPerformed

    private void gamesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamesCheckBoxActionPerformed
        if (gamesCheckBox.isSelected()){
            if (index1 == 0){
                index1=7;
            }
            else if(index2 == 0){
                index2=7;
            }
            flag++;
        }
        else{
            if (index1==7){
                index1=0;
            }
            else if (index2==7){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_gamesCheckBoxActionPerformed

    private void technologyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technologyCheckBoxActionPerformed
        if (technologyCheckBox.isSelected()){
            if (index1 == 0){
                index1=10;
            }
            else if(index2 == 0){
                index2=10;
            }
            flag++;
        }
        else{
            if (index1==10){
                index1=0;
            }
            else if (index2==10){
                index2=0;
            }
            flag--;
        }
        if (flag==2){
            nextButton.setVisible(true);
        }
        else if (flag<2 || flag>2){
            nextButton.setVisible(false);
        }
    }//GEN-LAST:event_technologyCheckBoxActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        this.setVisible(false);
        new StrartPage().setVisible(true);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        this.setVisible(false);
        new Quiz(index1,index2).setVisible(true);
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox animalsCheckBox;
    private javax.swing.JButton backButton1;
    private javax.swing.JCheckBox gamesCheckBox;
    private javax.swing.JCheckBox geographyCheckBox;
    private javax.swing.JCheckBox healthCheckBox;
    private javax.swing.JCheckBox historyCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox moviesCheckBox;
    private javax.swing.JCheckBox musicCheckBox;
    private javax.swing.JButton nextButton;
    private javax.swing.JCheckBox scienceCheckBox;
    private javax.swing.JCheckBox sportsCheckBox;
    private javax.swing.JCheckBox technologyCheckBox;
    // End of variables declaration//GEN-END:variables
}
