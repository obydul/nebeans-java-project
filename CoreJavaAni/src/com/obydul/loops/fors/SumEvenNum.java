package com.obydul.loops.fors;

import java.util.Scanner;

public class SumEvenNum {

    public static void main(String[] args) {
        int m, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        m = sc.nextInt();
        System.out.print("Enter Final Number = ");
        n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println("Even Numbers = " + i);
            }
        }
        System.out.print("Sum All Even Number = " + sum);
        System.out.println("");
    }
}
