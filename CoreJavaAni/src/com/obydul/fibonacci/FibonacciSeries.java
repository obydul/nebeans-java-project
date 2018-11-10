
package com.obydul.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers :: ");
        int x = sc.nextInt();
        int firstNum = 0;
        int secondeNum = 1;
        int fibo;
        System.out.print(firstNum + " " + secondeNum);
        for (int i = 3; i <= x; i++) {
            fibo = firstNum + secondeNum;
            System.out.print(" " +fibo);
            firstNum = secondeNum;
            secondeNum = fibo;
        }
        System.out.println("");
    }
}
