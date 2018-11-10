package com.obydul.primenumber;

import java.util.Scanner;

public class PrimeNumberDemo2 {
    public static void main(String[] args) {
        int count=0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num = ");
        num = sc.nextInt();
        
        for (int i = 1; i <num; i++) {
            if (i%2==0) {
                count++;
            } 
        }
        if(count ==0){
            System.out.println("Prime Number ");
        } else {
            System.out.println("Not Prime Number ");
        }
                
    }
            
    
}
