package com.obydul.oddeven;

import java.util.Scanner;

public class EvenOddTwo {

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 : ");
        num1 = sc.nextInt();
        System.out.print("Enter num 2 : ");
        num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            } else {
                System.out.println(i + " is odd number");
            }
        }
    }
}
