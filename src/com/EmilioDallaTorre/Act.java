package com.EmilioDallaTorre;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Act {
    public static void Meteo(String dico) {
        Document tempometeo = null;
        String cercometeo = dico.substring(dico.lastIndexOf(" a ") + 3);
        try {
            tempometeo = Jsoup.connect("https://www.bing.com/search?q=meteo+" + cercometeo).userAgent("Mozilla").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String media = tempometeo.select(".b_focusTextLarge").text();
        String minima = tempometeo.select(".wtr_low").first().text();
        String massima = tempometeo.select(".wtr_high").first().text();
        String precipitazioni = tempometeo.select(".wtr_currPerci").text();
        String vento = tempometeo.select(".wtr_currWind").text();
        String umidità = tempometeo.select(".wtr_currHumi").text();
        System.out.println("Ecco le condizioni meteo di " + cercometeo + ":");
        System.out.println(media + "° la temperatura media registrata in questi giorni;");
        System.out.println(minima + " la temperatura minima registrata in questi giorni;");
        System.out.println(massima + " la temperatura massima registrata in questi giorni;");
        System.out.println(precipitazioni + ";");
        System.out.println(vento + ";");
        System.out.println(umidità + ".");
    }

    public static void Latino(String dico) {
        Document significatoolivetti = null;
        try {
            String cercolatino = dico.substring((dico.indexOf("'")) + 1, (dico.lastIndexOf("'")));
            significatoolivetti = Jsoup.connect("http://www.dizionario-latino.com/dizionario-latino-italiano.php?parola=" + cercolatino).userAgent("Mozilla").get();
            String divs = significatoolivetti.select(".italiano").text();
            if (!divs.equals("")) {
                System.out.println("La parola latina '" + cercolatino + "' secondo il dizionario online di Olivetti, significa '" + divs + "'.");
            } else {
                System.out.println("Mi dispiace, non ho trovato un significato alla parola che mi hai chiesto di cercare...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException f) {
            System.out.println("Ricorda che, perché io cerchi il significato di una parola, occorre che tu la definisca fra due virgolette!");
        }
    }

    public static void Italiano(String dico) {
        Document significatoolivetti = null;
        String cercoitaliano = dico.substring((dico.indexOf("'")) + 1, (dico.lastIndexOf("'")));
        try {
            significatoolivetti = Jsoup.connect("http://www.dizionario-italiano.it/dizionario-italiano.php?parola=" + cercoitaliano).userAgent("Mozilla").get();
            String divs = significatoolivetti.select(".italiano").text();
            if (!divs.equals("")) {
                System.out.println("La parola italiana '" + cercoitaliano + "' secondo il dizionario online di Olivetti, significa '" + divs + "'.");
            } else {
                System.out.println("Mi dispiace, non ho trovato un significato alla parola che mi hai chiesto di cercare...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException f) {
            System.out.println("Ricorda che, perché io cerchi il significato di una parola, occorre che tu la definisca fra due virgolette!");
        }
    }

    public static void Wikipedia(String dico) {
        Document significatowikipedia = null;
        String cercowikipedia = dico.substring((dico.indexOf("'")) + 1, (dico.lastIndexOf("'")));
        try {
            significatowikipedia = Jsoup.connect("https://it.wikipedia.org/wiki/" + cercowikipedia.replace(" ", "_")).userAgent("Mozilla").get();
            String divs = significatowikipedia.select("p").text();
            if (!divs.equals("")) {
                System.out.println("La ricerca di " + cercowikipedia + " su wikipedia ha restituito il seguente risultato:");
                System.out.println(divs);
            } else {
                System.out.println("Mi dispiace, non ho trovato informazioni su " + cercowikipedia + " su Wikipedia...");
            }
        } catch (HttpStatusException e) {
            System.out.println("Mi dispiace, Wikipedia sembra non avere una voce per '" + cercowikipedia +"'...");
        } catch (java.io.IOException f) {
            f.printStackTrace();
        } catch (StringIndexOutOfBoundsException g) {
            System.out.println("Ricorda che, perché io cerchi informazioni riguardo a qualcosa, occorre che tu la definisca fra due virgolette!");
        }
    }
}