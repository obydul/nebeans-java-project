package com.obydul.button;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class ToggleButtonDemo extends JFrame implements ActionListener {

    private Container c;
    private JToggleButton tb;
    private JLabel label;

    ToggleButtonDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);

        tb = new JToggleButton("OFF");
        tb.setBounds(50, 50, 90, 90);
        c.add(tb);

        label = new JLabel("Hello there");
        label.setVisible(false);
        label.setBounds(50, 150, 150, 50);
        c.add(label);
        tb.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tb.isSelected()) {
            tb.setText("ON");
            label.setVisible(true);
        } else {
            tb.setText("OFF");
            label.setVisible(false);

        }
    }

    public static void main(String[] args) {
        ToggleButtonDemo tbd = new ToggleButtonDemo();
        tbd.setVisible(true);
        tbd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tbd.setBounds(500, 150, 500, 500);
        tbd.setTitle("Toggle Button");
    }
}
