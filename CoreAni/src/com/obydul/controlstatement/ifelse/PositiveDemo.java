
package com.obydul.controlstatement.ifelse;

import java.util.Scanner;

public class PositiveDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter int number : ");
        num = sc.nextInt();

        if (num>0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    
}
