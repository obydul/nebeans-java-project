package com.obydul.primenumber.series;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrimeNumberSeriesOne {

    //https://www.programming9.com/programs/java/154-java-program-to-print-prime-numbers-from-1-to-n
    public static void main(String[] args) throws IOException {
        /*
        int n, count, c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Value : ");
        n = Integer.parseInt(br.readLine());
        System.out.println("Prime Numbers up to " + n);
        for (int i = 2; i <= n; i++) {
            count = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.print(i + " ");
                c++;
            }
        }
         */

        int n, count;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        n = sc.nextInt();
        System.out.println("Prime numbers up to " + n);
        for (int i = 2; i <= n; i++) {
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
