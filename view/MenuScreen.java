package view;

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuScreen {


    private JFrame window;


    public MenuScreen(JFrame window){
        this.window = window;

    }

    public void init(){
        Container cp = window.getContentPane();
        JPanel panel = new JPanel();
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        cp.add(BorderLayout.CENTER,panel);
    }
    
}
