package com.obydul.operators.arithmetics;

import java.util.Scanner;

public class TriangleDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter base : ");
        base = sc.nextDouble();

        System.out.print("Enter height : ");
        height = sc.nextDouble();

        area = .5 * base * height;
        System.out.println(area);
    }

}
