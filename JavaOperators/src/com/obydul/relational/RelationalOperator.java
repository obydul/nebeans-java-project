/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obydul.relational;

/**
 *
 * @author bts-2
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        //==, !=, >, <, >=, <=
        if(a == b){
            System.out.println("==");
        }else if(a != b){
            System.out.println("!=");
        }else if(a > b){
            System.out.println(">");
        }else if(a < b){
            System.out.println("<");
        }else if(a >= b){
            System.out.println(">=");
        }else if(a <= b){
            System.out.println("<=");
        }
        else {
            System.out.println("condition not match");
        }
    }
}
