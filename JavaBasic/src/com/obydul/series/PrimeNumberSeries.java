package com.obydul.series;

import java.util.Scanner;

public class PrimeNumberSeries {
//https://www.tutorialgateway.org/java-program-to-print-prime-numbers-from-1-to-n/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, a, fromNum, count, toNum;
        System.out.print("Enter first number : ");
        fromNum = sc.nextInt();
        System.out.print("Enter last number : ");
        toNum = sc.nextInt();
        sc.close();
        
        for (a = fromNum; a <= toNum; a++) {
            count = 0;
            for (i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && a != 1) {
                System.out.println(a + " is prime ");
            } else {
                System.out.println(a + " is not prime ");
            }
        }
        System.out.println("");
    }

}
