package com.obydul.component.actionlistener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenerDemoTwo extends JFrame {

    private Container c;
    private JTextField t1, t2;

    ActionListenerDemoTwo() {
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

        Handler handler = new Handler();
        t1.addActionListener(handler);
        t2.addActionListener(handler);

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == t1) {

                String s = t1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter somethine ");
                } else {
                    JOptionPane.showMessageDialog(null, "t1 = " + s);
                }
            } else {
                String s = t2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter somethine ");
                } else {
                    JOptionPane.showMessageDialog(null, "t2 = " + s);
                }
            }
        }
    }

    public static void main(String[] args) {
        ActionListenerDemoTwo ald = new ActionListenerDemoTwo();
        ald.setVisible(true);
        ald.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ald.setBounds(500, 150, 500, 500);
        ald.setTitle("Action Listener");
    }
}
