package com.client;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Search {
    public static void start() {

        // Font
        Font font1 = new Font("Helvetica Neue", Font.BOLD, 20);
        Font font2 = new Font("Arial", 0, 18);
        Font font3 = new Font("Helvetica Neue", 0, 14);

        // Fereastra Search
        JFrame searchFrame = new JFrame();
        searchFrame.setSize(1470, 830);
        searchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        searchFrame.getContentPane().setBackground(Color.white);
        searchFrame.setLayout(null);

        // Panou Search
        JPanel searchPanel = new JPanel();
        searchPanel.setBounds(485, 400, 500, 400);
        searchPanel.setBackground(Color.white);
        searchPanel.setLayout(null);
        searchFrame.add(searchPanel);

        // Eticheta Country
        JLabel countryLabel = new JLabel("Country");
        countryLabel.setBounds(100, 25, 100, 21);
        countryLabel.setFont(font1);
        countryLabel.setForeground(Color.darkGray);
        searchPanel.add(countryLabel);

        // Cutie Countries
        String countries[] = { "", "Romania" };
        JComboBox<String> countriesBox = new JComboBox<String>(countries);
        countriesBox.setBounds(95, 55, 310, 25);
        countriesBox.setFont(font2);
        searchPanel.add(countriesBox);

        // Eticheta City
        JLabel cityLabel = new JLabel("City");
        cityLabel.setBounds(100, 125, 100, 21);
        cityLabel.setFont(font1);
        cityLabel.setForeground(Color.darkGray);
        searchPanel.add(cityLabel);

        // Cutie Cities
        JComboBox<String> citiesBox = new JComboBox<String>();
        citiesBox.setBounds(95, 155, 310, 25);
        citiesBox.setFont(font2);
        citiesBox.addItem("");
        searchPanel.add(citiesBox);

        // Eroare
        JLabel searcherrLabel = new JLabel();
        searcherrLabel.setBounds(100, 225, 300, 15);
        searcherrLabel.setFont(font3);
        searcherrLabel.setForeground(Color.red);
        searchPanel.add(searcherrLabel);

        // Eveniment Cutie Countries
        countriesBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = String.valueOf(countriesBox.getSelectedItem());
                citiesBox.removeAllItems();
                citiesBox.addItem("");
                searcherrLabel.setText("");

                if (selectedCountry.equals("Romania")) {
                    citiesBox.addItem("Alba Iulia");
                    citiesBox.addItem("Bacau");
                    citiesBox.addItem("Baia Mare");
                    citiesBox.addItem("Bistrita");
                    citiesBox.addItem("Braila");
                    citiesBox.addItem("Brasov");
                    citiesBox.addItem("Brasov Nord");
                    citiesBox.addItem("Bucuresti Est");
                    citiesBox.addItem("Bucuresti Nord");
                    citiesBox.addItem("Bucuresti Sud");
                    citiesBox.addItem("Bucuresti Vest");
                    citiesBox.addItem("Buzau");
                    citiesBox.addItem("Cluj Napoca");
                    citiesBox.addItem("Cluj Vest");
                    citiesBox.addItem("Constanta");
                    citiesBox.addItem("Craiova");
                    citiesBox.addItem("Focsani");
                    citiesBox.addItem("Iasi");
                    citiesBox.addItem("Iasi Est");
                    citiesBox.addItem("Odorhei");
                    citiesBox.addItem("Oradea");
                    citiesBox.addItem("Piatra Neamt");
                    citiesBox.addItem("Pitesti");
                    citiesBox.addItem("Ploiesti");
                    citiesBox.addItem("Satu Mare");
                    citiesBox.addItem("Sibiu");
                    citiesBox.addItem("Suceava");
                    citiesBox.addItem("Targoviste");
                    citiesBox.addItem("Targu Jiu");
                    citiesBox.addItem("Targu Mures");
                    citiesBox.addItem("Timisoara");
                    citiesBox.addItem("Valcea");
                }
            }
        });

        // Eveniment Cutie Cities
        citiesBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searcherrLabel.setText("");
            }
        });

        // Buton Search Dealership
        JPanel searchButtonPanel = new JPanel();
        searchButtonPanel.setBounds(100, 250, 300, 50);
        searchButtonPanel.setLayout(new GridBagLayout());
        searchButtonPanel.setBackground(Color.black);
        searchPanel.add(searchButtonPanel);

        // Eticheta Search Dealership
        JLabel searchLabel = new JLabel("Search Dealership");
        searchLabel.setFont(font1);
        searchLabel.setForeground(Color.white);
        searchButtonPanel.add(searchLabel);

        // Eveniment buton Search Dealership
        searchButtonPanel.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent e) {
                searchButtonPanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
            }

            public void mouseExited(MouseEvent e) {
                searchButtonPanel.setBorder(null);
            }

            public void mousePressed(MouseEvent e) {
                if (!String.valueOf(countriesBox.getSelectedItem()).equals("")
                        && !String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                    Dealership.selected(String.valueOf(citiesBox.getSelectedItem()));
                } else if (String.valueOf(countriesBox.getSelectedItem()).equals("")
                        && String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                    searcherrLabel.setText("Country and City are not selected");
                } else if (String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                    searcherrLabel.setText("City is not selected");
                }
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Eveniment Cutie Countries
        countriesBox.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!String.valueOf(countriesBox.getSelectedItem()).equals("")
                            && !String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                        Dealership.selected(String.valueOf(citiesBox.getSelectedItem()));
                    } else if (String.valueOf(countriesBox.getSelectedItem()).equals("")
                            && String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                        searcherrLabel.setText("Country and City are not selected");
                    } else if (String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                        searcherrLabel.setText("City is not selected");
                    }
                }
            }

            public void keyReleased(KeyEvent e) {

            }
        });

        // Eveniment Cutie Cities
        citiesBox.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!String.valueOf(countriesBox.getSelectedItem()).equals("")
                            && !String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                        Dealership.selected(String.valueOf(citiesBox.getSelectedItem()));
                    } else if (String.valueOf(countriesBox.getSelectedItem()).equals("")
                            && String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                        searcherrLabel.setText("Country and City are not selected");
                    } else if (String.valueOf(citiesBox.getSelectedItem()).equals("")) {
                        searcherrLabel.setText("City is not selected");
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
        searchPanel.add(logoutLabel);

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
                searchFrame.dispose();
            }

            public void mouseReleased(MouseEvent e) {

            }
        });

        // Imagine Logo Toyota
        ImageIcon image = new ImageIcon("imagini/toyota.png");
        JLabel imageLabel = new JLabel(image);
        imageLabel.setBounds(485, 0, 500, 500);
        searchFrame.add(imageLabel);

        // Afisare fereastra Search
        searchFrame.setVisible(true);
    }
}
