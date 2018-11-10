/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava;

import java.util.Scanner;

/**
 *
 * @author bts-2
 */
public class FebonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter Number = ");
        number = sc.nextInt();
        int first = 0;
        int second = 1;
        int febo;
        System.out.print(first + " " + second);
        for (int i = 3; i <= number; i++) {
            febo = first + second;
            System.out.print(" " + febo);
            first = second;
            second = febo;
        }
        System.out.println();
    }
}
