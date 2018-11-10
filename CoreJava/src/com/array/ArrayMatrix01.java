package com.array;

import java.util.Scanner;

public class ArrayMatrix01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] c = new int[2][3];
        System.out.println("Enter value A matrix ");
        // code for a matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A [%d][%d] = ", row, col);
                a[row][col] = sc.nextInt();
            }
        }

        System.out.println("Enter value B matrix ");
        // code for b matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B [%d][%d] = ", row, col);
                b[row][col] = sc.nextInt();
            }
        }
        System.out.println();

        //Printing a Matrix
        System.out.print("A is = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + a[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Printing b Matrix
        System.out.print("B is = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + b[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // adding a and b matrix
        System.out.println("A+B is = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                //System.out.print("\t "+(a[row][col] + b[row][col]));
                c[row][col] = a[row][col] + b[row][col];
                System.out.print("\t " + (c[row][col]));
            }
            System.out.println();
        }
    }
}
