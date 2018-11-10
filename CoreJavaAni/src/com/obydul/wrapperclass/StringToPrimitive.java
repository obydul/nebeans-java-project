package com.obydul.wrapperclass;

public class StringToPrimitive {

    public static void main(String[] args) {
        String s = "123";
        int i = Integer.parseInt(s);
        System.out.println(i);
        String d = "3.52";
        double dd = Double.parseDouble(d);
        System.out.println(dd);
    }
}
