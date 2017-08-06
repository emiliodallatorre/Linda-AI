package com.EmilioDallaTorre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
    private JTextField inputArea;
    private JTextArea responseArea;
    private JFrame frame = new JFrame("Linda-AI");
    private GridLayout layout = new GridLayout(2, 2);
    private JPanel panel = new JPanel(layout);

    void createWindow() {
        inputArea.setText("Parla con l'intelligenza artificiale Linda!");
        panel.add(responseArea);
        panel.add(inputArea);
        frame.add(panel);
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        inputArea.addActionListener((ActionEvent e) -> Classify.classify(inputArea.getText()));
    }

    void giveResponse(final String risposta) {
        new Thread(SwingUtilities.invokeLater(() -> {
            responseArea.setEditable(false);
            responseArea.setLineWrap(true);
            responseArea.append(risposta + '\n');
            panel.add(responseArea);
            revalidate();
            repaint();
        })).start();
    }
}