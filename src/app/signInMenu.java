/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aemre
 */
public class signInMenu extends javax.swing.JFrame {

    /**
     * Creates new form signInMenu
     */
    public signInMenu() {
        initComponents();
    }

    public String getEmail()
    {
        return jMailField.getText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blackBar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jMailField = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        signInLabel = new javax.swing.JLabel();
        returnBackButton = new javax.swing.JButton();
        clickSignInButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        blackBar.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jMailField.setBackground(new java.awt.Color(255, 255, 255));
        jMailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMailField.setForeground(new java.awt.Color(0, 0, 0));
        jMailField.setText("aemre.beldag@tedu.edu.tr");
        jMailField.setBorder(null);
        jMailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMailFieldActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setText("beldag06ankara");
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        signInLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        signInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInLabel.setText("Sign In");

        returnBackButton.setBackground(new java.awt.Color(255, 51, 0));
        returnBackButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        returnBackButton.setText("Return Back");
        returnBackButton.setBorder(null);
        returnBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBackButtonActionPerformed(evt);
            }
        });

        clickSignInButton.setBackground(new java.awt.Color(255, 51, 0));
        clickSignInButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        clickSignInButton.setText("Click to Sign in");
        clickSignInButton.setBorder(null);
        clickSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSignInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clickSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMailField, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(signInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jMailField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clickSignInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\orange-logo.png"));

        javax.swing.GroupLayout blackBarLayout = new javax.swing.GroupLayout(blackBar);
        blackBar.setLayout(blackBarLayout);
        blackBarLayout.setHorizontalGroup(
            blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blackBarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        blackBarLayout.setVerticalGroup(
            blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(blackBarLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blackBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(blackBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBackButtonActionPerformed
        new loginMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnBackButtonActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void clickSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSignInButtonActionPerformed
        String email = jMailField.getText();
        String password  = new String(jPasswordField1.getPassword());
     
        if (email.isEmpty() || password.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
            return;
        }
        
        try (Connection conn = sqlConnection.getConnection())
        {
            String sql =  "SELECT * FROM user WHERE email = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, password);
            
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next())
            {
                JOptionPane.showMessageDialog(this, "Sign in successfull!");
                new mainMenu(email).setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Your email or password is incorrect!");
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_clickSignInButtonActionPerformed

    private void jMailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMailFieldActionPerformed
        
    }//GEN-LAST:event_jMailFieldActionPerformed

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
            java.util.logging.Logger.getLogger(signInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signInMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signInMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blackBar;
    private javax.swing.JButton clickSignInButton;
    private javax.swing.JTextField jMailField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton returnBackButton;
    private javax.swing.JLabel signInLabel;
    // End of variables declaration//GEN-END:variables
}
