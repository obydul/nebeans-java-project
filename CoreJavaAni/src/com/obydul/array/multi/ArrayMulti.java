package com.obydul.array.multi;

public class ArrayMulti {

    public static void main(String[] args) {
        int array[][] = new int[12][8];
        int numRows = array.length;
        int numCol = array[0].length;
        System.out.println(numRows);
        System.out.println(numCol);
        for (int row = 0; row < numRows; ++row) {
            for (int col = 0; col < numCol; ++col) {
                array[row][col] = row * numCol + col + 1;
            }
        }
        for (int row = 0; row < numRows; ++row) {
            for (int col = 0; col < numCol; ++col) {
                System.out.printf("%3d", array[row][col]);
            }
            System.out.println("");
        }
    }

}
