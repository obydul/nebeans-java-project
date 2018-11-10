package com.obydul.frame;

import javax.swing.JFrame;

public class FrameTest extends JFrame {

    FrameTest() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250, 250, 350, 350);
        setTitle("Swing Frame");
    }

    public static void main(String[] args) {
        FrameTest f = new FrameTest();
        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setBounds(250, 250, 350, 350);
//        f.setTitle("Swing Frame");
    }
}
