package com.EmilioDallaTorre;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private JPanel panel;
    JTextArea LindaSAYS;
    public static void createWindow(String risposta) {
        JFrame frame = new JFrame("Linda");
        JLabel textLabel = new JLabel(risposta,SwingConstants.CENTER); textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setContentPane(new GUI().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}