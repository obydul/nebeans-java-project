package oddeven;

import java.util.Scanner;

public class OddEvenDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive number ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number " + num);
        } else {
            System.out.println("Odd number " + num);
        }
    }

}
