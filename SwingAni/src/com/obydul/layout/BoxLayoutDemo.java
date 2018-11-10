package com.obydul.layout;

import java.awt.Color;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo  extends JFrame {

    private Container c;
    private JButton button[];
    private BoxLayout fLayout;

    BoxLayoutDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        fLayout = new BoxLayout(c, BoxLayout.Y_AXIS);
        c.setLayout(fLayout);
        c.setBackground(Color.cyan);

        button = new JButton[15];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("BTN " + 1);
            c.add(button[i]);
        }

    }

    public static void main(String[] args) {
        BoxLayoutDemo bl = new BoxLayoutDemo();
        bl.setVisible(true);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bl.setBounds(550, 200, 500, 500);
        bl.setTitle("Box Layout Demo");
    }
    
}
