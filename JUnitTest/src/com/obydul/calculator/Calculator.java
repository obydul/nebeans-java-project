package com.obydul.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }
    /*
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 2));
        System.out.println("");
        int[] array = {1,2,3,4,5};
        calculator.add(array);
        for (int value:array) {
            System.out.print(value);
        }
        System.out.println("");
    }
     */
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        System.out.println(path);
    }
}
