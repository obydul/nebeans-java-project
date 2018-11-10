/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corejava;

import java.util.Scanner;

/**
 *
 * @author bts-2
 */
public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0, r, temp;
        System.out.print("Enter digits = ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println("Sum = " + sum);
    }

}
