package com.array;

public class Array2Demension {

    public static void main(String[] args) {
        int[][] num = new int[2][3];
        num[0][0] = 10;
        num[0][1] = 11;
        num[0][2] = 12;
        num[1][0] = 13;
        num[1][1] = 14;
        num[1][2] = 15;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(num[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
