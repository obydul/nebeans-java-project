package com.obydul.sumdigits;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, reminder, temp, num;
        System.out.print("Enter any numbers = ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            reminder = temp % 10;  // 12 % 10 = 2, 1%10 = 1
            sum = sum + reminder;//2+1=3
            temp = temp / 10; // 12/10 = 1, 1/10=0
        }
        System.out.println("Sum of digits = " + sum);

    }
}
