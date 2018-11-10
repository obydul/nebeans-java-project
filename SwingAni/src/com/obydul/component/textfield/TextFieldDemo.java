package com.obydul.component.textfield;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldDemo extends JFrame {

    private JTextField tf1, tf2;
    private Container c;
    private Font f;

    TextFieldDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        
        f = new Font("Arial", Font.ITALIC+Font.BOLD, 18);
        
        tf1 = new JTextField();
        tf1.setBounds(50, 30, 250, 30);
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBackground(Color.YELLOW);
        tf1.setHorizontalAlignment(JTextField.RIGHT);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(50, 70, 250, 30);
        tf2.setFont(f);
        tf2.setText("tf2");
        tf2.setForeground(Color.red);
        tf2.setBackground(Color.YELLOW);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
    }

    public static void main(String[] args) {
        TextFieldDemo txd = new TextFieldDemo();
        txd.setVisible(true);
        txd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txd.setBounds(50, 50, 500, 500);
        txd.setTitle("Text Field Demo");
    }

}
