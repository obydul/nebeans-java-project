package com.obydul.operator;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, area;

        System.out.print("Enter radius : ");
        radius = sc.nextDouble();

        area = 3.1416 * radius * radius;
        System.out.println("Area of circle : " + area);
    }
}
