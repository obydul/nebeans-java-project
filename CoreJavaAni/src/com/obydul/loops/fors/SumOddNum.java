package com.obydul.loops.fors;

import java.util.Scanner;

public class SumOddNum {
    
    public static void main(String[] args) {
        int m, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number = ");
        m = sc.nextInt();
        System.out.print("Enter Final Number = ");
        n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
                System.out.println("Odd Numbers = " + i);
            }
        }
        System.out.print("Sum All Odd Number = " + sum);
        System.out.println("");
    }
}
