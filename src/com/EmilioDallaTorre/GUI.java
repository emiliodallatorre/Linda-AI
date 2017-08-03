package com.EmilioDallaTorre;

import javax.swing.*;

public class GUI {
    private JPanel frame;
    JTextArea responseArea;
    JTextField inputArea;
    JButton enterButton;
    public JTextArea getTextArea() {
        return responseArea;
    }
    void createWindow(String risposta) {
        JFrame frame = new JFrame("Linda");
        responseArea.append(risposta);
        getTextArea().append(risposta);
        System.out.println(risposta);
        frame.getContentPane().add(responseArea);
        frame.getContentPane().add(inputArea);
        frame.getContentPane().add(enterButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}