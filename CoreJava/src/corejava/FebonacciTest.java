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
public class FebonacciTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("How many number ");
        number = sc.nextInt();

        int first = 0;
        int second = 1;
        int fibo;
        System.out.print(first + " " + second);

        for (int i = 3; i <= number; i++) {
            fibo = first + second;
            System.out.print(" " + fibo);
            first = second;
            second = fibo;
        }
        System.out.println();

    }
}
