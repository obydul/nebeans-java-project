
package corejava;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact=1;
        System.out.print("Enter int number = ");
        num = sc.nextInt();
        
        for (int i = num; i >= 1; i--) {
            fact = fact*i;
        }
        System.out.println("Factorial of "+ num + " = " + fact);
    }
}
