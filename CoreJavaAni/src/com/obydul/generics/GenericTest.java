package com.obydul.generics;

public class GenericTest {

    public static void main(String[] args) {
        Generics<Integer> test = new Generics<Integer>(100);
        test.showType();
        int a = test.getObj();
        System.out.println(a);

        Generics<String> test1 = new Generics<String>("AABVV");
        test1.showType();
        String b = test1.getObj();
        System.out.println(b);

        Generics<Float> test2 = new Generics<Float>(101.0f);
        test2.showType();
        float c = test2.getObj();
        System.out.println(c);
    }
}
