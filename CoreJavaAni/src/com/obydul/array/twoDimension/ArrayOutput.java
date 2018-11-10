package com.obydul.array.twoDimension;

import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        int[][] a = new int[4][5];
        int k=0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                a[row][col] = k;
                k++;                
            }
        }
        // Array Output
        System.out.println("Array Output");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print("\t"+a[row][col]);                
            }
            System.out.println("");
            
        }
    }
}
