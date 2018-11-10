package com.obydul.primenumber;

import java.util.Scanner;

public class PrimeNumberThree {

    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " not prime");
        }
        sc.close();
    }

}
