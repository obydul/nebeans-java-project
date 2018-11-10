package com.obydul.layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo extends JFrame {

    private Container c;
    private JButton button[];
    private FlowLayout fLayout;

    FlowLayoutDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        fLayout = new FlowLayout();
        c.setLayout(fLayout);
        c.setBackground(Color.cyan);

        button = new JButton[15];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("BTN " + 1);
            c.add(button[i]);
        }

    }

    public static void main(String[] args) {
        FlowLayoutDemo bl = new FlowLayoutDemo();
        bl.setVisible(true);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bl.setBounds(550, 200, 500, 500);
        bl.setTitle("Flow Layout Demo");
    }
}
