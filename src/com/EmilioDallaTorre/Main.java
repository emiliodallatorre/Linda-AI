package com.EmilioDallaTorre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI().createWindow("La luce!");
            }
        });
        for (; ; ) {
            Classify.classify(input.nextLine());
        }
    }
}