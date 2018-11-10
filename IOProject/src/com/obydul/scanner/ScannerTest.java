package com.obydul.scanner;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String value : ");
        String ss = scan.nextLine();
        System.out.print("Enter int value : ");
        int in = scan.nextInt();
        System.out.print("Enter double value : ");
        double dd = scan.nextDouble();


        System.out.println("String: " + ss);
        System.out.println("Double: " + dd);
        System.out.println("Int: " + in);
    }

}
