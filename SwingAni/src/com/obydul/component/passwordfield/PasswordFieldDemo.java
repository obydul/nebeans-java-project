package com.obydul.component.passwordfield;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordFieldDemo extends JFrame {

    private Container c;
    private JPasswordField p1, p2;
    private Font f;

    PasswordFieldDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial", Font.BOLD, 18);

        p1 = new JPasswordField();
        p1.setBounds(30, 20, 150, 30);
        p1.setBackground(Color.CYAN);
        p1.setFont(f);
        p1.setEchoChar('*');
        c.add(p1);

        p2 = new JPasswordField();
        p2.setBounds(30, 55, 150, 30);
        p2.setBackground(Color.CYAN);
        //p2.setEchoChar('*');
        c.add(p2);

    }

    public static void main(String[] args) {
        PasswordFieldDemo pf = new PasswordFieldDemo();
        pf.setVisible(true);
        pf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pf.setBounds(500, 150, 500, 500);
        pf.setTitle("Password Field Demo");
    }

}
