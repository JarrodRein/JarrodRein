package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

//import javax.print.CancelablePrintJob;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.ButtonClickListener;

public class CalculatorSimulator {
    private JFrame window;
    private JTextArea display = new JTextArea();
    private JButton addButton = new JButton("+");
    private JButton subtractButoon = new JButton("-");
    private JButton mulButton = new JButton("x");
    private JButton divButton = new JButton("/");
    private JButton enterButton = new JButton("Enter");
    private JButton resultButton = new JButton("Result");
    private JButton exitButton = new JButton("Exit");
    private JTextField numField = new JTextField(10);

    public CalculatorSimulator(JFrame windwo){
        this.window = windwo;
    }

    public void init(){
        Container cp = window.getContentPane();
        var scrollpane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollpane.setPreferredSize(new Dimension(500,500));
        cp.add(BorderLayout.CENTER, scrollpane);

        JPanel southPanel = new JPanel();
        cp.add(BorderLayout.SOUTH, southPanel);

        southPanel.setLayout(new GridLayout(3,1));
        JPanel row1 = new JPanel();
        row1.add(numField);
        row1.add(enterButton);
        southPanel.add(row1);

        JPanel row2 = new JPanel();
        row2.add(addButton);
        row2.add(subtractButoon);
        row2.add(mulButton);
        row2.add(divButton);
        southPanel.add(row2);

        JPanel row3 = new JPanel();
        row3.add(resultButton);
        row3.add(exitButton);
        southPanel.add(row3);

        ButtonClickListener buttonClickListener = new ButtonCLickListener(this);
        addButton.addActionListener(buttonClickListener);
        mulButton.addActionListener(buttonClickListener);
        subtractButoon.addActionListener(buttonClickListener);
        divButton.addActionListener(buttonClickListener);
        resultButton.addActionListener(buttonClickListener);
        exitButton.addActionListener(buttonClickListener);
    }
}
