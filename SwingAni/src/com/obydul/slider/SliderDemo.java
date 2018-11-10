package com.obydul.slider;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderDemo extends JFrame {
    
    private Container c;
    private JSlider slider;
    
    SliderDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        slider = new JSlider(0,20,5);
        slider.setBounds(100, 50, 300, 50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        c.add(slider);
        
    }
    
    public static void main(String[] args) {
        SliderDemo sd = new SliderDemo();
        sd.setVisible(true);
        sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sd.setBounds(450, 100, 500, 500);
        sd.setTitle("Slider Demo");
    }
}
