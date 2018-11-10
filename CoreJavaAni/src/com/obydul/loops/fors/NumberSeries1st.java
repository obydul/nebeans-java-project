
package com.obydul.loops.fors;

import java.util.Scanner;

public class NumberSeries1st {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            sum = sum+i*i;
        }
        System.out.println(sum);
    }
}
