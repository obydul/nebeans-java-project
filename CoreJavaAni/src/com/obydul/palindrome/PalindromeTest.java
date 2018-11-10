package com.obydul.palindrome;

import java.util.Scanner;

public class PalindromeTest {
// palindrome number means input number same as reverse number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter Numbers ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println("Reverse Nums = " + sum);
        if (sum == num) {
            System.out.println("Palindrom Number = " + num);
        } else {
            System.out.println("Not Palindrom Number = " + num);
        }
    }
}
