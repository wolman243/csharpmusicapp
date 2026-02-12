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

/**
 *
 * @author aemre
 */
public class playlistMenu extends javax.swing.JFrame {
    private String email;
    private String filepath;
    private String imagefilepath;
    private int playlistID;
    private String songName;
    
    ArrayList<String> songNames = new ArrayList<>();
    
    public playlistMenu(String email, int playlistID) {
        initComponents();
        this.email = email;
        this.playlistID = playlistID;
        loadSongs();
        setName();
    }
    
    public void setName()
    {
        try (Connection conn = sqlConnection.getConnection())
        {
            String sql = "SELECT playlistName FROM playlist WHERE createdBy = ? AND playlistID = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, email);
            statement.setInt(2, playlistID);

            ResultSet resultSet = statement.executeQuery();
            
            String playlistName = "";
            
            if(resultSet.next())
            {
                playlistName = resultSet.getString("playlistName");
            }
            playlistNameLabel.setText(playlistName);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void loadSongs()
    {
        try (Connection conn = sqlConnection.getConnection()) {
            String sql = "SELECT songName, artistName FROM playlistcontent, artist WHERE artist.artistID = playlistcontent.artistID AND playlist = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, playlistID);

            ResultSet resultSet = statement.executeQuery();
            
            
                
            JButton[] buttons = new JButton[16];
            buttons[0] = songButton1;
            buttons[1] = songButton2;
            buttons[2] = songButton3;
            buttons[3] = songButton4;
            buttons[4] = songButton5;
            buttons[5] = songButton6;
            buttons[6] = songButton7;
            buttons[7] = songButton8;
            buttons[8] = songButton9;
            buttons[9] = songButton10;
            buttons[10] = songButton11;
            buttons[11] = songButton12;
            buttons[12] = songButton13;
            buttons[13] = songButton14;
            buttons[14] = songButton15;
            buttons[15] = songButton16;
            
            for (int i = 0; i < buttons.length; i++)
            {
                String temp = "";
                String temp2 = "";
                if(resultSet.next())
                {
                    temp = resultSet.getString("songName");
                    temp2 = resultSet.getString("artistName");
                }
                
                buttons[i].setText(temp2 + " - " + temp);
                songNames.add(temp);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orangeBar = new javax.swing.JPanel();
        whiteBar = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        blackBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        returnPageButton = new javax.swing.JButton();
        homePageButton = new javax.swing.JButton();
        playlistNameLabel = new javax.swing.JLabel();
        songButton1 = new javax.swing.JButton();
        songButton2 = new javax.swing.JButton();
        songButton3 = new javax.swing.JButton();
        songButton4 = new javax.swing.JButton();
        songButton5 = new javax.swing.JButton();
        songButton6 = new javax.swing.JButton();
        songButton7 = new javax.swing.JButton();
        songButton8 = new javax.swing.JButton();
        songButton9 = new javax.swing.JButton();
        songButton10 = new javax.swing.JButton();
        songButton11 = new javax.swing.JButton();
        songButton12 = new javax.swing.JButton();
        songButton13 = new javax.swing.JButton();
        songButton14 = new javax.swing.JButton();
        songButton15 = new javax.swing.JButton();
        songButton16 = new javax.swing.JButton();
        deleteFromPLButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orangeBar.setBackground(new java.awt.Color(255, 102, 0));

        whiteBar.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\orange-logo.png"));

        javax.swing.GroupLayout whiteBarLayout = new javax.swing.GroupLayout(whiteBar);
        whiteBar.setLayout(whiteBarLayout);
        whiteBarLayout.setHorizontalGroup(
            whiteBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteBarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        whiteBarLayout.setVerticalGroup(
            whiteBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteBarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        blackBar.setBackground(new java.awt.Color(0, 0, 0));

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\shutdown.png"));
        closeButton.setBorder(null);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        returnPageButton.setBackground(new java.awt.Color(0, 0, 0));
        returnPageButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\homepage.png"));
        returnPageButton.setBorder(null);
        returnPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageButtonActionPerformed(evt);
            }
        });

        homePageButton.setBackground(new java.awt.Color(0, 0, 0));
        homePageButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\goback-button.png"));
        homePageButton.setBorder(null);
        homePageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout blackBarLayout = new javax.swing.GroupLayout(blackBar);
        blackBar.setLayout(blackBarLayout);
        blackBarLayout.setHorizontalGroup(
            blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blackBarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        blackBarLayout.setVerticalGroup(
            blackBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blackBarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playlistNameLabel.setBackground(new java.awt.Color(255, 102, 0));
        playlistNameLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 3, 48)); // NOI18N
        playlistNameLabel.setForeground(new java.awt.Color(0, 0, 0));

        songButton1.setBackground(new java.awt.Color(0, 0, 0));
        songButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton1.setForeground(new java.awt.Color(204, 204, 204));
        songButton1.setBorder(null);
        songButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton1ActionPerformed(evt);
            }
        });

        songButton2.setBackground(new java.awt.Color(0, 0, 0));
        songButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton2.setForeground(new java.awt.Color(204, 204, 204));
        songButton2.setBorder(null);
        songButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton2ActionPerformed(evt);
            }
        });

        songButton3.setBackground(new java.awt.Color(0, 0, 0));
        songButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton3.setForeground(new java.awt.Color(204, 204, 204));
        songButton3.setBorder(null);
        songButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton3ActionPerformed(evt);
            }
        });

        songButton4.setBackground(new java.awt.Color(0, 0, 0));
        songButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton4.setForeground(new java.awt.Color(204, 204, 204));
        songButton4.setBorder(null);
        songButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton4ActionPerformed(evt);
            }
        });

        songButton5.setBackground(new java.awt.Color(0, 0, 0));
        songButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton5.setForeground(new java.awt.Color(204, 204, 204));
        songButton5.setBorder(null);
        songButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton5ActionPerformed(evt);
            }
        });

        songButton6.setBackground(new java.awt.Color(0, 0, 0));
        songButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton6.setForeground(new java.awt.Color(204, 204, 204));
        songButton6.setBorder(null);
        songButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton6ActionPerformed(evt);
            }
        });

        songButton7.setBackground(new java.awt.Color(0, 0, 0));
        songButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton7.setForeground(new java.awt.Color(204, 204, 204));
        songButton7.setBorder(null);
        songButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton7ActionPerformed(evt);
            }
        });

        songButton8.setBackground(new java.awt.Color(0, 0, 0));
        songButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton8.setForeground(new java.awt.Color(204, 204, 204));
        songButton8.setBorder(null);
        songButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton8ActionPerformed(evt);
            }
        });

        songButton9.setBackground(new java.awt.Color(0, 0, 0));
        songButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton9.setForeground(new java.awt.Color(204, 204, 204));
        songButton9.setBorder(null);
        songButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton9ActionPerformed(evt);
            }
        });

        songButton10.setBackground(new java.awt.Color(0, 0, 0));
        songButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton10.setForeground(new java.awt.Color(204, 204, 204));
        songButton10.setBorder(null);
        songButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton10ActionPerformed(evt);
            }
        });

        songButton11.setBackground(new java.awt.Color(0, 0, 0));
        songButton11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton11.setForeground(new java.awt.Color(204, 204, 204));
        songButton11.setBorder(null);
        songButton11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton11ActionPerformed(evt);
            }
        });

        songButton12.setBackground(new java.awt.Color(0, 0, 0));
        songButton12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton12.setForeground(new java.awt.Color(204, 204, 204));
        songButton12.setBorder(null);
        songButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton12ActionPerformed(evt);
            }
        });

        songButton13.setBackground(new java.awt.Color(0, 0, 0));
        songButton13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton13.setForeground(new java.awt.Color(204, 204, 204));
        songButton13.setBorder(null);
        songButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton13ActionPerformed(evt);
            }
        });

        songButton14.setBackground(new java.awt.Color(0, 0, 0));
        songButton14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton14.setForeground(new java.awt.Color(204, 204, 204));
        songButton14.setBorder(null);
        songButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton14ActionPerformed(evt);
            }
        });

        songButton15.setBackground(new java.awt.Color(0, 0, 0));
        songButton15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton15.setForeground(new java.awt.Color(204, 204, 204));
        songButton15.setBorder(null);
        songButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton15ActionPerformed(evt);
            }
        });

        songButton16.setBackground(new java.awt.Color(0, 0, 0));
        songButton16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        songButton16.setForeground(new java.awt.Color(204, 204, 204));
        songButton16.setBorder(null);
        songButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songButton16ActionPerformed(evt);
            }
        });

        deleteFromPLButton.setBackground(new java.awt.Color(0, 0, 0));
        deleteFromPLButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        deleteFromPLButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteFromPLButton.setText("DELETE FROM PLAYLIST");
        deleteFromPLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFromPLButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout orangeBarLayout = new javax.swing.GroupLayout(orangeBar);
        orangeBar.setLayout(orangeBarLayout);
        orangeBarLayout.setHorizontalGroup(
            orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangeBarLayout.createSequentialGroup()
                .addComponent(whiteBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orangeBarLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orangeBarLayout.createSequentialGroup()
                                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(songButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(songButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(songButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                            .addGroup(orangeBarLayout.createSequentialGroup()
                                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orangeBarLayout.createSequentialGroup()
                                        .addComponent(playlistNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(85, 85, 85))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, orangeBarLayout.createSequentialGroup()
                                        .addComponent(songButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(songButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangeBarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteFromPLButton, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)))
                .addComponent(blackBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        orangeBarLayout.setVerticalGroup(
            orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(whiteBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(blackBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(orangeBarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(playlistNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(orangeBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteFromPLButton, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orangeBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orangeBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void returnPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageButtonActionPerformed
        new playlistsViewMenu(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnPageButtonActionPerformed

    private void homePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageButtonActionPerformed
        new playlistsViewMenu(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homePageButtonActionPerformed

    private void songButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton1ActionPerformed
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_songButton1ActionPerformed

    private void songButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton2ActionPerformed

    private void songButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton3ActionPerformed

    private void songButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton4ActionPerformed

    private void songButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton5ActionPerformed

    private void songButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton6ActionPerformed

    private void songButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton7ActionPerformed

    private void songButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton8ActionPerformed

    private void songButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton9ActionPerformed

    private void songButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton10ActionPerformed

    private void songButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton11ActionPerformed

    private void songButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton12ActionPerformed

    private void songButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton13ActionPerformed

    private void songButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton14ActionPerformed

    private void songButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton15ActionPerformed

    private void songButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songButton16ActionPerformed

    private void deleteFromPLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFromPLButtonActionPerformed
        new deletingMenu(email, playlistID).setVisible(true);
    }//GEN-LAST:event_deleteFromPLButtonActionPerformed

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
            java.util.logging.Logger.getLogger(playlistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playlistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playlistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playlistMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playlistMenu(null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blackBar;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteFromPLButton;
    private javax.swing.JButton homePageButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel orangeBar;
    private javax.swing.JLabel playlistNameLabel;
    private javax.swing.JButton returnPageButton;
    private javax.swing.JButton songButton1;
    private javax.swing.JButton songButton10;
    private javax.swing.JButton songButton11;
    private javax.swing.JButton songButton12;
    private javax.swing.JButton songButton13;
    private javax.swing.JButton songButton14;
    private javax.swing.JButton songButton15;
    private javax.swing.JButton songButton16;
    private javax.swing.JButton songButton2;
    private javax.swing.JButton songButton3;
    private javax.swing.JButton songButton4;
    private javax.swing.JButton songButton5;
    private javax.swing.JButton songButton6;
    private javax.swing.JButton songButton7;
    private javax.swing.JButton songButton8;
    private javax.swing.JButton songButton9;
    private javax.swing.JPanel whiteBar;
    // End of variables declaration//GEN-END:variables
}
