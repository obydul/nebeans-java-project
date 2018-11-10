package com.obydul.arraylist;

import java.util.ArrayList;

public class ArrayListTwo {

    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();

        num1.add(10);
        num1.add(11);
        num1.add(12);
        num1.add(13);
        num1.add(14);
        System.out.println("Num1 : " + num1);

        num2.add(20);
        num2.add(21);
        num2.add(22);
        num2.add(23);
        num2.add(24);
        System.out.println("num2 : " + num2);

        num3.addAll(num1);
        System.out.println("num3 : " + num3);
        
        
        boolean result = num1.equals(num3);
        System.out.println("result : " + result);

    }
}
