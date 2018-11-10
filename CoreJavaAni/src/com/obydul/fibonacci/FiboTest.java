
package com.obydul.fibonacci;

import java.util.Scanner;

public class FiboTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers = ");
        int num = sc.nextInt();
        int numOne = 0, numTwo = 1, fibo;
        System.out.print(numOne + " " + numTwo);
        for (int i = 3; i <= num; i++) {
            fibo = numOne + numTwo;
            System.out.print(" " + fibo);
            numOne = numTwo;
            numTwo = fibo;
        }
        System.out.println("");
        
    }
}
