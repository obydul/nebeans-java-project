package com.obydul.layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {

    private Container c;
    private JButton button[];
    private GridLayout fLayout;

    GridLayoutDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        fLayout = new GridLayout(5,5);
        c.setLayout(fLayout);
        c.setBackground(Color.cyan);

        button = new JButton[15];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("BTN " + 1);
            c.add(button[i]);
        }

    }

    public static void main(String[] args) {
        GridLayoutDemo bl = new GridLayoutDemo();
        bl.setVisible(true);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bl.setBounds(550, 200, 500, 500);
        bl.setTitle("Grid Layout Demo");
    }
}
