package com.obydul.primenumber.series;

import java.util.Scanner;

public class PrimeNumberSeriesTwo {

    public static void main(String[] args) {
        int num, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = sc.nextInt();
        System.out.println("Prime numbers up to " + num);
        for (int i = 2; i <= num; i++) {
            count = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }

        }
        sc.close();
        System.out.println("");
    }

}
