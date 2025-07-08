package com.client;

import com.server.AddUser;
import com.server.GetUser;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Signup {
    public static void start() {

        // Font
        Font font1 = new Font("Helvetica Neue", Font.BOLD, 20);
        Font font2 = new Font("Arial", 0, 18);
        Font font3 = new Font("Helvetica Neue", 0, 14);

        // Fereastra Sign Up
        JFrame signupFrame = new JFrame();
        signupFrame.setSize(1470, 830);
        signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signupFrame.getContentPane().setBackground(Color.white);
        signupFrame.setLayout(null);

        // Panou Sign Up
        JPanel signupPanel = new JPanel();
        signupPanel.setBounds(485, 400, 500, 400);
        signupPanel.setBackground(Color.white);
        signupPanel.setLayout(null);
        signupFrame.add(signupPanel);

        // Eticheta New username
        JLabel newuserLabel = new JLabel("New Username");
        newuserLabel.setBounds(100, 25, 200, 20);
        newuserLabel.setFont(font1);
        newuserLabel.setForeground(Color.darkGray);
        signupPanel.add(newuserLabel);

        // Camp New Username
        JTextField newuserField = new JTextField();
        newuserField.setBounds(100, 50, 300, 50);
        newuserField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        newuserField.setFont(font2);
        newuserField.setFocusable(false);
        signupPanel.add(newuserField);

        // Eveniment camp New Username
        newuserField.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                newuserField.setFocusable(true);
            }

            public void mouseExited(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                newuserField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
                newuserField.setForeground(Color.black);
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eticheta New Password
        JLabel newpassLabel = new JLabel("New Password");
        newpassLabel.setBounds(100, 125, 200, 20);
        newpassLabel.setFont(font1);
        newpassLabel.setForeground(Color.darkGray);
        signupPanel.add(newpassLabel);

        // Camp New Password
        JPasswordField newpassField = new JPasswordField();
        newpassField.setBounds(100, 150, 300, 50);
        newpassField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        newpassField.setFont(font2);
        newpassField.setFocusable(false);
        signupPanel.add(newpassField);

        // Eveniment camp New Password
        newpassField.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                newpassField.setFocusable(true);
            }

            public void mouseExited(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                newpassField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
                newpassField.setForeground(Color.black);
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Checkbox Show Password
        JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
        showPasswordCheckBox.setBounds(95, 205, 200, 14);
        showPasswordCheckBox.setFont(font3);
        showPasswordCheckBox.setForeground(Color.darkGray);
        signupPanel.add(showPasswordCheckBox);

        // Eveniment checkbox ShowPassword
        showPasswordCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                    newpassField.setEchoChar((char) 0);
                } else {
                    newpassField.setEchoChar('\u25CF');
                }
            }
        });

        // Eroare
        JLabel signuperrLabel = new JLabel();
        signuperrLabel.setBounds(100, 225, 300, 15);
        signuperrLabel.setFont(font3);
        signuperrLabel.setForeground(Color.red);
        signupPanel.add(signuperrLabel);

        // Buton Sign Up
        JPanel signupButtonPanel = new JPanel();
        signupButtonPanel.setBounds(100, 250, 300, 50);
        signupButtonPanel.setLayout(new GridBagLayout());
        signupButtonPanel.setBackground(Color.black);
        signupPanel.add(signupButtonPanel);

        // Eticheta Sign Up
        JLabel signupLabel = new JLabel("Sign Up");
        signupLabel.setFont(font1);
        signupLabel.setForeground(Color.white);
        signupButtonPanel.add(signupLabel);

        // Eveniment buton Sign Up
        signupButtonPanel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                signupButtonPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }

            public void mouseExited(MouseEvent e) {
                signupButtonPanel.setBorder(null);
            }

            public void mousePressed(MouseEvent e) {
                newuserField.setFocusable(false);
                newpassField.setFocusable(false);
                if (!newuserField.getText().equals("") && !String.valueOf(newpassField.getPassword()).equals("")
                        && String.valueOf(newpassField.getPassword()).length() >= 8
                        && GetUser.GetFromDB(newuserField.getText(), String.valueOf(newpassField.getPassword())) == 0) {
                    try {
                        AddUser.AddtoDB(newuserField.getText(),
                                String.valueOf(newpassField.getPassword()));
                        Configure.start();
                        signupFrame.dispose();
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                } else if (newuserField.getText().equals("") && String.valueOf(newpassField.getPassword()).equals("")) {
                    signuperrLabel.setText("Username and Password fields are empty");
                    newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                } else if (newuserField.getText().equals("")) {
                    signuperrLabel.setText("Username field is empty");
                    newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                } else if (GetUser.GetFromDB(newuserField.getText(), String.valueOf(newpassField.getPassword())) != 0) {
                    signuperrLabel.setText("This Username is already used");
                    newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    newuserField.setForeground(Color.red);
                    newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    newpassField.setForeground(Color.red);
                } else if (String.valueOf(newpassField.getPassword()).equals("")) {
                    signuperrLabel.setText("Password field is empty");
                    newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                } else if (String.valueOf(newpassField.getPassword()).length() < 8) {
                    signuperrLabel.setText("Password must be at least 8 characters long");
                    newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    newpassField.setForeground(Color.red);
                }
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eveniment Camp New Username
        newuserField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    newuserField.setFocusable(false);
                    newpassField.setFocusable(false);
                    if (!newuserField.getText().equals("") && !String.valueOf(newpassField.getPassword()).equals("")
                            && String.valueOf(newpassField.getPassword()).length() >= 8
                            && GetUser.GetFromDB(newuserField.getText(),
                                    String.valueOf(newpassField.getPassword())) == 0) {
                        try {
                            AddUser.AddtoDB(newuserField.getText(),
                                    String.valueOf(newpassField.getPassword()));
                            Configure.start();
                            signupFrame.dispose();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    } else if (newuserField.getText().equals("")
                            && String.valueOf(newpassField.getPassword()).equals("")) {
                        signuperrLabel.setText("Username and Password fields are empty");
                        newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (newuserField.getText().equals("")) {
                        signuperrLabel.setText("Username field is empty");
                        newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (GetUser.GetFromDB(newuserField.getText(),
                            String.valueOf(newpassField.getPassword())) != 0) {
                        signuperrLabel.setText("This Username is already used");
                        newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newuserField.setForeground(Color.red);
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newpassField.setForeground(Color.red);
                    } else if (String.valueOf(newpassField.getPassword()).equals("")) {
                        signuperrLabel.setText("Password field is empty");
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (String.valueOf(newpassField.getPassword()).length() < 8) {
                        signuperrLabel.setText("Password must be at least 8 characters long");
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newpassField.setForeground(Color.red);
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Eveniment Camp New Password
        newpassField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    newuserField.setFocusable(false);
                    newpassField.setFocusable(false);
                    if (!newuserField.getText().equals("") && !String.valueOf(newpassField.getPassword()).equals("")
                            && String.valueOf(newpassField.getPassword()).length() >= 8
                            && GetUser.GetFromDB(newuserField.getText(),
                                    String.valueOf(newpassField.getPassword())) == 0) {
                        try {
                            AddUser.AddtoDB(newuserField.getText(),
                                    String.valueOf(newpassField.getPassword()));
                            Configure.start();
                            signupFrame.dispose();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    } else if (newuserField.getText().equals("")
                            && String.valueOf(newpassField.getPassword()).equals("")) {
                        signuperrLabel.setText("Username and Password fields are empty");
                        newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (newuserField.getText().equals("")) {
                        signuperrLabel.setText("Username field is empty");
                        newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (GetUser.GetFromDB(newuserField.getText(),
                            String.valueOf(newpassField.getPassword())) != 0) {
                        signuperrLabel.setText("This Username is already used");
                        newuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newuserField.setForeground(Color.red);
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newpassField.setForeground(Color.red);
                    } else if (String.valueOf(newpassField.getPassword()).equals("")) {
                        signuperrLabel.setText("Password field is empty");
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (String.valueOf(newpassField.getPassword()).length() < 8) {
                        signuperrLabel.setText("Password must be at least 8 characters long");
                        newpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        newpassField.setForeground(Color.red);
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Eticheta I already have an account
        JLabel accLabel = new JLabel("I already have an account");
        accLabel.setBounds(165, 305, 300, 15);
        accLabel.setFont(font3);
        accLabel.setForeground(Color.gray);
        signupPanel.add(accLabel);

        // Eveniment I already have an account
        accLabel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                accLabel.setForeground(Color.darkGray);
            }

            public void mouseExited(MouseEvent e) {
                accLabel.setForeground(Color.gray);
            }

            public void mousePressed(MouseEvent e) {
                Login.start();
                signupFrame.dispose();
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Imagine Logo Toyota
        ImageIcon image = new ImageIcon("imagini/toyota.png");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(485, 0, 500, 500);
        signupFrame.add(imageLabel);

        // Afisare fereastra Sign Up
        signupFrame.setVisible(true);
    }
}