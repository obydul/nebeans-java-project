package com.obydul.array.twoDimension;

public class ArrayTwoDimension {

    public static void main(String[] args) {
        int[][] nums = new int[2][3]; // [2] = row 2 ta , [3] = column 3 ta
        nums[0][0] = 3;
        nums[0][1] = 4;
        nums[0][2] = 5;
        nums[1][0] = 6;
        nums[1][1] = 7;
        nums[1][2] = 8;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println("");
        }

    }
}
