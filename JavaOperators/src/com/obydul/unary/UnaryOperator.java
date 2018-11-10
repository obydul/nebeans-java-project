/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obydul.unary;

/**
 *
 * @author bts-2
 */
public class UnaryOperator {
    public static void main(String[] args) {
        int c;
        int a = 20;
        
        a++;
        //++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        
        
        int b = 00111100;
        c=~b;
        System.out.println(c);
    }
        
}
