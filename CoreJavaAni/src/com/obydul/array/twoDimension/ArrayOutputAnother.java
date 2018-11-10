package com.obydul.array.twoDimension;

public class ArrayOutputAnother {

    public static void main(String[] args) {
        int[][] a = new int[6][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];
        a[4] = new int[5];
        a[5] = new int[6];
        int k = 0;

        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < row + 1; col++) {
                a[row][col] = k;
                k++;
            }
        }
        // Array Output
        System.out.println("Array Output");
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < row + 1; col++) {
                System.out.print("\t" + a[row][col]);
            }
            System.out.println("");

        }

    }

}
