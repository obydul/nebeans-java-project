
package com.obydul.control.statement;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter character ");
        ch = sc.next().charAt(0);
        if (ch == 'a') {
            System.out.println("Vowel " + ch);
        }
        else if (ch == 'e') {
            System.out.println("Vowel " + ch);
        }
        else if (ch == 'i') {
            System.out.println("Vowel " + ch);
        }
        else if (ch == 'o') {
            System.out.println("Vowel " + ch);
        }
        else if (ch == 'u') {
            System.out.println("Vowel " + ch);
        }
        else {
            System.out.println("Consonent " + ch);
        }
                
    }
}
