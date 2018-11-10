package com.obydul.component.label;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelImageText extends JFrame {

    private Container c;
    private JLabel label;
    private ImageIcon img;

    LabelImageText() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        img = new ImageIcon(getClass().getResource("bangla.png"));
        label = new JLabel("This is an image",img,JLabel.LEFT);
        label.setBounds(50, 30, 250,50);
        c.add(label);

        
    }

    public static void main(String[] args) {
        LabelImageText ld = new LabelImageText();
        ld.setVisible(true);
        ld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ld.setBounds(250, 150, 500, 500);
        ld.setTitle("Label Image And Text");
    }

}
