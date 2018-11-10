package com.obydul.series;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer : ");
        num = sc.nextInt();
        if (num < 0 || num == 0) {
            System.out.println("Please enter greater than 0 value");
        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even num : " + i);
                } else {
                    System.out.println("Odd Num : " + i);
                }
                sc.close();
            }
        }
        
        
        
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        double dd = scan.nextDouble();
        String ss = scan.nextLine();

        System.out.println("String: " + ss);
        System.out.println("Double: " + dd);
        System.out.println("Int: " + in);
        
    }
}
