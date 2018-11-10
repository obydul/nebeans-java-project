package com.obydul.string;

public class StringThree {

    public static void main(String[] args) {
        String country = "Bangladesh is my homeland";
        System.out.println(country);

        char ch = country.charAt(0);
        System.out.println("ch = " + ch);

        int value = country.codePointAt(0);
        System.out.println("value = " + value);

        int pos = country.indexOf("d");
        System.out.println("first pos of d = " + pos);

        pos = country.lastIndexOf("d");
        System.out.println("lastIndexOf = " + pos);

        int lastIndex = country.lastIndexOf("l");
        System.out.println("last Index = " + lastIndex);
    }

}
