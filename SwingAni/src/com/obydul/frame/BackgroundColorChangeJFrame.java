package com.obydul.frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class BackgroundColorChangeJFrame extends JFrame {

    private ImageIcon icon;
    private Container c;

    BackgroundColorChangeJFrame() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setBackground(Color.GREEN);
        icon = new ImageIcon(getClass().getResource("bangla.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        BackgroundColorChangeJFrame f = new BackgroundColorChangeJFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(250, 250, 350, 350);
        f.setTitle("Color Change Frame");

    }

    
}
