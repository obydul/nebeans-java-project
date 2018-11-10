package com.obydul.loops.fors;

import java.util.Scanner;

public class SumInputNumbers {

    public static void main(String[] args) {
        int m, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        m = sc.nextInt();
        System.out.print("Enter Final number = ");
        n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            sum = sum + i;
            System.out.println("Numbers = " + i);
        }
        System.out.print("Sum All Number = " + sum);
        System.out.println("");
    }
}
