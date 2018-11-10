package com.obydul.operator;

import java.util.Scanner;

public class TemperatureDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cels, farn;

        System.out.print("Celsius : ");
        cels = sc.nextDouble();

        farn = 1.8 * cels + 32;
        System.out.println("Farenhiet : " + farn);
    }
}
