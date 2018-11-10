/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forloop;

/**
 *
 * @author bts-2
 */
public class ForLoop{
    public static void main(String[] args) {
        int result = 0;
        for(int i = 0; i< 1; i++){
            if(i==3){
                result +=10;
            }else {
                result += i;
            }
            System.out.println(result);
        }
    }
}
