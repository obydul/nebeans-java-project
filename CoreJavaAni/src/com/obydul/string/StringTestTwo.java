package com.obydul.string;

public class StringTestTwo {

    public static void main(String[] args) {
        String firstName = "Obydul";
        String lastName = " Islam";
        String fullName = firstName + lastName;
        System.out.println("fullName = " + fullName);

        String fullName1 = firstName.concat(lastName);
        System.out.println("fullName1 = " + fullName1);

        String upperCase = fullName1.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        String lowerCase = fullName1.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);

        boolean b = firstName.startsWith("O");
        System.out.println("b = " + b);
    }
}
