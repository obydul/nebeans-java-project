package com.obydul.array;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(null);
        l.add("A");
        l.add("B");
        l.add("C");
        l.addFirst("D");
        System.out.println(l);
    }
    
}
