package com.obydul.slideshow;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlideShow extends JFrame implements ActionListener {

    private Container c;
    private JPanel panel;
    private JButton prevButton, nextButton;
    private ImageIcon icon;
    private JLabel label;
    private CardLayout card;

    SlideShow() {
        initComponent();
        showImage();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        card = new CardLayout();

        panel = new JPanel(card);
        panel.setBounds(15, 15, 550, 450);
        c.add(panel);

        prevButton = new JButton("Previous");
        prevButton.setBounds(10, 500, 100, 40);
        c.add(prevButton);

        nextButton = new JButton("Next");
        nextButton.setBounds(480, 500, 100, 40);
        c.add(nextButton);

        prevButton.addActionListener(this);
        nextButton.addActionListener(this);

    }

    public void showImage() {
        String[] names = {"cat.jpg", "snow.jpg", "kid.jpg", "game.png"};
        for (String n : names) {

            icon = new ImageIcon("src/images/" + n);

            System.out.println(icon);
            // resizing the image
            Image img = icon.getImage();
            Image newImage = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);

            System.out.println(newImage);

            label = new JLabel(icon);
            panel.add(label);

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {
            card.previous(panel);
        }
        if (e.getSource() == nextButton) {
            card.next(panel);
        }

    }

    public static void main(String[] args) {
        SlideShow ss = new SlideShow();
        ss.setVisible(true);
        ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ss.setBounds(500, 100, 600, 600);
        ss.setTitle("Slide Show");
    }

}
