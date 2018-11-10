
package corejava;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any number ");
        num = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
            
        }
    }
}
