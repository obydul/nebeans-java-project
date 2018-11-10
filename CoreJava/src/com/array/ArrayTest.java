package com.array;

public class ArrayTest {

    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 1;
        number[1] = 11;
        number[2] = 12;
        number[3] = 13;
        number[4] = 14;
        int sum = number[0] + number[2] + number[3];
        System.out.println("Sum = " + sum);
        System.out.println("Array Size = " + number.length);
        System.out.println(number[4]);
    }
}
