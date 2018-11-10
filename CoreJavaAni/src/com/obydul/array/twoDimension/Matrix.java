package com.obydul.array.twoDimension;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] c = new int[2][3];
        Scanner sc = new Scanner(System.in);

        //Start Array A
        System.out.println("Insert Data in Array A");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d][%d] = ", row, col, " ");
                a[row][col] = sc.nextInt();
            }
        }

        System.out.println("Insert Data in Array B");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B [%d][%d] = ", row, col, " ");
                b[row][col] = sc.nextInt();
            }
        }

        System.out.print("Array A");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + a[row][col] + " ");
            }
            System.out.println("");
        }
        // End Array A

        //Start Array B
        System.out.print("Array B");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + b[row][col] + " ");
            }
            System.out.println("");
        }
        // End Array B

        // Add a and b matrix
        System.out.println("Sum A + B ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                //System.out.print("\t" + (a[row][col] + b[row][col]));
                c[row][col] = a[row][col] + b[row][col];
                System.out.print("\t" + c[row][col]);
            }
            System.out.println("");
        }

    }
}
