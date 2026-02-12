/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import javax.swing.ImageIcon;

/**
 *
 * @author aemre
 */
public class songPlayerWindow extends javax.swing.JFrame {

    private String email;
    private String imagefilepath;
    private String songName;
    
    public songPlayerWindow(String email, String filepath, String imagefilepath, String songName) {
        initComponents();
        this.email = email;
        this.imagefilepath = imagefilepath;
        this.songName = songName;
        iconLabel.setIcon(new ImageIcon(imagefilepath)); 
        songNameLabel.setText(songName);
        player.loadMusic(filepath);
    }
    
    static musicPlayerClass player = musicPlayerClass.getInstance();
    static long clipTimePosition;     
    
    static boolean isPlaying = true;
    static boolean isLooping = false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        pauseButton = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        homePageButton = new javax.swing.JButton();
        songNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.controlDkShadow);

        playButton.setBackground(java.awt.SystemColor.controlDkShadow);
        playButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\playbutton.png"));
        playButton.setBorder(null);
        playButton.setMaximumSize(new java.awt.Dimension(64, 64));
        playButton.setMinimumSize(new java.awt.Dimension(64, 64));
        playButton.setPreferredSize(new java.awt.Dimension(64, 64));
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        pauseButton.setBackground(java.awt.SystemColor.controlDkShadow);
        pauseButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\pause.png"));
        pauseButton.setBorder(null);
        pauseButton.setMaximumSize(new java.awt.Dimension(64, 64));
        pauseButton.setMinimumSize(new java.awt.Dimension(64, 64));
        pauseButton.setPreferredSize(new java.awt.Dimension(64, 64));
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        homePageButton.setBackground(java.awt.SystemColor.controlDkShadow);
        homePageButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\goback-button.png"));
        homePageButton.setBorder(null);
        homePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageButtonActionPerformed(evt);
            }
        });

        songNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        songNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        songNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songNameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(songNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(95, 95, 95)
                                .addComponent(pauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(songNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pauseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        player.clip.setMicrosecondPosition(0);
        clipTimePosition = 0;
        player.clip.start();
    }//GEN-LAST:event_playButtonActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        if(isPlaying)
        {
            clipTimePosition = player.clip.getMicrosecondPosition();
            player.clip.stop();
        }
        else
        {
            player.clip.setMicrosecondPosition(clipTimePosition);
            player.clip.start();
        }
        
        isPlaying = !isPlaying;
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void homePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageButtonActionPerformed
        player.clip.stop();
        this.dispose();
    }//GEN-LAST:event_homePageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(songPlayerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(songPlayerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(songPlayerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(songPlayerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new songPlayerWindow(null, null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homePageButton;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel songNameLabel;
    // End of variables declaration//GEN-END:variables
}
