package com.obydul.string.stringbuffer;

public class StringPalindrom {

    public static void main(String[] args) {
        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb);
        String s2 = sb.reverse().toString();
        //sb.reverse();
        System.out.println(s2);

//        if (s1.equals(sb)) {
        if (s1.equals(s2)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not a palindroim");
        }
    }
}
