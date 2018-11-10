package com.obydul.prime.number;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;
        System.out.print("Enter Prime Num = ");
        num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime Number " + num);
        } else {
            System.out.println("Not Prime Number " + num);
        }
        
        //System.out.println(Math.floor(25));
        String str = "This is awesome!";
        System.out.println(str.charAt(9));
    }
}
