package com.obydul.message.showinputdialog;

import javax.swing.JOptionPane;

public class InputDialogTwo {

    public static void main(String[] args) {
        String f_name = JOptionPane.showInputDialog(null, "Enter your name ", "This is title", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog("Enter your last name");
        String name = f_name +" " +  l_name;
        JOptionPane.showMessageDialog(null, "Your name is " + name);
    }
}
