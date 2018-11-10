package com.obydul.factorial;

import java.util.Scanner;

public class FactorialNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact = 1;
        System.out.print("Enter positive number = ");
        num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " = " + fact);
        System.out.println("");
        
    }
}
