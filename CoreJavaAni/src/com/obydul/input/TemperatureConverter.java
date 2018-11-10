package com.obydul.input;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cels, result;
        System.out.print("Celcius = ");
        cels = sc.nextDouble();
        result = 1.8 * cels + 32;
        System.out.println("Furenheit = " + result);
    }
}
