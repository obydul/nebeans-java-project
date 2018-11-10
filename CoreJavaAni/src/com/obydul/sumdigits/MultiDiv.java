package com.obydul.sumdigits;

import java.util.Scanner;

public class MultiDiv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFrom, numTo, sum = 0;
        System.out.print("Enter Num From ");
        numFrom = sc.nextInt();
        System.out.print("Enter Num To ");
        numTo = sc.nextInt();
        for (int i = numFrom; i <= numTo; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
