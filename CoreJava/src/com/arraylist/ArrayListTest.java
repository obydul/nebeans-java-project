package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        //System.out.println("size = " + num.size());
        //adding elements
        num.add(1);
        num.add(12);
        num.add(15);
        num.add(3, 45);
        //System.out.println("ArrayList = " + num);
        // arraylist print using for each loop        
        for (int x : num) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("ArrayList size = " + num.size());

        // remove elements
        num.remove(0);
        System.out.println("ArrayList = " + num);
        System.out.println("ArrayList size = " + num.size());

        boolean contain = num.contains(15);
        System.out.println("Contains of = 15 is ? " + contain);

        int indexnum = num.indexOf(15);
        System.out.println("Index of num 15 is = " + indexnum);

        num.set(1, 60);
        System.out.println("arraylist after set " + num);
        
        int x = num.get(0);
        System.out.println("index of 0 value is =  " + x);

        // arraylist print using Iterator class
        /*
        Iterator itr = num.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println();
         */
    }
}
