package com.obydul.control.statement;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer ");
        int x;
        x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even number");
        } else {
            System.out.println(x + " is odd number");
        }
         */

        Scanner sc = new Scanner(System.in);
        int fromNum, toNum;
        System.out.print("Enter From Number ");
        fromNum = sc.nextInt();
        System.out.print("Enter To Number ");
        toNum = sc.nextInt();
        for (int i = fromNum; i <=toNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            } else {
                System.out.println(i + " is odd  number");
            }
        }
    }
}
