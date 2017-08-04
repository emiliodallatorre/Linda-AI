package com.EmilioDallaTorre;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    private JPanel panel;
    private JButton enterButton;
    private JTextField inputArea;
    private JTextArea responseArea;
    void createWindow(String risposta)  {
        JFrame frame = new JFrame("Linda-AI");
        panel.setLayout(new FlowLayout(450));
        responseArea.setText(risposta);
        responseArea.setEditable(false);
        inputArea.setText("Parla con l'intelligenza artificiale Linda!");
        enterButton.setText("Invia!");
        panel.add(responseArea);
        panel.add(enterButton);
        panel.add(inputArea);
        frame.add(panel);
        frame.setSize(450, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        enterButton.addActionListener(e -> Classify.classify(inputArea.getText()));
    }
}