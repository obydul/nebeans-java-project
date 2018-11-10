package com.array;

import java.util.Scanner;

public class ArraySumAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] num = new double[10];
        double sum = 0.0;
        System.out.print("Enter numbers ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        //sum = num[0] + num[1] + num[2] + num[3] + num[4];
        double aver = sum / num.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + aver);

    }
}
