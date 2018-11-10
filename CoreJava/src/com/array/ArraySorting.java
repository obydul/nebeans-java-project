package com.array;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] num = {5, 64, -1, -6, 45};
        Arrays.sort(num);
        
        System.out.print("Ascending values  : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        
        System.out.print("Descending values : ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        
        String[] names = {"Obydul", "Najmul", "Linkon","Kowsar"};
        Arrays.sort(names);
        for (int i = 0; i < 4; i++) {
            System.out.print(names[i]+" ");
        }
        System.out.println();
        
        for (int i = 3; i >= 0; i--) {
            System.out.print(names[i]+" ");
        }
        System.out.println();
    }
}
