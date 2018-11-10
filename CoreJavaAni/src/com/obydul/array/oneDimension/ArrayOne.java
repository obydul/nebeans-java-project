package com.obydul.array.oneDimension;

public class ArrayOne {

    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 2;
        num[1] = 8;
        num[2] = 9;
        num[3] = 11;
        num[4] = 2;
        int sum = 0;
        System.out.println("Length of Array = " + num.length);
        System.out.print("Array values :: ");
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            System.out.print(num[i] + " ");
        }
        System.out.println("\nSum of Array = " + sum);
        System.out.println("\nAverage of Array = " + sum / num.length);
        System.out.println("");
    }
}
