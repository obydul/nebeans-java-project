package com.obydul.series;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any integer num : ");
        num = sc.nextInt();
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;

            }
        }
        if (count == 0) {
            System.out.println(num + " is Prime number");
        } else {
            System.out.println(num + " is Not Prime number");
        }
    }

}
