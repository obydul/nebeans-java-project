package com.array;

import java.util.Scanner;

public class ArrayMinMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0.0;
        System.out.print("Entery numbers ");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        double aver = sum / num.length;
        System.out.println("sum = " + sum);
        System.out.println("average = " + aver);

        double max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("max = " + max);

        double min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        System.out.println("min = " + min);
    }
}
