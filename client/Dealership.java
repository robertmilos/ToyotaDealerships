package com.client;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Dealership {
    public static void selected(String c) {
        String city = c;
        Desktop d = Desktop.getDesktop();
        if (city.equals("Alba Iulia"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/alba-iulia"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Bacau"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/bacau"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Baia Mare"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/baia-mare"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Bistrita"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/bistrita"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Braila"))
            try {
                d.browse(new URI("https://www.toyotabraila.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Brasov"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/brasov"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Brasov Nord"))
            try {
                d.browse(new URI("https://www.toyotabrasov.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Bucuresti Est"))
            try {
                d.browse(new URI("https://toyota.aviamotors.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Bucuresti Nord"))
            try {
                d.browse(new URI("https://toyotabucurestinord.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Bucuresti Sud"))
            try {
                d.browse(new URI("https://toyotasud.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Bucuresti Vest"))
            try {
                d.browse(new URI("https://toyotavest.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Buzau"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/buzau"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Cluj Napoca"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/cluj-napoca"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Cluj Vest"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/cluj-vest"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Constanta"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/constanta"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Craiova"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/craiova"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Focsani"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/focsani"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Iasi"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/iasi"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Iasi Est"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/iasi-est"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Odorhei"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/odorhei"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Oradea"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/oradea"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Piatra Neamt"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/piatra-neamt"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Pitesti"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/pitesti"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Ploiesti"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/ploiesti"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Satu Mare"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/satu-mare"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Sibiu"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/sibiu"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Suceava"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/suceava"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Targoviste"))
            try {
                d.browse(new URI("https://targoviste.toyota.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Targu Jiu"))
            try {
                d.browse(new URI("https://targujiu.toyota.ro"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Targu Mures"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/targu-mures"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Timisoara"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/timisoara"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        if (city.equals("Valcea"))
            try {
                d.browse(new URI("https://www.toyota.ro/dealers/valcea"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }

    }
}
