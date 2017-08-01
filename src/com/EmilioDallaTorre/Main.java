package com.EmilioDallaTorre;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String dico = input.nextLine();
            try {
                if (dico.substring(0, 15).equals("Che tempo fa a ")) {
                    Document tempometeo = null;
                    String cercometeo = dico.substring(15);
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
                    main(args);
                }
                if (dico.substring(0, 25).equals("Cosa significa in latino ")) {
                    Document significatoolivetti = null;
                    String cercolatino = dico.substring(25);
                    try {
                        significatoolivetti = Jsoup.connect("http://www.dizionario-latino.com/dizionario-latino-italiano.php?parola=" + cercolatino).userAgent("Mozilla").get();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String divs = significatoolivetti.select(".italiano").text();
                    if (!divs.equals("")) {
                        System.out.println("La parola latina " + cercolatino + " secondo il dizionario online di Olivetti, significa '" + divs + "'.");
                    } else {
                        System.out.println("Mi dispiace, non ho trovato un significato alla parola che mi hai chiesto di cercare...");
                    }
                    main(args);
                }
                if (dico.substring(0, 23).equals("Cosa dice Wikipedia di ")) {
                    Document significatowikipedia = null;
                    String cercowikipedia = dico.substring(23);
                    try {
                        significatowikipedia = Jsoup.connect("https://it.wikipedia.org/wiki/" + cercowikipedia.replace(" ", "_")).userAgent("Mozilla").get();
                } catch (HttpStatusException f) {
                        f.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String divs = significatowikipedia.select("p").text();
                    if (!divs.equals("")) {
                        System.out.println("La ricerca di " + cercowikipedia + " su wikipedia ha restituito il seguente risultato:");
                        System.out.println(divs);
                    } else {
                        System.out.println("Mi dispiace, non ho trovato informazioni su " + cercowikipedia + " su Wikipedia...");
                    }
                    main(args);
                }
            } catch (java.lang.StringIndexOutOfBoundsException e) {
                if (dico.equals("Ehy!")) {
                    System.out.println("Ciao, Emilio!");
                } else {
                    System.out.println("Non capisco cosa dici!");
                }
                main(args);
            }
        }
    }
