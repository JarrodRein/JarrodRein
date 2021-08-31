package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class PiggyBankSimulator {

    private JFrame window;
    private JTextArea display = new JTextArea();
    private JRadioButton[] radioButtons;

    public PiggyBankSimulator (JFrame window){
        this.window = window;
        window.setTitle("Piggy Bank Simulator");
    
}
    public void init(){
        Container cp = window.getContentPane();

        var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(500, 500));

        cp.add(BorderLayout.CENTER, scrollPane);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,1));
        cp.add(BorderLayout.SOUTH, southPanel);
        
        radioButtons = new JRadioButton[3];
        radioButtons[0] = new JRadioButton("Nickel");
        radioButtons[1] = new JRadioButton("Dime");
        radioButtons[2] = new JRadioButton("Quarter");

        JPanel radioPanel = new JPanel();
        for(var b: radioButtons){
            radioPanel.add(b);
        }


    }
}
