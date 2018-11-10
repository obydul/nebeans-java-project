package com.obydul.frame;

import javax.swing.JFrame;

//public class FrameDemo{
public class FrameDemo extends JFrame{

    public static void main(String[] args) {
        //JFrame frame = new JFrame();
        FrameDemo frame = new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(250,300);
        //frame.setLocation(500,200);
        frame.setBounds(500, 200, 400, 350);
        frame.setTitle("First Swing Frame");
        frame.setResizable(false);
    }
}
