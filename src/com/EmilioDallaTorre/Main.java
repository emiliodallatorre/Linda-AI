package com.EmilioDallaTorre;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new GUI().createWindow();
            new GUI().giveResponse("Benvenuto, utente...");
        });
    }
}