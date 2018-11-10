package com.obydul.format;

public class FormatSpecifier {

    public static void main(String[] args) {
        boolean b = true;
        char c = 'a';
        short s = 32677;
        int i = 123654;
        float f = 12.0f; 
        double d = 10.00;
        System.out.printf("boolean b = %b\n", b);
        System.out.printf("char c = %c\n", c);
        System.out.printf("short s = %d\n", s);
        System.out.printf("int i = %d\n", i);
        System.out.printf("float f = %f\n", f);
        System.out.printf("float f = %.2f\n", f);
        System.out.printf("double d = %f\n", d);

        System.out.println();

    }
}
