package com.obydul.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println(num.size());
        num.add(10);
        num.add(15);
        num.add(12);
        System.out.println(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println("");

        Iterator itr = num.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
    }
}
