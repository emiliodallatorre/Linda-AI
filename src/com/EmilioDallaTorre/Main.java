package com.EmilioDallaTorre;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }
    private static void createAndShowGUI() {
        System.out.println("Initializing GUI.");
        JFrame frame = new JFrame();
        frame.setTitle("Linda-AI");
        frame.setLayout(new GridLayout(2, 1));
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new GUI().getPanel());
        frame.pack();
        frame.setVisible(true);
        System.out.println("GUI Initialized.");
    }
}