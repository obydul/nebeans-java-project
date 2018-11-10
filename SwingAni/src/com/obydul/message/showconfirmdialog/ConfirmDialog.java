package com.obydul.message.showconfirmdialog;

import javax.swing.JOptionPane;

public class ConfirmDialog {

    public static void main(String[] args) {
        int value = JOptionPane.showConfirmDialog(null, "Do u want to quit?", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        if (value == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            System.out.println("You have clicked no option");
        }
    }

}
