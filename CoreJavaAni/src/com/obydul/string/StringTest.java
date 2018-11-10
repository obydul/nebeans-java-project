package com.obydul.string;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "Md. Obydul Islam";
        String s2 = new String("Java Language");
        System.out.println(s1);
        System.out.println(s2);

        if (s1 == s2) {
            System.out.println("Equals s1 == s2");
        } else {
            System.out.println("Not Equals s1 == s2");
        }

        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        } else {
            System.out.println("Not s1.equals(s2)");
        }

        if (s1.contains(s2)) {
            System.out.println("s1.contains(s2)");
        } else {
            System.out.println("Not s1.contains(s2)");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1.equalsIgnoreCase(s2)");
        } else {
            System.out.println("Not s1.equalsIgnoreCase(s2)");
        }
    }
}
