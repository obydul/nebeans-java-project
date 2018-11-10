package com.obydul.frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

    private JLabel userLabel, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private Container c;
    private Font f;

    LoginFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(350, 150, 500, 500);
        this.setTitle("Login Frame");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
        f = new Font("Arial", Font.ITALIC, 16);

        userLabel = new JLabel("User Name :");
        userLabel.setBounds(20, 20, 150, 30);
        userLabel.setFont(f);
        c.add(userLabel);

        tf = new JTextField();
        tf.setBounds(210, 20, 200, 30);
        tf.setFont(f);
        c.add(tf);
    }

    public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
    }
}
