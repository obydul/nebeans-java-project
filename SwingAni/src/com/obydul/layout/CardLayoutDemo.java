package com.obydul.layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements  ActionListener{

    private Container c;
    private CardLayout cLayout;
    private JButton btn1, btn2, btn3;

    CardLayoutDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        cLayout = new CardLayout(20,20);
        c.setLayout(cLayout);

        btn1 = new JButton("btn 1");
        btn2 = new JButton("btn 2");
        btn3 = new JButton("btn 3");

        c.add(btn1, "first");
        c.add(btn2, "second");
        c.add(btn3, "third");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        cLayout.next(c);
    }

    public static void main(String[] args) {
        CardLayoutDemo cl = new CardLayoutDemo();
        cl.setVisible(true);
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cl.setBounds(550, 200, 500, 500);
        cl.setTitle("Card Layout");
    }


}
