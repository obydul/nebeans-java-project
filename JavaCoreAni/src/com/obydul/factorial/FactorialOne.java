package com.obydul.factorial;

import java.util.Scanner;

public class FactorialOne {

    public static void main(String[] args) {
        int num1, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num1 = sc.nextInt();
        for (int i = num1; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num1 + " is = " + fact);
    }

}
