package com.obydul.multiplicable.table;

import java.util.Scanner;

public class NumberSeriesTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFrom, numTo;
        System.out.print("Enter Num From = ");
        numFrom = sc.nextInt();
        System.out.print("Enter Num To = ");
        numTo = sc.nextInt();

        for (int i = numFrom; i <= numTo; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + j * i);
            }
            System.out.println("");
        }

    }
}
