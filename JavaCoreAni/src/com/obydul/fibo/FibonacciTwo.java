package com.obydul.fibo;

import java.util.Scanner;

public class FibonacciTwo {

    public static void main(String[] args) {
        int num, fibo, num1 = 0, num2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
        System.out.print(num1 + " " + num2);
        for (int i = 3; i <= num; i++) {
            fibo = num1 + num2;
            System.out.print(" " + fibo);
            num1 = num2;
            num2 = fibo;
        }
        sc.close();
        System.out.println("");

    }

}
