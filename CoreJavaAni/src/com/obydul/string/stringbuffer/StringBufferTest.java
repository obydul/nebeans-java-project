package com.obydul.string.stringbuffer;

public class StringBufferTest {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Obydul");
        System.out.println(sb);
        sb.append(" Islam");
        System.out.println(sb);
        //sb.reverse();
        sb.delete(0, 2);
        System.out.println(sb);
    }
}
