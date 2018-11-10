package com.obydul.fibonacci;

import java.util.Scanner;

public class FiboDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fibo, firstNum = 0, secondNum = 1;
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
    }
}
