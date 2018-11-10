package com.obydul.controlstatement.ifelse;

import java.util.Scanner;

public class VowelConsonentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter ");
        ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowel");
        } else {
            System.out.println("consonent");
        }
    }

}
