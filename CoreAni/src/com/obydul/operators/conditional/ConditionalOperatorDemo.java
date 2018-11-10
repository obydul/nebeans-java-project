package com.obydul.operators.conditional;

import java.util.Scanner;

public class ConditionalOperatorDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, large;
        System.out.print("Enter 2 numbers ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        large = (num1 > num2) ? num1 : num2;
        System.out.println("Large number : " + large);
    }

}
