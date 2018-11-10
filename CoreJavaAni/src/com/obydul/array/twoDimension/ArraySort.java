package com.obydul.array.twoDimension;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] a = {8, 58, 7, 4, 96,87,99};
        Arrays.sort(a);
        System.out.println("Ascending");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
        System.out.println("Descending");
        for (int i = 6; i >=0; i--) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
        
        String[] name = {"Md","Obydul","Islam"};
        Arrays.sort(name);
        System.out.println("String Array Ascending");
        for (int i = 0; i <name.length; i++) {
            System.out.print(" " + name[i]);
        }
        System.out.println("");
        System.out.println("String Array Descending");
        for (int i = 2; i >=0; i--) {
            System.out.print(" " + name[i]);
        }
        System.out.println("");
    }
}
