package com.array;

import java.util.Scanner;

public class ArrayForEachLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] str = new String[4];
        //str[0] = "Md";
        //str[1] = ".";
        //str[2] = "Obydul";
        //str[3] = "Islam";
        /*
        for (int i = 0; i < 4; i++) {
            System.out.print(str[i]);
        }
        System.out.println();
         */
        String[] str = {"Md", ". ", "Obydul ", "Islam"};

        for (String x : str) {
            System.out.print(x);
        }
        System.out.println();

        int[] num = {20, 50, 4, 5, 6, 3, 2, 1};
        int sum = 0;
        for (int x : num) {
            System.out.print(x);
            sum = sum + x;
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
