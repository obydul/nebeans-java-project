package com.obydul.intger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Big Interg :: ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter 2st Big Interg :: ");
        BigInteger b = sc.nextBigInteger();
        BigInteger arr[] = a.divideAndRemainder(b);
        System.out.println("Quotent " + arr[0]);
        System.out.println("Remainder " + arr[1]);
    }
}
