package com.obydul.array.twoDimension;

import java.util.Scanner;

public class ArrayMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num1 = new int[2][3];
        int[][] num2 = new int[2][3];

        System.out.println("Enter elements for First Matrix ");
        // insert data in num1 array
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("First[%d][%d] = ", row, col);
                num1[row][col] = sc.nextInt();
            }
        }
        System.out.println("First Array ");
        // print data from num1 array
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num1[row][col] + "  ");
            }
            System.out.println("");
        }

        System.out.println("Enter elements for Second Matrix ");
        // insert data in num2 array
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("Second[%d][%d] = ", row, col);
                num2[row][col] = sc.nextInt();
            }
        }
        System.out.println("Second Array ");
        // print data from num2 array
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num2[row][col] + "  ");
            }
            System.out.println("");
        }
    }
}
