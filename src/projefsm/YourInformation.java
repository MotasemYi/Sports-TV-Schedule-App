/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projefsm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Motasem
 */
public class YourInformation extends javax.swing.JFrame { 
    Connection con;
    PreparedStatement ps;
    Statement st;
    java.sql.ResultSet rst;

    /**
     * Creates new form YourInformation
     */
    public YourInformation() {
        initComponents();

    }

    public JLabel getjLabel12PutUserName() {
        return jLabel12PutUserName;
    }

    public void setjLabel12PutUserName(JLabel jLabel12PutUserName) {
        this.jLabel12PutUserName = jLabel12PutUserName;
    }

    
    
    
    public JLabel getjLabel12username() {

        return jLabel12username;
    }

    public void setjLabel12username(JLabel jLabel12username) {
        this.jLabel12username = jLabel12username;
    }

    public JLabel getjLabel14FavoritTeam() {
        return jLabel14FavoritTeam;
    }

    public void setjLabel14FavoritTeam(JLabel jLabel14FavoritTeam) {
        this.jLabel14FavoritTeam = jLabel14FavoritTeam;
    }

    public JLabel getjLabel15Password() {
        return jLabel15Password;
    }

    public void setjLabel15Password(JLabel jLabel15Password) {
        this.jLabel15Password = jLabel15Password;
    }

    public JLabel getjLabel16Age() {
        return jLabel16Age;
    }

    public void setjLabel16Age(JLabel jLabel16Age) {
        this.jLabel16Age = jLabel16Age;
    }

    public JLabel getjLabel17Email() {
        return jLabel17Email;
    }

    public void setjLabel17Email(JLabel jLabel17Email) {
        this.jLabel17Email = jLabel17Email;
    }

    public JLabel getjLabel18Phone() {
        return jLabel18Phone;
    }

    public void setjLabel18Phone(JLabel jLabel18Phone) {
        this.jLabel18Phone = jLabel18Phone;
    }

    public JLabel getjLabel19Gender() {
        return jLabel19Gender;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem1Copy = new javax.swing.JMenuItem();
        jMenuItem2Paste = new javax.swing.JMenuItem();
        jMenuItem3Cut = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1NewPassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField1oldPassword1 = new javax.swing.JTextField();
        jButton1ChangePasword = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1add = new javax.swing.JButton();
        jLabel12username = new javax.swing.JLabel();
        jLabel14FavoritTeam = new javax.swing.JLabel();
        jLabel15Password = new javax.swing.JLabel();
        jLabel16Age = new javax.swing.JLabel();
        jLabel17Email = new javax.swing.JLabel();
        jLabel18Phone = new javax.swing.JLabel();
        jLabel19Gender = new javax.swing.JLabel();
        jLabel12PutUserName = new javax.swing.JLabel();
        jButton1showAllinformation = new javax.swing.JButton();
        jCheckBox1problem = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox2comment = new javax.swing.JCheckBox();
        jButton1Back = new javax.swing.JButton();
        jMenuBar2Back = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1Back = new javax.swing.JMenuItem();
        jMenuItem2Exit = new javax.swing.JMenuItem();

        jMenuItem1Copy.setText("Copy");
        jMenuItem1Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1CopyActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1Copy);

        jMenuItem2Paste.setText("Paste\n");
        jMenuItem2Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2PasteActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2Paste);

        jMenuItem3Cut.setText("Cut");
        jMenuItem3Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3CutActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3Cut);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Password:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("User name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Favorit Team:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Gender:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Change Password:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Old Password:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Write your opinion about the program and if you have any program please tell us");

        jButton1ChangePasword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1ChangePasword.setForeground(new java.awt.Color(0, 0, 102));
        jButton1ChangePasword.setText("Change Pasword");
        jButton1ChangePasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ChangePaswordActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("New Password:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jButton1add.setText("Add");
        jButton1add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1addActionPerformed(evt);
            }
        });

        jLabel12username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12username.setForeground(new java.awt.Color(0, 0, 102));

        jLabel14FavoritTeam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14FavoritTeam.setForeground(new java.awt.Color(0, 0, 102));

        jLabel15Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15Password.setForeground(new java.awt.Color(0, 0, 102));

        jLabel16Age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16Age.setForeground(new java.awt.Color(0, 0, 102));

        jLabel17Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17Email.setForeground(new java.awt.Color(0, 0, 102));

        jLabel18Phone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18Phone.setForeground(new java.awt.Color(0, 0, 102));

        jLabel19Gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19Gender.setForeground(new java.awt.Color(0, 0, 102));

        jLabel12PutUserName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12PutUserName.setForeground(new java.awt.Color(0, 0, 102));

        jButton1showAllinformation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1showAllinformation.setForeground(new java.awt.Color(0, 0, 102));
        jButton1showAllinformation.setText("Show All information");
        jButton1showAllinformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1showAllinformationActionPerformed(evt);
            }
        });

        jCheckBox1problem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox1problem.setForeground(new java.awt.Color(0, 0, 153));
        jCheckBox1problem.setText("Problem");
        jCheckBox1problem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1problemActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("* Select the type of massage");

        jCheckBox2comment.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2comment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBox2comment.setForeground(new java.awt.Color(0, 0, 153));
        jCheckBox2comment.setText("Comment or view");
        jCheckBox2comment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2commentActionPerformed(evt);
            }
        });

        jButton1Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1Back.setForeground(new java.awt.Color(0, 0, 102));
        jButton1Back.setText("Back");
        jButton1Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16Age, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15Password, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12PutUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12username, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(972, 972, 972))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel17Email, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1oldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel19Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel14FavoritTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1ChangePasword, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1Back, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1showAllinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1problem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jButton1add))
                            .addComponent(jCheckBox2comment))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12PutUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel16Age, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1oldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17Email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel18Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel14FavoritTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButton1ChangePasword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel19Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1showAllinformation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jCheckBox1problem)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1add)
                                        .addGap(7, 7, 7)))
                                .addComponent(jCheckBox2comment))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1Back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );

        jMenu3.setForeground(new java.awt.Color(0, 0, 102));
        jMenu3.setText("Actions");

        jMenuItem1Back.setText("Back");
        jMenuItem1Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1BackActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1Back);

        jMenuItem2Exit.setText("Exit");
        jMenuItem2Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ExitActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2Exit);

        jMenuBar2Back.add(jMenu3);

        setJMenuBar(jMenuBar2Back);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ChangePaswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ChangePaswordActionPerformed
        // TODO add your handling code here:
        Pattern pt1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"); // en azindan 1 kucuk harf , 1 buyuk harf ,1 rakam , 1 isaret !@# gibi ve 8 karakterle bir password 
        Matcher m1 = pt1.matcher(jTextField1NewPassword.getText());
        
        if (m1.matches()) {
            try {
             Connection con = MakeCon.MakeConnection();
    
            String oldPassword = jTextField1oldPassword1.getText(); // hangi satiri update yapcagina burdan  bagladim , 
    
            String sql = "UPDATE mysql.information SET Password = ? WHERE Password = ?";
    
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setString(2, oldPassword);
           ps.setString(1, jTextField1NewPassword.getText());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Password changed successfully!");
            
            jLabel15Password.setText(jTextField1NewPassword.getText());
            
            
        } catch (Exception e) {
        
            System.out.println(e.getMessage());

        }
        }else{
            JOptionPane.showMessageDialog(null, "Faield , there is an mistake in old password or new password ,new password must be at least 8 character and has 1 small letter,1 big letter, 1 sign and 1 number ");

        }
      
       
        
    }//GEN-LAST:event_jButton1ChangePaswordActionPerformed

    private void jButton1addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1addActionPerformed
        // TODO add your handling code here:
        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\Motasem\\Desktop\\comments.txt" , true));
            write.write(jTextArea1.getText());
            JOptionPane.showMessageDialog(null, "Thank you for your message, If there is any problem it will be fixed soon");
            write.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        
    }//GEN-LAST:event_jButton1addActionPerformed

    private void jButton1showAllinformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1showAllinformationActionPerformed
        // TODO add your handling code here:
         try {
            con = MakeCon.MakeConnection();
            String sql = "SELECT * FROM mysql.information WHERE UserName = ? ";  // user bu button bastiginda MainmenuUser sayfasinda user namei kullanarak database baglayacagim ve databaste userin butun bilgileri lapellerde basilacak 
            ps = con.prepareStatement(sql);
            MainMenuUser x = new MainMenuUser();
            ps.setString(1, jLabel12PutUserName.getText());

            rst = ps.executeQuery();

            if (rst.next()) {

                jLabel15Password.setText(rst.getString("Password")); 
                jLabel16Age.setText(rst.getString("Age"));           
                jLabel17Email.setText(rst.getString("Email"));       
                jLabel18Phone.setText(rst.getString("Phone"));      
                jLabel14FavoritTeam.setText(rst.getString("FavoritTeam")); 
                jLabel19Gender.setText(rst.getString("Gender"));
                

            }
            
            jTextField1oldPassword1.setText(jLabel15Password.getText());

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
        
    }//GEN-LAST:event_jButton1showAllinformationActionPerformed

    private void jCheckBox1problemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1problemActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("@Problem" + '\n' + jTextArea1.getText() );
        
    }//GEN-LAST:event_jCheckBox1problemActionPerformed

    private void jCheckBox2commentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2commentActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("@View or comment" + '\n' + jTextArea1.getText() );
        
       
    }//GEN-LAST:event_jCheckBox2commentActionPerformed

    private void jButton1BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BackActionPerformed
        // TODO add your handling code here:
        MainMenuUser x = new MainMenuUser();

        x.setVisible(true);

        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton1BackActionPerformed

    private void jMenuItem1BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1BackActionPerformed
        // TODO add your handling code here:
        MainMenuUser x = new MainMenuUser();

        x.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1BackActionPerformed

    private void jMenuItem2ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ExitActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        // TODO add your handling code here: // popmenu yapmak ve acmak icin
        if (evt.getButton() == evt.BUTTON3) {
            jPopupMenu2.show(jTextArea1,evt.getX(),evt.getY());
        }                                                                              //////////text areaya popmenu ekledim (copy paste cut)
      
    }//GEN-LAST:event_jTextArea1MouseClicked

    private void jMenuItem1CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1CopyActionPerformed
        // TODO add your handling code here:
        jTextArea1.copy();
    }//GEN-LAST:event_jMenuItem1CopyActionPerformed

    private void jMenuItem2PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2PasteActionPerformed
        // TODO add your handling code here:
        jTextArea1.paste();
    }//GEN-LAST:event_jMenuItem2PasteActionPerformed

    private void jMenuItem3CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3CutActionPerformed
        // TODO add your handling code here:
        jTextArea1.cut();
    }//GEN-LAST:event_jMenuItem3CutActionPerformed

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
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YourInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*jButton1showAllinformation and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YourInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Back;
    private javax.swing.JButton jButton1ChangePasword;
    private javax.swing.JButton jButton1add;
    private javax.swing.JButton jButton1showAllinformation;
    private javax.swing.JCheckBox jCheckBox1problem;
    private javax.swing.JCheckBox jCheckBox2comment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel12PutUserName;
    private javax.swing.JLabel jLabel12username;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14FavoritTeam;
    private javax.swing.JLabel jLabel15Password;
    private javax.swing.JLabel jLabel16Age;
    private javax.swing.JLabel jLabel17Email;
    private javax.swing.JLabel jLabel18Phone;
    private javax.swing.JLabel jLabel19Gender;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2Back;
    private javax.swing.JMenuItem jMenuItem1Back;
    private javax.swing.JMenuItem jMenuItem1Copy;
    private javax.swing.JMenuItem jMenuItem2Exit;
    private javax.swing.JMenuItem jMenuItem2Paste;
    private javax.swing.JMenuItem jMenuItem3Cut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1NewPassword;
    private javax.swing.JTextField jTextField1oldPassword1;
    // End of variables declaration//GEN-END:variables
}
