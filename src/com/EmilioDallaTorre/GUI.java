package com.EmilioDallaTorre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
    private JPanel panel;
    private JTextField inputArea;
    JTextArea responseArea;
    JFrame frame = new JFrame("Linda-AI");

    void createWindow(String risposta) {
        panel.setLayout(new GridLayout(2, 2));
        inputArea.setText("Parla con l'intelligenza artificiale Linda!");
        panel.add(responseArea);
        panel.add(inputArea);
        responseArea.append(risposta);
        responseArea.setEditable(false);
        responseArea.setLineWrap(true);
        frame.add(panel);
        frame.setSize(450, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        inputArea.addActionListener((ActionEvent e) -> {
            new Classify().classify(inputArea.getText());
        });
    }
}