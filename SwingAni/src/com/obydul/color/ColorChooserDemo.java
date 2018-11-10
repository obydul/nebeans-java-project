package com.obydul.color;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooserDemo extends JFrame {

    private Container c;
    private JButton bt;

    ColorChooserDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);

        bt = new JButton("Choose a Color");
        bt.setBounds(100, 50, 150, 50);
        c.add(bt);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Select a color", Color.yellow);
                c.setBackground(color);
            }
        });
    }

    public static void main(String[] args) {
        ColorChooserDemo cc = new ColorChooserDemo();
        cc.setVisible(true);
        cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc.setBounds(500, 100, 500, 500);
        cc.setTitle("Color Chooser");
    }

}
