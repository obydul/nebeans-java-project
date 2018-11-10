package com.obydul.message.showinputdialog;

import javax.swing.JOptionPane;

public class InputDialog {

    public static void main(String[] args) {
        String inputValue = JOptionPane.showInputDialog("Enter your name : ");
        System.out.println(inputValue);
        JOptionPane.showMessageDialog(null, inputValue + " welcome to my home ");
    }
}
