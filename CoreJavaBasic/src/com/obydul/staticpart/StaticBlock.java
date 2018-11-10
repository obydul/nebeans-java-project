package com.obydul.staticpart;

public class StaticBlock {

    static int id;
    static String name;

    static {
        id = 101;
        name = "Md. Obydul Islam";
    }

    static void display() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
    }

    public static void main(String[] args) {
        StaticBlock.display();
        System.out.println("main method");
    }

    static {
        System.out.println("bc");
    }

    static {
        System.out.println("bcd");
    }

}
