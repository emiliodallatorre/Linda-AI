package com.EmilioDallaTorre;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JTextField inputArea;
    private JTextArea responseArea;
    private JPanel panel;

    public GUI(){
        createWindow();
    }


    void createWindow() {
        panel = new JPanel();
        inputArea.setText("Parla con l'intelligenza artificiale Linda!");
        responseArea.setEditable(false);
        responseArea.setLineWrap(true);
        panel.add(responseArea);
        panel.add(inputArea);
        inputArea.addActionListener(e -> Classify.classify(inputArea.getText()));
        panel.setLayout(new BorderLayout());
    }

    public void giveResponse(String risposta) {
            responseArea.append(risposta + '\n');
            responseArea.revalidate();
            responseArea.repaint();
            responseArea.setCaretPosition(responseArea.getText().length() - 1);
            System.out.println(risposta);
    }
    public JPanel getPanel(){
        return panel;
    }
}