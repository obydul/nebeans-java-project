package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSorting {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(15);
        num.add(5);
        num.add(7);
        num.add(25);
        num.add(36);
        num.add(55);
        num.add(46);
        System.out.println("Num before sort = " + num);
        
        Collections.sort(num);
        System.out.println("Num after sort ascending = " + num);
        
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Num after sort descending = " + num);
        
    }

}
