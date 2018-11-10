package com.obydul.input;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, area;
        System.out.print("Entery Radius Value = ");
        radius = sc.nextDouble();

        area = 3.1416 * radius * radius;
        System.out.println("Radiu Value is = " + area);
    }
}
