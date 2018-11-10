package com.obydul.oddeven;

import java.util.Scanner;

public class OddEvenTest {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num = ");
        num = sc.nextInt();
        System.out.println("");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number : " + i);
            } else {
                System.out.println("Odd  number : " + i);
            }
        }
        System.out.println("");
    }
}
