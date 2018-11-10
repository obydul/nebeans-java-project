package com.obydul.component.button;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame {

    private Container c;
    private JButton b1, b2;
    private Font f;
    private Cursor cursor;
    private ImageIcon img;

    ButtonDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.ITALIC, 20);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        img = new ImageIcon(getClass().getResource("Save.png"));

        //b1 = new JButton("Save");
        b1 = new JButton(img);
        b1.setBounds(30, 20, 100, 40);
        b1.setFont(f);
        b1.setBackground(Color.red);
        b1.setForeground(Color.BLUE);
        b1.setCursor(cursor);
        c.add(b1);

        cursor = new Cursor(Cursor.WAIT_CURSOR);
        f = new Font("Times New Roman", Font.BOLD, 20);
        b2 = new JButton();
        b2.setBounds(30, 70, 100, 40);
        b2.setFont(f);
        b2.setText("Clear");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.CYAN);
        b2.setCursor(cursor);
        c.add(b2);
    }

    public static void main(String[] args) {
        ButtonDemo bd = new ButtonDemo();
        bd.setVisible(true);
        bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bd.setBounds(400, 150, 500, 500);
        bd.setTitle("Button Demo");
    }

}
