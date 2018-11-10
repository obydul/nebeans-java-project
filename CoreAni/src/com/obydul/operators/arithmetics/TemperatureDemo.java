package com.obydul.operators.arithmetics;

import java.util.Scanner;

public class TemperatureDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cels, farn;
        System.out.print("Enter celcius : ");
        cels = sc.nextDouble();

        farn = 1.8 * cels + 32;
        System.out.println(farn);
    }
}
