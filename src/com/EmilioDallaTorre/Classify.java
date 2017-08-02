package com.EmilioDallaTorre;

public class Classify {
    public static void classify(String dico) {
        Boolean Wikipedia = dico.contains("Wikipedia");
        Boolean Meteo = dico.contains("tempo") || dico.contains("meteo");
        Boolean Latino = dico.contains("latino");

        if(Wikipedia) {
            Act.Wikipedia(dico);
        } else if(Meteo) {
            Act.Meteo(dico);
        } else if(Latino) {
            Act.Latino(dico);
        }
    }
}
