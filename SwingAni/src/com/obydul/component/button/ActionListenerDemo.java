package com.obydul.component.button;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ActionListenerDemo extends JFrame {
    
    private Container c;
    private JTextField tx;
    private JButton b1, b2;
    private Font f;
    private Cursor cursor;
    private ImageIcon img;
    
    ActionListenerDemo() {
        initComponent();
    }
    
    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.ITALIC, 20);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        img = new ImageIcon(getClass().getResource("Save.png"));
        
        tx = new JTextField();
        tx.setBounds(30, 20, 200, 40);
        c.add(tx);
        
        b1 = new JButton("Save");
        b1.setBounds(30, 70, 100, 40);
        b1.setFont(f);
        b1.setBackground(Color.red);
        b1.setForeground(Color.BLUE);
        b1.setCursor(cursor);
        c.add(b1);
        
        cursor = new Cursor(Cursor.WAIT_CURSOR);
        f = new Font("Times New Roman", Font.BOLD, 20);
        b2 = new JButton();
        b2.setBounds(30, 120, 100, 40);
        b2.setFont(f);
        b2.setText("Clear");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.CYAN);
        b2.setCursor(cursor);
        c.add(b2);
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tx.setText("");
            }
        });
    }
    
    public static void main(String[] args) {
        ActionListenerDemo bd = new ActionListenerDemo();
        bd.setVisible(true);
        bd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bd.setBounds(400, 150, 500, 500);
        bd.setTitle("Button Demo");
    }
}
