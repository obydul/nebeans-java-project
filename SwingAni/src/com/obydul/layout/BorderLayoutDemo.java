package com.obydul.layout;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class BorderLayoutDemo extends JFrame {

    private Container c;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private BorderLayout bLayout;

    BorderLayoutDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        bLayout = new BorderLayout();
        c.setLayout(bLayout);
        c.setBackground(Color.cyan);
        
        btn1 = new JButton("BTN1");
        btn2 = new JButton("BTN2");
        btn3 = new JButton("BTN3");
        btn4 = new JButton("BTN4");
        btn5 = new JButton("BTN5");
        
       c.add(btn1, BorderLayout.NORTH);
       c.add(btn2, BorderLayout.SOUTH);
       c.add(btn3, BorderLayout.EAST);
       c.add(btn4, BorderLayout.WEST);
       c.add(btn5, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        BorderLayoutDemo bl = new BorderLayoutDemo();
        bl.setVisible(true);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bl.setBounds(550, 200, 500, 500);
        bl.setTitle("Border Layout Demo");
    }

}
