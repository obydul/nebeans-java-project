package com.obydul.operators;

public class IncrementDecrement {

    public static void main(String[] args) {
        int x = 5, y;
        y = x++;
        x++;

        System.out.println("X post increment " + x);
        System.out.println("Y post increment " + y);

    }
}
