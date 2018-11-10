package com.obydul.fibo;

import java.util.Scanner;

public class FibonacciOne {

    public static void main(String[] args) {
        int num, firstNum = 0, secondNum = 1, fibo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = sc.nextInt();
        System.out.print(firstNum + " " + secondNum);
        for (int i = 3; i <= num; i++) {
            fibo = firstNum + secondNum;
            System.out.print(" " + fibo);
            firstNum = secondNum;
            secondNum = fibo;
        }
        System.out.println("");

        sc.close();

    }

}
