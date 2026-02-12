/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;

public class songsView extends javax.swing.JFrame {
    
    private DefaultListModel<String> songListModel;
    private JList<String> songList;
    private Connection connection;
    private String email;
    private String[] songNames = new String[16];
    private String filepath;
    private String imagefilepath;
    private String songName;
    
    public songsView(String email) {
        initComponents();
        this.email = email;
        loadSongs();
    }

      private void loadSongs() {
        try (Connection conn = sqlConnection.getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT songID, artistName, title FROM song, artist WHERE artistID = ownerID");
                
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
                    temp = resultSet.getString("title");
                    temp2 = resultSet.getString("artistName");
                }
                
                buttons[i].setText(temp2 + " - " + temp);
                songNames[i] = temp;
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

        background = new javax.swing.JPanel();
        orangeBar = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        homePageButton = new javax.swing.JButton();
        returnPageButton = new javax.swing.JButton();
        songsLabel = new javax.swing.JLabel();
        songButton1 = new javax.swing.JButton();
        songButton3 = new javax.swing.JButton();
        songButton4 = new javax.swing.JButton();
        songButton5 = new javax.swing.JButton();
        songButton2 = new javax.swing.JButton();
        songButton7 = new javax.swing.JButton();
        songButton8 = new javax.swing.JButton();
        songButton9 = new javax.swing.JButton();
        songButton10 = new javax.swing.JButton();
        songButton6 = new javax.swing.JButton();
        addPLButton1 = new javax.swing.JButton();
        addPLButton3 = new javax.swing.JButton();
        addPLButton2 = new javax.swing.JButton();
        addPLButton7 = new javax.swing.JButton();
        addPLButton4 = new javax.swing.JButton();
        addPLButton5 = new javax.swing.JButton();
        addPLButton8 = new javax.swing.JButton();
        addPLButton6 = new javax.swing.JButton();
        addPLButton10 = new javax.swing.JButton();
        addPLButton9 = new javax.swing.JButton();
        songButton11 = new javax.swing.JButton();
        songButton12 = new javax.swing.JButton();
        songButton13 = new javax.swing.JButton();
        songButton14 = new javax.swing.JButton();
        songButton15 = new javax.swing.JButton();
        songButton16 = new javax.swing.JButton();
        addPLButton11 = new javax.swing.JButton();
        addPLButton12 = new javax.swing.JButton();
        addPLButton13 = new javax.swing.JButton();
        addPLButton14 = new javax.swing.JButton();
        addPLButton15 = new javax.swing.JButton();
        addPLButton16 = new javax.swing.JButton();

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
                .addContainerGap(423, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\shutdown.png"));
        closeButton.setBorder(null);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
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

        returnPageButton.setBackground(new java.awt.Color(0, 0, 0));
        returnPageButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\homepage.png"));
        returnPageButton.setBorder(null);
        returnPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnPageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(returnPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(returnPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homePageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        songsLabel.setBackground(new java.awt.Color(255, 255, 255));
        songsLabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        songsLabel.setForeground(new java.awt.Color(0, 0, 0));
        songsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        songsLabel.setText("Songs");
        songsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

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

        addPLButton1.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton1.setText("+");
        addPLButton1.setBorder(null);
        addPLButton1.setBorderPainted(false);
        addPLButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addPLButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton1ActionPerformed(evt);
            }
        });

        addPLButton3.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton3.setText("+");
        addPLButton3.setBorder(null);
        addPLButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton3ActionPerformed(evt);
            }
        });

        addPLButton2.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton2.setText("+");
        addPLButton2.setBorder(null);
        addPLButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton2ActionPerformed(evt);
            }
        });

        addPLButton7.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton7.setText("+");
        addPLButton7.setBorder(null);
        addPLButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton7ActionPerformed(evt);
            }
        });

        addPLButton4.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton4.setText("+");
        addPLButton4.setBorder(null);
        addPLButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton4ActionPerformed(evt);
            }
        });

        addPLButton5.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton5.setText("+");
        addPLButton5.setBorder(null);
        addPLButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton5ActionPerformed(evt);
            }
        });

        addPLButton8.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton8.setText("+");
        addPLButton8.setBorder(null);
        addPLButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton8ActionPerformed(evt);
            }
        });

        addPLButton6.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton6.setText("+");
        addPLButton6.setBorder(null);
        addPLButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton6ActionPerformed(evt);
            }
        });

        addPLButton10.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton10.setText("+");
        addPLButton10.setBorder(null);
        addPLButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton10ActionPerformed(evt);
            }
        });

        addPLButton9.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton9.setText("+");
        addPLButton9.setBorder(null);
        addPLButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton9ActionPerformed(evt);
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

        addPLButton11.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton11.setText("+");
        addPLButton11.setBorder(null);
        addPLButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton11ActionPerformed(evt);
            }
        });

        addPLButton12.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton12.setText("+");
        addPLButton12.setBorder(null);
        addPLButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton12ActionPerformed(evt);
            }
        });

        addPLButton13.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton13.setText("+");
        addPLButton13.setBorder(null);
        addPLButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton13ActionPerformed(evt);
            }
        });

        addPLButton14.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton14.setText("+");
        addPLButton14.setBorder(null);
        addPLButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton14ActionPerformed(evt);
            }
        });

        addPLButton15.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton15.setText("+");
        addPLButton15.setBorder(null);
        addPLButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton15ActionPerformed(evt);
            }
        });

        addPLButton16.setBackground(new java.awt.Color(0, 0, 0));
        addPLButton16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        addPLButton16.setText("+");
        addPLButton16.setBorder(null);
        addPLButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPLButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(orangeBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(songButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addPLButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(songButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(songsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(songButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addPLButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(songButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(songButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addPLButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(songButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(songButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addPLButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(songButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(songButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addPLButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(songButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addPLButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(songButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(songButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(songButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(songButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(addPLButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(songButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(addPLButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(songButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPLButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orangeBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(songsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(songButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(songButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(songButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(songButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(songButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(songButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(songButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(songButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(songButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPLButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(songButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(songButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(songButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPLButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void homePageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageButtonActionPerformed
        new mainMenu(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homePageButtonActionPerformed

    private void returnPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnPageButtonActionPerformed
        new mainMenu(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnPageButtonActionPerformed

    private void songButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton1ActionPerformed
        songName = "Slipknot - (sic)";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\(sic).wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\slipknot.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
        
    }//GEN-LAST:event_songButton1ActionPerformed

    private void songButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton2ActionPerformed
        songName = "Slipknot - People = Shit";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\PeopleShit.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\slipknotiwoa.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
        
    }//GEN-LAST:event_songButton2ActionPerformed

    private void songButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton3ActionPerformed
        songName = "Slipknot - Eyeless";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Eyeless.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\slipknot.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton3ActionPerformed

    private void songButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton4ActionPerformed
        songName = "Slipknot - Disasterpiece";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Disasterpiece.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\slipknotiwoa.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
        
    }//GEN-LAST:event_songButton4ActionPerformed

    private void songButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton5ActionPerformed
        songName = "Slipknot - Surfacing";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Surfacing.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\slipknot.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
        
    }//GEN-LAST:event_songButton5ActionPerformed

    private void songButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton7ActionPerformed
        songName = "Gojira - Ocean Planet";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\OceanPlanet.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\FromMarsToSirius.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton7ActionPerformed

    private void songButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton8ActionPerformed
        songName = "Gojira - The Shooting Star";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\TheShootingStar.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\magma.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton8ActionPerformed

    private void songButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton9ActionPerformed
        songName = "Gojira - Backbone";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Backbone.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\FromMarsToSirius.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton9ActionPerformed

    private void songButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton10ActionPerformed
        songName = "Gojira - Silvera";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Silvera.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\magma.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton10ActionPerformed

    private void songButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton6ActionPerformed
        songName = "Slipknot - The Heretic Anthem";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\TheHereticAnthem.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\slipknotiwoa.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton6ActionPerformed

    private void addPLButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton1ActionPerformed
       int songID = 1;
       int S_albumID = 1;
       int ownerID = 3;
       new addPlaylistMenu(email, songNames[0], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton1ActionPerformed

    private void addPLButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton2ActionPerformed
        int songID = 1;
       int S_albumID = 2;
       int ownerID = 3;
       new addPlaylistMenu(email, songNames[1], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton2ActionPerformed

    private void addPLButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton3ActionPerformed
       int songID = 2;
       int S_albumID = 1;
       int ownerID = 3;
       new addPlaylistMenu(email, songNames[2], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton3ActionPerformed

    private void addPLButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton4ActionPerformed
       int songID = 2;
       int S_albumID = 2;
       int ownerID = 3;
       new addPlaylistMenu(email, songNames[3], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton4ActionPerformed

    private void addPLButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton5ActionPerformed
       int songID = 3;
       int S_albumID = 1;
       int ownerID = 3;
       new addPlaylistMenu(email, songNames[4], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton5ActionPerformed

    private void addPLButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton6ActionPerformed
       int songID = 3;
       int S_albumID = 2;
       int ownerID = 3;
       new addPlaylistMenu(email, songNames[5], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton6ActionPerformed

    private void addPLButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton7ActionPerformed
       int songID = 1;
       int S_albumID = 1;
       int ownerID = 4;
       new addPlaylistMenu(email, songNames[6], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton7ActionPerformed

    private void addPLButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton8ActionPerformed
       int songID = 1;
       int S_albumID = 2;
       int ownerID = 4;
       new addPlaylistMenu(email, songNames[7], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton8ActionPerformed

    private void addPLButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton9ActionPerformed
       int songID = 2;
       int S_albumID = 1;
       int ownerID = 4;
       new addPlaylistMenu(email, songNames[8], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton9ActionPerformed

    private void addPLButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton10ActionPerformed
       int songID = 2;
       int S_albumID = 2;
       int ownerID = 4;
       new addPlaylistMenu(email, songNames[9], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton10ActionPerformed

    private void songButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton11ActionPerformed
        songName = "Gojira - Flying Whales";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\FlyingWhales.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\FromMarsToSirius.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton11ActionPerformed

    private void songButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton12ActionPerformed
        songName = "Gojira - Stranded";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Stranded.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\magma.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton12ActionPerformed

    private void songButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton13ActionPerformed
        songName = "Pearl Jam - Even Flow";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\EvenFlow.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\ten.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton13ActionPerformed

    private void songButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton14ActionPerformed
        songName = "Pearl Jam - Go";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Go.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\vs.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton14ActionPerformed

    private void songButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton15ActionPerformed
        songName = "Pearl Jam - Alive";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Alive.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\ten.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton15ActionPerformed

    private void songButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songButton16ActionPerformed
        songName = "Pearl Jam - Animal";
        filepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\mp3s\\Animal.wav";
        imagefilepath = "C:\\Users\\aemre\\OneDrive\\Documents\\NetBeansProjects\\C#\\src\\images\\vs.jpg";
        new songPlayerWindow(email, filepath, imagefilepath, songName).setVisible(true);
    }//GEN-LAST:event_songButton16ActionPerformed

    private void addPLButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton11ActionPerformed
       int songID = 3;
       int S_albumID = 1;
       int ownerID = 4;
       new addPlaylistMenu(email, songNames[10], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton11ActionPerformed

    private void addPLButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton12ActionPerformed
       int songID = 3;
       int S_albumID = 2;
       int ownerID = 4;
       new addPlaylistMenu(email, songNames[11], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton12ActionPerformed

    private void addPLButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton13ActionPerformed
       int songID = 1;
       int S_albumID = 1;
       int ownerID = 5;
       new addPlaylistMenu(email, songNames[12], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton13ActionPerformed

    private void addPLButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton14ActionPerformed
       int songID = 1;
       int S_albumID = 2;
       int ownerID = 5;
       new addPlaylistMenu(email, songNames[13], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton14ActionPerformed

    private void addPLButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton15ActionPerformed
       int songID = 2;
       int S_albumID = 1;
       int ownerID = 5;
       new addPlaylistMenu(email, songNames[14], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton15ActionPerformed

    private void addPLButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPLButton16ActionPerformed
       int songID = 2;
       int S_albumID = 2;
       int ownerID = 5;
       new addPlaylistMenu(email, songNames[15], songID, S_albumID, ownerID).setVisible(true);
    }//GEN-LAST:event_addPLButton16ActionPerformed

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
            java.util.logging.Logger.getLogger(songsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(songsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(songsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(songsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new songsView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPLButton1;
    private javax.swing.JButton addPLButton10;
    private javax.swing.JButton addPLButton11;
    private javax.swing.JButton addPLButton12;
    private javax.swing.JButton addPLButton13;
    private javax.swing.JButton addPLButton14;
    private javax.swing.JButton addPLButton15;
    private javax.swing.JButton addPLButton16;
    private javax.swing.JButton addPLButton2;
    private javax.swing.JButton addPLButton3;
    private javax.swing.JButton addPLButton4;
    private javax.swing.JButton addPLButton5;
    private javax.swing.JButton addPLButton6;
    private javax.swing.JButton addPLButton7;
    private javax.swing.JButton addPLButton8;
    private javax.swing.JButton addPLButton9;
    private javax.swing.JPanel background;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton homePageButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel orangeBar;
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
    private javax.swing.JLabel songsLabel;
    // End of variables declaration//GEN-END:variables
}
