package com.client;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Configure {
    public static void start() {

        // Font
        Font font1 = new Font("Helvetica Neue", Font.BOLD, 20);
        Font font2 = new Font("Arial", 0, 18);
        Font font3 = new Font("Helvetica Neue", 0, 14);

        // Fereastra Configure
        JFrame configureFrame = new JFrame();
        configureFrame.setSize(1470, 830);
        configureFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        configureFrame.getContentPane().setBackground(Color.white);
        configureFrame.setLayout(null);

        // Panou Configure
        JPanel configurePanel = new JPanel();
        configurePanel.setBounds(485, 400, 500, 400);
        configurePanel.setBackground(Color.white);
        configurePanel.setLayout(null);
        configureFrame.add(configurePanel);

        // Eticheta Model
        JLabel modelLabel = new JLabel("Model");
        modelLabel.setBounds(100, 25, 100, 21);
        modelLabel.setFont(font1);
        modelLabel.setForeground(Color.darkGray);
        configurePanel.add(modelLabel);

        // Cutie Models
        String models[] = { "", "Aygo X", "Yaris", "C-HR", "Camry", "Land Cruiser" };
        JComboBox<String> modelsBox = new JComboBox<String>(models);
        modelsBox.setBounds(95, 55, 310, 25);
        modelsBox.setFont(font2);
        configurePanel.add(modelsBox);

        // Eticheta Color
        JLabel colorLabel = new JLabel("Color");
        colorLabel.setBounds(100, 125, 100, 21);
        colorLabel.setFont(font1);
        colorLabel.setForeground(Color.darkGray);
        configurePanel.add(colorLabel);

        // Cutie Colors
        JComboBox<String> colorsBox = new JComboBox<String>();
        colorsBox.setBounds(95, 155, 310, 25);
        colorsBox.setFont(font2);
        colorsBox.addItem("");
        configurePanel.add(colorsBox);

        // Eroare
        JLabel configureerrLabel = new JLabel();
        configureerrLabel.setBounds(100, 225, 300, 15);
        configureerrLabel.setFont(font3);
        configureerrLabel.setForeground(Color.red);
        configurePanel.add(configureerrLabel);

        // Imagine Logo Toyota
        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(485, 0, 500, 500);
        imageLabel.setIcon(new ImageIcon("imagini/toyota.png"));
        imageLabel.setHorizontalAlignment(0);
        configureFrame.add(imageLabel);

        // Eveniment Cutie Models
        modelsBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorsBox.removeAllItems();
                colorsBox.addItem("");
                configureerrLabel.setText("");

                if (String.valueOf(modelsBox.getSelectedItem()).equals("")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/toyota.png"));
                }

                if (String.valueOf(modelsBox.getSelectedItem()).equals("Aygo X")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/aygoxalb.jpg"));
                    colorsBox.addItem("Alb");
                    colorsBox.addItem("Negru");
                    colorsBox.addItem("Albastru");
                    colorsBox.addItem("Gri");
                }

                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/yarisalb.jpg"));
                    colorsBox.addItem("Alb");
                    colorsBox.addItem("Gri");
                    colorsBox.addItem("Negru");
                    colorsBox.addItem("Bronz oxid");
                    colorsBox.addItem("Argintiu");
                    colorsBox.addItem("Albastru");
                    colorsBox.addItem("Rosu");
                }

                if (String.valueOf(modelsBox.getSelectedItem()).equals("C-HR")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/chralb.jpg"));
                    colorsBox.addItem("Alb");
                    colorsBox.addItem("Gri");
                    colorsBox.addItem("Negru");
                    colorsBox.addItem("Argintiu");
                    colorsBox.addItem("Verde");
                    colorsBox.addItem("Mov");
                }

                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camryalb.jpg"));
                    colorsBox.addItem("Alb");
                    colorsBox.addItem("Argintiu");
                    colorsBox.addItem("Negru");
                    colorsBox.addItem("Albastru");
                    colorsBox.addItem("Cenusiu");
                    colorsBox.addItem("Rosu");
                    colorsBox.addItem("Bronz");
                }

                if (String.valueOf(modelsBox.getSelectedItem()).equals("Land Cruiser")) {
                    imageLabel.setIcon(
                            new ImageIcon(
                                    "imagini/landcruiseralb.jpg"));
                    colorsBox.addItem("Alb");
                    colorsBox.addItem("Negru");
                    colorsBox.addItem("Gri");
                    colorsBox.addItem("Bej");
                    colorsBox.addItem("Auriu");
                }
            }
        });

        // Eveniment Cutie Colors
        colorsBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                configureerrLabel.setText("");

                if (String.valueOf(modelsBox.getSelectedItem()).equals("Aygo X")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Alb")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/aygoxalb.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Aygo X")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Negru")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/aygoxnegru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Aygo X")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Albastru")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/aygoxalbastru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Aygo X")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Gri")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/aygoxgri.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Alb")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/yarisalb.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Gri")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/yarisgri.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Negru")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/yarisnegru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Bronz oxid")) {
                    imageLabel.setIcon(
                            new ImageIcon(
                                    "imagini/yarisbronzoxid.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Argintiu")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/yarisargintiu.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Albastru")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/yarisalbastru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Yaris")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Rosu")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/yarisrosu.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("C-HR")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Alb")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/chralb.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("C-HR")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Gri")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/chrgri.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("C-HR")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Negru")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/chrnegru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("C-HR")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Argintiu")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/chrargintiu.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("C-HR")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Verde")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/chrverde.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("C-HR")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Mov")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/chrmov.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Alb")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camryalb.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Argintiu")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camryargintiu.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Negru")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camrynegru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Albastru")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camryalbastru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Cenusiu")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camrycenusiu.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Rosu")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camryrosu.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Camry")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Bronz")) {
                    imageLabel.setIcon(
                            new ImageIcon("imagini/camrybronz.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Land Cruiser")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Alb")) {
                    imageLabel.setIcon(
                            new ImageIcon(
                                    "imagini/landcruiseralb.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Land Cruiser")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Negru")) {
                    imageLabel.setIcon(
                            new ImageIcon(
                                    "imagini/landcruisernegru.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Land Cruiser")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Gri")) {
                    imageLabel.setIcon(
                            new ImageIcon(
                                    "imagini/landcruisergri.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Land Cruiser")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Bej")) {
                    imageLabel.setIcon(
                            new ImageIcon(
                                    "imagini/landcruiserbej.jpg"));
                }
                if (String.valueOf(modelsBox.getSelectedItem()).equals("Land Cruiser")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("Auriu")) {
                    imageLabel.setIcon(
                            new ImageIcon(
                                    "imagini/landcruiserauriu.jpg"));
                }
            }
        });

        // Buton Configure Car
        JPanel configureButtonPanel = new JPanel();
        configureButtonPanel.setBounds(100, 250, 300, 50);
        configureButtonPanel.setLayout(new GridBagLayout());
        configureButtonPanel.setBackground(Color.black);
        configurePanel.add(configureButtonPanel);

        // Eticheta Configure Car
        JLabel configureLabel = new JLabel("Configure Car");
        configureLabel.setFont(font1);
        configureLabel.setForeground(Color.white);
        configureButtonPanel.add(configureLabel);

        // Eveniment buton Configure Car
        configureButtonPanel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                configureButtonPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }

            public void mouseExited(MouseEvent e) {
                configureButtonPanel.setBorder(null);
            }

            public void mousePressed(MouseEvent e) {
                if (!String.valueOf(modelsBox.getSelectedItem()).equals("")
                        && !String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                    Search.start();
                    configureFrame.dispose();
                } else if (String.valueOf(modelsBox.getSelectedItem()).equals("")
                        && String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                    configureerrLabel.setText("Model and Color are not selected");
                } else if (String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                    configureerrLabel.setText("Color is not selected");
                }
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eveniment Cutie Models
        modelsBox.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!String.valueOf(modelsBox.getSelectedItem()).equals("")
                            && !String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                        Search.start();
                        configureFrame.dispose();
                    } else if (String.valueOf(modelsBox.getSelectedItem()).equals("")
                            && String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                        configureerrLabel.setText("Model and Color are not selected");
                    } else if (String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                        configureerrLabel.setText("Color is not selected");
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Eveniment Cutie Colors
        colorsBox.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!String.valueOf(modelsBox.getSelectedItem()).equals("")
                            && !String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                        Search.start();
                        configureFrame.dispose();
                    } else if (String.valueOf(modelsBox.getSelectedItem()).equals("")
                            && String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                        configureerrLabel.setText("Model and Color are not selected");
                    } else if (String.valueOf(colorsBox.getSelectedItem()).equals("")) {
                        configureerrLabel.setText("Color is not selected");
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Eticheta Log Out
        JLabel logoutLabel = new JLabel("Log Out");
        logoutLabel.setBounds(225, 305, 200, 15);
        logoutLabel.setFont(font3);
        logoutLabel.setForeground(Color.gray);
        configurePanel.add(logoutLabel);

        // Eveniment Log Out
        logoutLabel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                logoutLabel.setForeground(Color.darkGray);
            }

            public void mouseExited(MouseEvent e) {
                logoutLabel.setForeground(Color.gray);
            }

            public void mousePressed(MouseEvent e) {
                Login.start();
                configureFrame.dispose();
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Afisare fereastra Configure
        configureFrame.setVisible(true);
    }
}
