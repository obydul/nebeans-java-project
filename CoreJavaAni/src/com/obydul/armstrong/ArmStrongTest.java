package com.obydul.armstrong;

import java.util.Scanner;

public class ArmStrongTest {

    // armstrong number is every number multiply 3 times and sum is equal input number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, r, num, temp;
        System.out.print("Enter Numbers : ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        System.out.println("Sum :: " + sum);
        if (num == sum) {
            System.out.println("Armstrong numbers = " + num);
        } else {
            System.out.println("Not Armstrong numbers  = " + num);
        }
    }
}
