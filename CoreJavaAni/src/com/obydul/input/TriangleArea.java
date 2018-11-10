package com.obydul.input;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height, area;
        System.out.print("Entery Triangle Base Value = ");
        base = sc.nextDouble();
        System.out.print("Entery Triangle Height Value = ");
        height = sc.nextDouble();

        area = 0.5 * base * height;
        System.out.println("Triangle Value is = " + area);
        
        
        
        
    }
}
