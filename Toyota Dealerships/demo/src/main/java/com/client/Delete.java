package com.client;

import com.server.DeleteUser;
import com.server.GetUser;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Delete {
    public static void start() {

        // Font
        Font font1 = new Font("Helvetica Neue", Font.BOLD, 20);
        Font font2 = new Font("Arial", 0, 18);
        Font font3 = new Font("Helvetica Neue", 0, 14);

        // Fereastra Delete
        JFrame deleteFrame = new JFrame();
        deleteFrame.setSize(1470, 830);
        deleteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        deleteFrame.getContentPane().setBackground(Color.white);
        deleteFrame.setLayout(null);

        // Panou Delete
        JPanel deletePanel = new JPanel();
        deletePanel.setBounds(485, 400, 500, 400);
        deletePanel.setBackground(Color.white);
        deletePanel.setLayout(null);
        deleteFrame.add(deletePanel);

        // Eticheta Confirm Username
        JLabel confuserLabel = new JLabel("Confirm Username");
        confuserLabel.setBounds(100, 25, 200, 20);
        confuserLabel.setFont(font1);
        confuserLabel.setForeground(Color.darkGray);
        deletePanel.add(confuserLabel);

        // Camp Confirm Username
        JTextField confuserField = new JTextField();
        confuserField.setBounds(100, 50, 300, 50);
        confuserField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        confuserField.setFont(font2);
        confuserField.setFocusable(false);
        deletePanel.add(confuserField);

        // Eroare
        JLabel deleteerrLabel = new JLabel();
        deleteerrLabel.setBounds(100, 225, 300, 15);
        deleteerrLabel.setFont(font3);
        deleteerrLabel.setForeground(Color.red);
        deletePanel.add(deleteerrLabel);

        // Eveniment camp Confirm Username
        confuserField.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                confuserField.setFocusable(true);
            }

            public void mouseExited(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                confuserField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
                confuserField.setForeground(Color.black);
                deleteerrLabel.setText("");
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eticheta Confirm Password
        JLabel confpassLabel = new JLabel("Confirm Password");
        confpassLabel.setBounds(100, 125, 200, 20);
        confpassLabel.setFont(font1);
        confpassLabel.setForeground(Color.darkGray);
        deletePanel.add(confpassLabel);

        // Camp Confirm Password
        JPasswordField confpassField = new JPasswordField();
        confpassField.setBounds(100, 150, 300, 50);
        confpassField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
        confpassField.setFont(font2);
        confpassField.setFocusable(false);
        deletePanel.add(confpassField);

        // Eveniment camp Confirm Password
        confpassField.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                confpassField.setFocusable(true);
            }

            public void mouseExited(MouseEvent e) {

            }

            public void mousePressed(MouseEvent e) {
                confpassField.setBorder(BorderFactory.createLineBorder(Color.gray, 2));
                confpassField.setForeground(Color.black);
                deleteerrLabel.setText("");
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Checkbox Show Password
        JCheckBox showPasswordCheckBox = new JCheckBox("Show Password");
        showPasswordCheckBox.setBounds(95, 205, 200, 14);
        showPasswordCheckBox.setFont(font3);
        showPasswordCheckBox.setForeground(Color.darkGray);
        deletePanel.add(showPasswordCheckBox);

        // Eveniment checkbox ShowPassword
        showPasswordCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                    confpassField.setEchoChar((char) 0);
                } else {
                    confpassField.setEchoChar('\u25CF');
                }
            }
        });

        // Buton Cancel
        JPanel cancelButtonPanel = new JPanel();
        cancelButtonPanel.setBounds(100, 250, 145, 50);
        cancelButtonPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        cancelButtonPanel.setLayout(new GridBagLayout());
        cancelButtonPanel.setBackground(Color.white);
        deletePanel.add(cancelButtonPanel);

        // Eticheta Cancel
        JLabel cancelLabel = new JLabel("Cancel");
        cancelLabel.setFont(font1);
        cancelLabel.setForeground(Color.darkGray);
        cancelButtonPanel.add(cancelLabel);

        // Eveniment buton Cancel
        cancelButtonPanel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                cancelButtonPanel.setBackground(Color.red);
                cancelLabel.setForeground(Color.white);
            }

            public void mouseExited(MouseEvent e) {
                cancelButtonPanel.setBackground(Color.white);
                cancelLabel.setForeground(Color.darkGray);
            }

            public void mousePressed(MouseEvent e) {
                Login.start();
                deleteFrame.dispose();
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Buton Delete
        JPanel deleteButtonPanel = new JPanel();
        deleteButtonPanel.setBounds(255, 250, 145, 50);
        deleteButtonPanel.setLayout(new GridBagLayout());
        deleteButtonPanel.setBackground(Color.black);
        deletePanel.add(deleteButtonPanel);

        // Eticheta Delete
        JLabel deleteLabel = new JLabel("Delete");
        deleteLabel.setFont(font1);
        deleteLabel.setForeground(Color.white);
        deleteButtonPanel.add(deleteLabel);

        // Eveniment buton Delete
        deleteButtonPanel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                deleteButtonPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }

            public void mouseExited(MouseEvent e) {
                deleteButtonPanel.setBorder(null);
            }

            public void mousePressed(MouseEvent e) {
                confuserField.setFocusable(false);
                confpassField.setFocusable(false);
                if (!confuserField.getText().equals("") && !String.valueOf(confpassField.getPassword()).equals("")) {
                    if (GetUser.GetFromDB(confuserField.getText(), String.valueOf(confpassField.getPassword())) == 1) {
                        DeleteUser.DeletefromDB(confuserField.getText());
                        Login.start();
                        deleteFrame.dispose();
                        JFrame okdeletFrame = new JFrame();
                        okdeletFrame.setSize(300, 200);
                        okdeletFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        okdeletFrame.setLocationRelativeTo(null);
                        okdeletFrame.setLayout(null);
                        JButton okButton = new JButton("Ok");
                        okButton.setBounds(100, 125, 100, 30);
                        okdeletFrame.add(okButton);
                        JLabel confdelLabel = new JLabel("Account has been deleted successfully");
                        confdelLabel.setBounds(25, 25, 250, 15);
                        okdeletFrame.add(confdelLabel);
                        okButton.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                okdeletFrame.dispose();
                            }
                        });
                        okdeletFrame.setVisible(true);
                    } else if (GetUser.GetFromDB(confuserField.getText(),
                            String.valueOf(confpassField.getPassword())) == 2) {
                        deleteerrLabel.setText("Password is wrong");
                        confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        confpassField.setForeground(Color.red);
                    } else {
                        deleteerrLabel.setText("User not found");
                        confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        confuserField.setForeground(Color.red);
                    }
                } else if (confuserField.getText().equals("")
                        && String.valueOf(confpassField.getPassword()).equals("")) {
                    deleteerrLabel.setText("Username and Password fields are empty");
                    confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                } else if (confuserField.getText().equals("")) {
                    deleteerrLabel.setText("Username field is empty");
                    confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                } else if (String.valueOf(confpassField.getPassword()).equals("")) {
                    deleteerrLabel.setText("Password field is empty");
                    confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                }
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eveniment camp Confirm Username
        confuserField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    confuserField.setFocusable(false);
                    confpassField.setFocusable(false);
                    if (!confuserField.getText().equals("")
                            && !String.valueOf(confpassField.getPassword()).equals("")) {
                        if (GetUser.GetFromDB(confuserField.getText(),
                                String.valueOf(confpassField.getPassword())) == 1) {
                            DeleteUser.DeletefromDB(confuserField.getText());
                            Login.start();
                            deleteFrame.dispose();
                            JFrame okdeletFrame = new JFrame();
                            okdeletFrame.setSize(300, 200);
                            okdeletFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            okdeletFrame.setLocationRelativeTo(null);
                            okdeletFrame.setLayout(null);
                            JButton okButton = new JButton("Ok");
                            okButton.setBounds(100, 125, 100, 30);
                            okdeletFrame.add(okButton);
                            JLabel confdelLabel = new JLabel("Account has been deleted successfully");
                            confdelLabel.setBounds(25, 25, 250, 15);
                            okdeletFrame.add(confdelLabel);
                            okButton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    okdeletFrame.dispose();
                                }
                            });
                            okdeletFrame.setVisible(true);
                        } else if (GetUser.GetFromDB(confuserField.getText(),
                                String.valueOf(confpassField.getPassword())) == 2) {
                            deleteerrLabel.setText("Password is wrong");
                            confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            confpassField.setForeground(Color.red);
                        } else {
                            deleteerrLabel.setText("User not found");
                            confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            confuserField.setForeground(Color.red);
                        }
                    } else if (confuserField.getText().equals("")
                            && String.valueOf(confpassField.getPassword()).equals("")) {
                        deleteerrLabel.setText("Username and Password fields are empty");
                        confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (confuserField.getText().equals("")) {
                        deleteerrLabel.setText("Username field is empty");
                        confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (String.valueOf(confpassField.getPassword()).equals("")) {
                        deleteerrLabel.setText("Password field is empty");
                        confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Eveniment camp Confirm Password
        confpassField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    confuserField.setFocusable(false);
                    confpassField.setFocusable(false);
                    if (!confuserField.getText().equals("")
                            && !String.valueOf(confpassField.getPassword()).equals("")) {
                        if (GetUser.GetFromDB(confuserField.getText(),
                                String.valueOf(confpassField.getPassword())) == 1) {
                            DeleteUser.DeletefromDB(confuserField.getText());
                            Login.start();
                            deleteFrame.dispose();
                            JFrame okdeletFrame = new JFrame();
                            okdeletFrame.setSize(300, 200);
                            okdeletFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            okdeletFrame.setLocationRelativeTo(null);
                            okdeletFrame.setLayout(null);
                            JButton okButton = new JButton("Ok");
                            okButton.setBounds(100, 125, 100, 30);
                            okdeletFrame.add(okButton);
                            JLabel confdelLabel = new JLabel("Account has been deleted successfully");
                            confdelLabel.setBounds(25, 25, 250, 15);
                            okdeletFrame.add(confdelLabel);
                            okButton.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    okdeletFrame.dispose();
                                }
                            });
                            okdeletFrame.setVisible(true);
                        } else if (GetUser.GetFromDB(confuserField.getText(),
                                String.valueOf(confpassField.getPassword())) == 2) {
                            deleteerrLabel.setText("Password is wrong");
                            confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            confpassField.setForeground(Color.red);
                        } else {
                            deleteerrLabel.setText("User not found");
                            confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                            confuserField.setForeground(Color.red);
                        }
                    } else if (confuserField.getText().equals("")
                            && String.valueOf(confpassField.getPassword()).equals("")) {
                        deleteerrLabel.setText("Username and Password fields are empty");
                        confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                        confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (confuserField.getText().equals("")) {
                        deleteerrLabel.setText("Username field is empty");
                        confuserField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    } else if (String.valueOf(confpassField.getPassword()).equals("")) {
                        deleteerrLabel.setText("Password field is empty");
                        confpassField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Imagine Logo Toyota
        ImageIcon image = new ImageIcon("imagini/toyota.png");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(485, 0, 500, 500);
        deleteFrame.add(imageLabel);

        // Afisare fereastra Delete
        deleteFrame.setVisible(true);
    }
}
