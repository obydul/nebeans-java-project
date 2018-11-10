package com.obydul.frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class IconChangeJFrame extends JFrame {

    private ImageIcon icon;

    IconChangeJFrame() {
        initComponents();
    }

    public void initComponents() {
        icon = new ImageIcon(getClass().getResource("bangla.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        IconChangeJFrame f = new IconChangeJFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(250, 250, 350, 350);
        f.setTitle("Icon Change Frame");

    }

}
