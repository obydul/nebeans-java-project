package com.obydul.component.label;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {

    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;

    LabelDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        f = new Font("Arial", Font.BOLD, 14);

        userLabel = new JLabel();
        userLabel.setText("User Name");
        userLabel.setBounds(50, 20, 150, 20);
        userLabel.setFont(f);
        userLabel.setForeground(Color.red);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.YELLOW);
        userLabel.setToolTipText("Enter your user name ");
        c.add(userLabel);
        System.out.println(userLabel.getText());
        String s = userLabel.getToolTipText();
        System.out.println(s);

        f = new Font("Arial", Font.ITALIC, 14);
        passLabel = new JLabel("Password");
        passLabel.setBounds(50, 40, 150, 20);
        passLabel.setFont(f);
        passLabel.setForeground(Color.red);
        passLabel.setOpaque(true);
        passLabel.setBackground(Color.CYAN);
        passLabel.setToolTipText("Enter your password");
        c.add(passLabel);

    }

    public static void main(String[] args) {
        LabelDemo ld = new LabelDemo();
        ld.setVisible(true);
        ld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ld.setBounds(250, 150, 500, 500);
        ld.setTitle("Label Demo");
    }
}
