package com.EmilioDallaTorre;

public class Classify {
    public static void classify(String dico) {
        Boolean Wikipedia = dico.contains("Wikipedia");
        Boolean Meteo = dico.contains("tempo") || dico.contains("meteo");
        Boolean Latino = dico.contains("significa") && dico.contains("latino") || dico.contains("latino");
        Boolean Timer = dico.contains("significa") || dico.contains("italiano") || dico.contains("vuol dire");
        if(Wikipedia) {
            Act.Wikipedia(dico);
        } else if(Meteo) {
            Act.Meteo(dico);
        } else if(Latino) {
            Act.Latino(dico);
        } else if(Timer) {
            Act.Italiano(dico);
        }
    }
}
