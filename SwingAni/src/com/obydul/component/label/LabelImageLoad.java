package com.obydul.component.label;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelImageLoad extends JFrame {

    private Container c;
    private JLabel imgLabel;
    private ImageIcon img;

    LabelImageLoad() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        
        img = new ImageIcon(getClass().getResource("bangla.png"));
        imgLabel = new JLabel(img);
        //imgLabel.setBounds(50, 30, 150, 20);
        imgLabel.setBounds(50, 30, img.getIconWidth(),img.getIconHeight());
        c.add(imgLabel);

    }

    public static void main(String[] args) {
        LabelImageLoad ld = new LabelImageLoad();
        ld.setVisible(true);
        ld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ld.setBounds(250, 150, 500, 500);
        ld.setTitle("Label Image");
    }
    
}
