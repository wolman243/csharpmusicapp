/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;

/**
 *
 * @author aemre
 */
public class playlistsViewMenu extends javax.swing.JFrame {
    
    private String createdBy;   
    private int playlistID;
    
    public playlistsViewMenu(String email) {
        initComponents();
        this.createdBy = email;
        loadPlaylists();
    }
    
    private void loadPlaylists() {
    String sql = "SELECT playlistID, playlistName FROM playlist WHERE createdBy = ?;";
    try (Connection conn = sqlConnection.getConnection()) {
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, createdBy);

        ResultSet resultSet = statement.executeQuery();
        
        JButton[] plbuttons = new JButton[3];
        plbuttons[0] = playlist1Button;
        plbuttons[1] = playlist2Button;
        plbuttons[2] = playlist3Button;
        
        for (int i = 0; i < plbuttons.length; i++)
            {
                String temp = "";
                String temp2 = "";
                if(resultSet.next())
                {
                    temp = resultSet.getString("playlistName");
                    temp2 = resultSet.getString("playlistID");
                }
                
                plbuttons[i].setText(temp2 + " - " + temp);
                
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    private int findPLID()
    {
    String sql = "SELECT playlistID, playlistName FROM playlist WHERE createdBy = ?;";
    try (Connection conn = sqlConnection.getConnection()){
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, createdBy);

        ResultSet resultSet = statement.executeQuery();
        
        if (resultSet.next()) {
            String temp3 = resultSet.getString("playlistID");
            return playlistID = Integer.parseInt(temp3);
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
        return 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        orangeBar = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        blackBar = new javax.swing.JPanel();
        homePageButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        returnPageButton = new javax.swing.JButton();
        yourPlaylistLabel = new javax.swing.JLabel();
        playlist3Button = new javax.swing.JButton();
        playlist2Button = new javax.swing.JButton();
        playlist1Button = new javax.swing.JButton();
        addPLButton = new javax.swing.JButton();
        editButton1 = new javax.swing.JButton();
        editButton2 = new javax.swing.JButton();
        editButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        orangeBar.setBackground(new java.awt.Color(255, 51, 0));

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\white-orange-logo.png"));
        logoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout orangeBarLayout = new javax.swing.GroupLayout(orangeBar);
        orangeBar.setLayout(orangeBarLayout);
        orangeBarLayout.setHorizontalGroup(
            orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangeBarLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        orangeBarLayout.setVerticalGroup(
            orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangeBarLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
        );

        blackBar.setBackground(new java.awt.Color(0, 0, 0));

        homePageButton.setBackground(new java.awt.Color(0, 0, 0));
        homePageButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\homepage.png"));
        homePageButton.setBorder(null);
        homePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\shutdown.png"));
        closeButton.setBorder(null);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        returnPageButton.setBackground(new java.awt.Color(0, 0, 0));
        returnPageButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\goback-button.png"));
        returnPageButton.setBorder(null);
        returnPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout blackBarLayout = new javax.swing.GroupLayout(blackBar);
        blackBar.setLayout(blackBarLayout);
        blackBarLayout.setHorizontalGroup(
            blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blackBarLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(returnPageButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(closeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(homePageButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        blackBarLayout.setVerticalGroup(
            blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blackBarLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        yourPlaylistLabel.setBackground(new java.awt.Color(255, 255, 255));
        yourPlaylistLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        yourPlaylistLabel.setForeground(new java.awt.Color(0, 0, 0));
        yourPlaylistLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yourPlaylistLabel.setText("Your Playlists");

        playlist3Button.setBackground(new java.awt.Color(255, 255, 255));
        playlist3Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playlist3Button.setForeground(new java.awt.Color(0, 0, 0));
        playlist3Button.setBorder(null);
        playlist3Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playlist3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist3ButtonActionPerformed(evt);
            }
        });

        playlist2Button.setBackground(new java.awt.Color(255, 255, 255));
        playlist2Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playlist2Button.setForeground(new java.awt.Color(0, 0, 0));
        playlist2Button.setBorder(null);
        playlist2Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playlist2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist2ButtonActionPerformed(evt);
            }
        });

        playlist1Button.setBackground(new java.awt.Color(255, 255, 255));
        playlist1Button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        playlist1Button.setForeground(new java.awt.Color(0, 0, 0));
        playlist1Button.setBorder(null);
        playlist1Button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        playlist1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist1ButtonActionPerformed(evt);
            }
        });

        addPLButton.setBackground(new java.awt.Color(255, 255, 255));
        addPLButton.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        addPLButton.setForeground(new java.awt.Color(0, 0, 0));
        addPLButton.setText("ADD PLAYLIST");
        addPLButton.setBorder(null);
        addPLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButtonActionPerformed(evt);
            }
        });

        editButton1.setBackground(new java.awt.Color(0, 0, 0));
        editButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\edit.png")
        );
        editButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButton1ActionPerformed(evt);
            }
        });

        editButton2.setBackground(new java.awt.Color(0, 0, 0));
        editButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\edit.png")
        );

        editButton3.setBackground(new java.awt.Color(0, 0, 0));
        editButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\edit.png")
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(orangeBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playlist1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yourPlaylistLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(playlist2Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addPLButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playlist3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(editButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(editButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(blackBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orangeBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(blackBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(yourPlaylistLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playlist1Button, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playlist2Button, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playlist3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(315, 315, 315)
                .addComponent(addPLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageButtonActionPerformed
        new mainMenu(createdBy).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homePageButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void returnPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageButtonActionPerformed
        new mainMenu(createdBy).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnPageButtonActionPerformed

    private void playlist1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist1ButtonActionPerformed
        playlistID = 1;
        new playlistMenu(createdBy,playlistID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playlist1ButtonActionPerformed

    private void addPLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButtonActionPerformed
        new creatingPlaylistMenu(createdBy).setVisible(true);
    }//GEN-LAST:event_addPLButtonActionPerformed

    private void playlist2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist2ButtonActionPerformed
        playlistID = 2;
        new playlistMenu(createdBy,playlistID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playlist2ButtonActionPerformed

    private void playlist3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist3ButtonActionPerformed
        playlistID = 3;
        new playlistMenu(createdBy,playlistID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_playlist3ButtonActionPerformed

    private void editButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButton1ActionPerformed
        playlistID = 1;
        new editPlaylistMenu(createdBy, playlistID).setVisible(true);
    }//GEN-LAST:event_editButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(playlistsViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playlistsViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playlistsViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playlistsViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playlistsViewMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPLButton;
    private javax.swing.JPanel background;
    private javax.swing.JPanel blackBar;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton editButton1;
    private javax.swing.JButton editButton2;
    private javax.swing.JButton editButton3;
    private javax.swing.JButton homePageButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel orangeBar;
    private javax.swing.JButton playlist1Button;
    private javax.swing.JButton playlist2Button;
    private javax.swing.JButton playlist3Button;
    private javax.swing.JButton returnPageButton;
    private javax.swing.JLabel yourPlaylistLabel;
    // End of variables declaration//GEN-END:variables
}
