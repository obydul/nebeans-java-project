package com.obydul.message;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialog1 {

    public static void main(String[] args) {
        ImageIcon ic = new ImageIcon("bangla.png");
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", 0);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", 1);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", 2);
        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", 3);
        
        JOptionPane.showMessageDialog(null, "Correct Password", "Show Message", JOptionPane.PLAIN_MESSAGE, ic);
    }
}
