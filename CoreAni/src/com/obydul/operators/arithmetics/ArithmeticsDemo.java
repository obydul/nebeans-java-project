package com.obydul.operators.arithmetics;

import java.util.Scanner;

public class ArithmeticsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fromNum, toNum;
        System.out.print("Enter From num = ");
        fromNum = sc.nextInt();
        System.out.print("Enter to num = ");
        toNum = sc.nextInt();

        System.out.println("Divide = " + fromNum / toNum);
        System.out.println("Modulo = " + fromNum % toNum);

    }

}
