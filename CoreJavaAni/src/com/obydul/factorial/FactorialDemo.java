package com.obydul.factorial;

import java.util.Scanner;

public class FactorialDemo {

    public static void main(String[] args) {
        int num, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number = ");
        num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial Number of " + num + " = " + fact);
    }
}
