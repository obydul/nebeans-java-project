package com.obydul.component.actionlistener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenerDemo extends JFrame {

    private Container c;
    private JTextField t1, t2;

    ActionListenerDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        t1 = new JTextField();
        t1.setBounds(30, 20, 200, 30);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(30, 50, 200, 30);
        c.add(t2);

        t1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter somethine ");
                } else {
                    JOptionPane.showMessageDialog(null, "t1 = " + s);
                }
            }
        });
        
        t2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = t2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter somethine ");
                } else {
                    JOptionPane.showMessageDialog(null, "t2 = " + s);
                }
            }
        });

    }

    public static void main(String[] args) {
        ActionListenerDemo ald = new ActionListenerDemo();
        ald.setVisible(true);
        ald.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ald.setBounds(500, 150, 500, 500);
        ald.setTitle("Action Listener");
    }
}
