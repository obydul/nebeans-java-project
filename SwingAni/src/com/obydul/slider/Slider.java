package com.obydul.slider;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame implements ChangeListener {

    private Container c;
    private JLabel lblRed, lblGreen, lblBlue, lblPreview;
    private JSlider slRed, slGreen, slBlue;
    private JTextField txtRed, txtGreen, txtBlue;
    private JPanel panel;

    Slider() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);

        lblRed = new JLabel("Red");
        lblRed.setBounds(50, 50, 80, 50);
        c.add(lblRed);

        slRed = new JSlider(0, 250, 0);
        slRed.setBounds(90, 50, 300, 50);
        c.add(slRed);

        txtRed = new JTextField();
        txtRed.setHorizontalAlignment(JTextField.CENTER);
        txtRed.setBounds(400, 50, 80, 50);
        c.add(txtRed);

        lblGreen = new JLabel("Greed");
        lblGreen.setBounds(50, 110, 80, 50);
        c.add(lblGreen);

        slGreen = new JSlider(0, 250, 0);
        slGreen.setBounds(90, 110, 300, 50);
        c.add(slGreen);

        txtGreen = new JTextField();
        txtGreen.setHorizontalAlignment(JTextField.CENTER);
        txtGreen.setBounds(400, 110, 80, 50);
        c.add(txtGreen);

        lblBlue = new JLabel("Blue");
        lblBlue.setBounds(50, 170, 80, 50);
        c.add(lblBlue);

        slBlue = new JSlider(0, 250, 0);
        slBlue.setBounds(90, 170, 300, 50);
        c.add(slBlue);

        txtBlue = new JTextField();
        txtBlue.setHorizontalAlignment(JTextField.CENTER);
        txtBlue.setBounds(400, 170, 80, 50);
        c.add(txtBlue);

        panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setBounds(550, 50, 200, 160);
        c.add(panel);

        lblPreview = new JLabel("Preview");
        lblPreview.setBounds(630, 210, 200, 50);
        c.add(lblPreview);

        slRed.addChangeListener(this);
        slGreen.addChangeListener(this);
        slBlue.addChangeListener(this);;

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int redVal = slRed.getValue();
        int greedVal = slGreen.getValue();
        int blueVal = slBlue.getValue();

        txtRed.setText("" + redVal);
        txtGreen.setText("" + greedVal);
        txtBlue.setText("" + blueVal);

        Color color = new Color(redVal, greedVal, blueVal);
        panel.setBackground(color);
    }

    public static void main(String[] args) {
        Slider s = new Slider();
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setBounds(500, 100, 800, 500);
        s.setTitle("Slider Show");

    }

}
