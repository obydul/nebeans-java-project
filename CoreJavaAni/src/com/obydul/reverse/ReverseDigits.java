package com.obydul.reverse;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, temp, r, num;
        System.out.print("Enter digits = ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println("Reverse Nums = " + sum);
    }
}
