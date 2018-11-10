package com.obydul.series;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, result = 1;
        System.out.print("Enter factorial num : ");
        num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            result = result * i;
        }
        System.out.println("Factorial value of " + num + " is " + result);
    }
}
