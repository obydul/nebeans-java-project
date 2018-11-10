package com.obydul.staticpart;

public class StaticMethodTest {
    int ab;
   static int x;

    void display1() {
        System.out.println("not static function");
    }

    static void display2() {
        //ab=1; can't call non static member
        x=0;
        System.out.println("static function");
    }
}
