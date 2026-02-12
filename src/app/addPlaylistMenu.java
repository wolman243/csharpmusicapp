/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author aemre
 */
public class addPlaylistMenu extends javax.swing.JFrame {
    
    private String email;
    private String songName;
    private int songID;
    private int S_albumID;
    private int ownerID;
    ArrayList<Playlist> playlists = new ArrayList<>();
    ArrayList<Song> songs = new ArrayList<>();
    ArrayList<Album> albums = new ArrayList<>();
    ArrayList<Artist> artists = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
        
    public addPlaylistMenu(String email, String songName, int songID, int S_albumID, int ownerID) {
        initComponents();
        this.songName = songName;
        this.email = email;
        this.songID = songID;
        this.S_albumID = S_albumID;
        this.ownerID = ownerID;
        loadPlaylists();
    }
    
    private void createArrays()
    {
        try(Connection conn = sqlConnection.getConnection())
        {
            String sql = "SELECT * FROM playlist;";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int playlistID = resultSet.getInt("playlistID");
                String playlistName = resultSet.getString("playlistName");
                String createdBy = resultSet.getString("createdBy");

                Playlist pl = new Playlist(playlistID, playlistName, createdBy);
                
                playlists.add(pl);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try(Connection conn = sqlConnection.getConnection())
        {
            String sql = "SELECT * FROM song;";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int songID = resultSet.getInt("songID");
                String title = resultSet.getString("title");
                int S_albumID = resultSet.getInt("S_albumID");
                int ownerID = resultSet.getInt("ownerID");
                
                
                Song s = new Song(songID, title, S_albumID, ownerID);
                
                songs.add(s);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try(Connection conn = sqlConnection.getConnection())
        {
            String sql = "SELECT * FROM album;";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int albumID = resultSet.getInt("albumID");
                String albumName = resultSet.getString("albumName");
                String releaseDate = resultSet.getString("releaseDate");
                String type = resultSet.getString("type");
                int albumOwner = resultSet.getInt("albumOwner");
                
                
                Album al = new Album(albumID, albumName, releaseDate, type, albumOwner);
                
                albums.add(al);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try(Connection conn = sqlConnection.getConnection())
        {
            String sql = "SELECT * FROM artist;";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int artistID = resultSet.getInt("artistID");
                String artistName = resultSet.getString("artistName");
                
                Artist a = new Artist(artistID, artistName);
                
                artists.add(a);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        try(Connection conn = sqlConnection.getConnection())
        {
            String sql = "SELECT * FROM User;";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                String email = resultSet.getString("email");
                String profileName = resultSet.getString("profileName");
                String password = resultSet.getString("password");
                
                
                User u = new User(email, profileName, password);
                
                users.add(u);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    private void addSongToPlaylist(String playlistName, String songName) {
        createArrays();
        String sql = "SELECT * FROM song WHERE title = ?";
        try (Connection conn = sqlConnection.getConnection())
        {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, songName);
            
            statement.executeUpdate();
            statement.close();
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error songName to playlist: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addPLButton1 = new javax.swing.JButton();
        addPLButton3 = new javax.swing.JButton();
        addPLButton2 = new javax.swing.JButton();
        returnPageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setBackground(new java.awt.Color(255, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Which playlist you want to add");

        addPLButton1.setBackground(new java.awt.Color(255, 51, 0));
        addPLButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addPLButton1.setForeground(new java.awt.Color(255, 255, 255));
        addPLButton1.setBorder(null);
        addPLButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton1ActionPerformed(evt);
            }
        });

        addPLButton3.setBackground(new java.awt.Color(255, 51, 0));
        addPLButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addPLButton3.setForeground(new java.awt.Color(255, 255, 255));
        addPLButton3.setBorder(null);
        addPLButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton3ActionPerformed(evt);
            }
        });

        addPLButton2.setBackground(new java.awt.Color(255, 51, 0));
        addPLButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addPLButton2.setForeground(new java.awt.Color(255, 255, 255));
        addPLButton2.setBorder(null);
        addPLButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton2ActionPerformed(evt);
            }
        });

        returnPageButton.setBackground(new java.awt.Color(255, 51, 0));
        returnPageButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\goback-button.png"));
        returnPageButton.setBorder(null);
        returnPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPLButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPLButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPLButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(returnPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPLButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPLButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addPLButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(returnPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void addPLButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton1ActionPerformed
        String sql2 = "INSERT INTO playlistcontent (playlist, song, songName, creator, albumID, artistID) VALUES (?, ?, ?, ?, ?, ?);";
        try (Connection conn = sqlConnection.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(sql2);
            statement.setInt(1, 1);
            statement.setInt(2, songID);
            statement.setString(3, songName);
            statement.setString(4, email);
            statement.setInt(5, S_albumID);
            statement.setInt(6, ownerID);
            
            statement.executeUpdate();
            statement.close();

            JOptionPane.showMessageDialog(this, "Song added to playlist successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding song to playlist: " + e.getMessage());
        }
    }//GEN-LAST:event_addPLButton1ActionPerformed

    private void returnPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_returnPageButtonActionPerformed

    private void addPLButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton2ActionPerformed
        String sql2 = "INSERT INTO playlistcontent (playlist, song, songName, creator, albumID, artistID) VALUES (?, ?, ?, ?, ?, ?);";
        try (Connection conn = sqlConnection.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(sql2);
            statement.setInt(1, 2);
            statement.setInt(2, songID);
            statement.setString(3, songName);
            statement.setString(4, email);
            statement.setInt(5, S_albumID);
            statement.setInt(6, ownerID);
            
            statement.executeUpdate();
            statement.close();

            JOptionPane.showMessageDialog(this, "Song added to playlist successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding song to playlist: " + e.getMessage());
        }
    }//GEN-LAST:event_addPLButton2ActionPerformed

    private void addPLButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton3ActionPerformed
        String sql2 = "INSERT INTO playlistcontent (playlist, song, songName, creator, albumID, artistID) VALUES (?, ?, ?, ?, ?, ?);";
        try (Connection conn = sqlConnection.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(sql2);
            statement.setInt(1, 3);
            statement.setInt(2, songID);
            statement.setString(3, songName);
            statement.setString(4, email);
            statement.setInt(5, S_albumID);
            statement.setInt(6, ownerID);
            
            statement.executeUpdate();
            statement.close();

            JOptionPane.showMessageDialog(this, "Song added to playlist successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding song to playlist: " + e.getMessage());
        }
    }//GEN-LAST:event_addPLButton3ActionPerformed

   private void loadPlaylists() {
    String sql = "SELECT playlistName FROM playlist WHERE createdBy = ?;";
    try (Connection conn = sqlConnection.getConnection()) {
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, email); // Set the email parameter

        ResultSet resultSet = statement.executeQuery();
        
        JButton[] addplbuttons = new JButton[3];
        addplbuttons[0] = addPLButton1;
        addplbuttons[1] = addPLButton2;
        addplbuttons[2] = addPLButton3;
        
        for (int i = 0; i < addplbuttons.length; i++)
            {
                String temp = "";
                if(resultSet.next())
                {
                    temp = resultSet.getString("playlistName");
                }
                
                addplbuttons[i].setText(temp);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
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
            java.util.logging.Logger.getLogger(addPlaylistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addPlaylistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addPlaylistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addPlaylistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPlaylistMenu(null, null, 0, 0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPLButton1;
    private javax.swing.JButton addPLButton2;
    private javax.swing.JButton addPLButton3;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton returnPageButton;
    // End of variables declaration//GEN-END:variables
}
