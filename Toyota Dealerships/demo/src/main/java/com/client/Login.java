package com.client;

import com.server.GetUser;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Login {
    public static void start() {

        // Font
        Font font1 = new Font("Helvetica Neue", Font.BOLD, 20);
        Font font2 = new Font("Arial", 0, 18);
        Font font3 = new Font("Helvetica Neue", 0, 14);

        // Fereastra Log In
        JFrame loginFrame = new JFrame();
        loginFrame.setSize(1470, 830);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.getContentPane().setBackground(Color.white);
        loginFrame.setLayout(null);

        // Panou Log In
        JPanel loginPanel = new JPanel();
        loginPanel.setBounds(485, 400, 500, 400);
        loginPanel.setBackground(Color.white);
        loginPanel.setLayout(null);
        loginFrame.add(loginPanel);

        // Eticheta Username
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(100, 25, 100, 20);
        userLabel.setFont(font1);
        userLabel.setForeground(Color.darkGray);
        loginPanel.add(userLabel);

        // Camp Username
        JTextField userField = new JTextField();
        userField.setBounds(100, 50, 300, 50);
        userField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        userField.setFont(font2);
        userField.setFocusable(false);
        loginPanel.add(userField);

        // Eroare
        JLabel loginerrLabel = new JLabel();
        loginerrLabel.setBounds(100, 225, 300, 15);
        loginerrLabel.setFont(font3);
        loginerrLabel.setForeground(Color.red);
        loginPanel.add(loginerrLabel);

        // Eveniment camp Username
        userField.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                userField.setFocusable(true);
            }

            public void mouseExited(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                userField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
                userField.setForeground(Color.black);
                loginerrLabel.setText("");
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eticheta Password
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(100, 125, 100, 20);
        passLabel.setFont(font1);
        passLabel.setForeground(Color.darkGray);
        loginPanel.add(passLabel);

        // Camp Password
        JPasswordField passField = new JPasswordField();
        passField.setBounds(100, 150, 300, 50);
        passField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        passField.setFont(font2);
        passField.setFocusable(false);
        loginPanel.add(passField);

        // Eveniment camp Password
        passField.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                passField.setFocusable(true);
            }

            public void mouseExited(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                passField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
                passField.setForeground(Color.black);
                loginerrLabel.setText("");
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Checkbox Show Password
        JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
        showPasswordCheckBox.setBounds(95, 205, 200, 14);
        showPasswordCheckBox.setFont(font3);
        showPasswordCheckBox.setForeground(Color.darkGray);
        loginPanel.add(showPasswordCheckBox);

        // Eveniment checkbox ShowPassword
        showPasswordCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                    passField.setEchoChar((char) 0);
                } else {
                    passField.setEchoChar('\u25CF');
                }
            }
        });

        // Buton Sign Up
        JPanel signupButtonPanel = new JPanel();
        signupButtonPanel.setBounds(100, 250, 145, 50);
        signupButtonPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        signupButtonPanel.setLayout(new GridBagLayout());
        signupButtonPanel.setBackground(Color.white);
        loginPanel.add(signupButtonPanel);

        // Eticheta Sign Up
        JLabel signupLabel = new JLabel("Sign Up");
        signupLabel.setFont(font1);
        signupLabel.setForeground(Color.darkGray);
        signupButtonPanel.add(signupLabel);

        // Eveniment buton Sign Up
        signupButtonPanel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                signupButtonPanel.setBackground(Color.red);
                signupLabel.setForeground(Color.white);
            }

            public void mouseExited(MouseEvent e) {
                signupButtonPanel.setBackground(Color.white);
                signupLabel.setForeground(Color.darkGray);
            }

            public void mousePressed(MouseEvent e) {
                Signup.start();
                loginFrame.dispose();
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Buton Log In
        JPanel loginButtonPanel = new JPanel();
        loginButtonPanel.setBounds(255, 250, 145, 50);
        loginButtonPanel.setLayout(new GridBagLayout());
        loginButtonPanel.setBackground(Color.black);
        loginPanel.add(loginButtonPanel);

        // Eticheta Log In
        JLabel loginLabel = new JLabel("Log In");
        loginLabel.setFont(font1);
        loginLabel.setForeground(Color.white);
        loginButtonPanel.add(loginLabel);

        // Eveniment buton Log In
        loginButtonPanel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                loginButtonPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }

            public void mouseExited(MouseEvent e) {
                loginButtonPanel.setBorder(null);
            }

            public void mousePressed(MouseEvent e) {
                userField.setFocusable(false);
                passField.setFocusable(false);
                if (!userField.getText().equals("") && !String.valueOf(passField.getPassword()).equals("")) {
                    if (GetUser.GetFromDB(userField.getText(), String.valueOf(passField.getPassword())) == 1) {
                        Configure.start();
                        loginFrame.dispose();
                    } else if (GetUser.GetFromDB(userField.getText(), String.valueOf(passField.getPassword())) == 2) {
                        loginerrLabel.setText("Password is wrong");
                        passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        passField.setForeground(Color.red);
                    } else {
                        loginerrLabel.setText("User not found");
                        userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        userField.setForeground(Color.red);
                    }
                } else if (userField.getText().equals("") && String.valueOf(passField.getPassword()).equals("")) {
                    loginerrLabel.setText("Username and Password fields are empty");
                    userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                } else if (userField.getText().equals("")) {
                    loginerrLabel.setText("Username field is empty");
                    userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                } else if (String.valueOf(passField.getPassword()).equals("")) {
                    loginerrLabel.setText("Password field is empty");
                    passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                }
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eveniment Camp Username
        userField.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    userField.setFocusable(false);
                    passField.setFocusable(false);
                    if (!userField.getText().equals("") && !String.valueOf(passField.getPassword()).equals("")) {
                        if (GetUser.GetFromDB(userField.getText(), String.valueOf(passField.getPassword())) == 1) {
                            Configure.start();
                            loginFrame.dispose();
                        } else if (GetUser.GetFromDB(userField.getText(),
                                String.valueOf(passField.getPassword())) == 2) {
                            loginerrLabel.setText("Password is wrong");
                            passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            passField.setForeground(Color.red);
                        } else {
                            loginerrLabel.setText("User not found");
                            userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            userField.setForeground(Color.red);
                        }
                    } else if (userField.getText().equals("") && String.valueOf(passField.getPassword()).equals("")) {
                        loginerrLabel.setText("Username and Password fields are empty");
                        userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (userField.getText().equals("")) {
                        loginerrLabel.setText("Username field is empty");
                        userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (String.valueOf(passField.getPassword()).equals("")) {
                        loginerrLabel.setText("Password field is empty");
                        passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        //Eveniment Camp Password
        passField.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    userField.setFocusable(false);
                    passField.setFocusable(false);
                    if (!userField.getText().equals("") && !String.valueOf(passField.getPassword()).equals("")) {
                        if (GetUser.GetFromDB(userField.getText(), String.valueOf(passField.getPassword())) == 1) {
                            Configure.start();
                            loginFrame.dispose();
                        } else if (GetUser.GetFromDB(userField.getText(),
                                String.valueOf(passField.getPassword())) == 2) {
                            loginerrLabel.setText("Password is wrong");
                            passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            passField.setForeground(Color.red);
                        } else {
                            loginerrLabel.setText("User not found");
                            userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            userField.setForeground(Color.red);
                        }
                    } else if (userField.getText().equals("") && String.valueOf(passField.getPassword()).equals("")) {
                        loginerrLabel.setText("Username and Password fields are empty");
                        userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (userField.getText().equals("")) {
                        loginerrLabel.setText("Username field is empty");
                        userField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (String.valueOf(passField.getPassword()).equals("")) {
                        loginerrLabel.setText("Password field is empty");
                        passField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Eticheta Delete Account
        JLabel delaccLabel = new JLabel("Delete Account");
        delaccLabel.setBounds(200, 305, 200, 15);
        delaccLabel.setFont(font3);
        delaccLabel.setForeground(Color.gray);
        loginPanel.add(delaccLabel);

        // Eveniment Delete Account
        delaccLabel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                delaccLabel.setForeground(Color.darkGray);
            }

            public void mouseExited(MouseEvent e) {
                delaccLabel.setForeground(Color.gray);
            }

            public void mousePressed(MouseEvent e) {
                Delete.start();
                loginFrame.dispose();
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Imagine Logo Toyota
        ImageIcon image = new ImageIcon("imagini/toyota.png");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(485, 0, 500, 500);
        loginFrame.add(imageLabel);

        // Afisare fereastra Log In
        loginFrame.setVisible(true);
    }
}