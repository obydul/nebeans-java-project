package com.arraylist;

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();

        num1.add(10);
        num1.add(12);
        num1.add(15);
        num1.add(16);
        num1.add(18);
        System.out.println("Num1 ArrayList = " + num1);

        num2.add(20);
        num2.add(22);
        num2.add(25);
        num2.add(26);
        num2.add(28);
        System.out.println("Num2 ArrayList = " + num2);

        num3.addAll(num1);
        System.out.println("Num3 ArrayList = " + num3);
        
        boolean result = num1.equals(num2);
        System.out.println("num1.equals(num2) is " + result);
        
        boolean result2 = num1.equals(num3);
        System.out.println("num1.equals(num3) is " + result2);
    }
}
