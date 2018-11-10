package com.obydul.operators.arithmetics;

import java.util.Scanner;

public class AssignmentOperator {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fromNum, toNum;
        System.out.print("Enter From num = ");
        fromNum = sc.nextInt();
        System.out.print("Enter to num = ");
        toNum = sc.nextInt();
        fromNum /= toNum;

        System.out.println("Divide = " + fromNum);
        fromNum %= toNum;
        System.out.println("Modulo = " + fromNum);

    }
}
