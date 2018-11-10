package com.obydul.spinner;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerDemo extends JFrame implements ChangeListener {

    private Container c;
    private JSpinner spinner;
    private JLabel label;

    SpinnerDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        SpinnerNumberModel value = new SpinnerNumberModel(10, 0, 30, 1);

        spinner = new JSpinner(value);
        spinner.setBounds(100, 100, 100, 50);
        c.add(spinner);

        label = new JLabel();
        label.setBounds(100, 200, 150, 50);
        c.add(label);

        spinner.addChangeListener(this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String number = spinner.getValue().toString();
        int value = Integer.parseInt(number);
        label.setText("Current value : " + value);
    }

    public static void main(String[] args) {
        SpinnerDemo sd = new SpinnerDemo();
        sd.setVisible(true);
        sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sd.setBounds(500, 100, 500, 500);
        sd.setTitle("Spinner Demo");
    }

}
