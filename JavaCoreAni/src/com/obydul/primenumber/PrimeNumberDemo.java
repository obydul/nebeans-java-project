package com.obydul.primenumber;

import java.util.Scanner;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        int count=0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num2 = ");
        num = sc.nextInt();
        
        for (int i = 2; i <num; i++) {
            if (num%i==0) {
                count++;
                break;
            } 
        }
        if(count ==0){
            System.out.println("Prime Number ");
        } else {
            System.out.println("Not Prime Number ");
        }
                
    }
            
    
}
