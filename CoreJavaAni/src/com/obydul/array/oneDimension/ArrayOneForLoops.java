package com.obydul.array.oneDimension;

public class ArrayOneForLoops {

    public static void main(String[] args) {
        String[] num = new String[4];
        num[0] = "Md";
        num[1] = "Obydul";
        num[2] = "Islam";
        num[3] = "MOI";
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("");

        String[] names = {"Java", "Andriod", "JSP", "JSF"};
        for (String x : names) {
            System.out.print(x + " ");
        }

        System.out.println("");
    }
}
