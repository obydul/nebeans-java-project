package corejava;

import java.util.Scanner;

public class PrimeNumberTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;
        System.out.print("Enter Number ");
        number = sc.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(number + " Is Prime Number");
        } else {
            System.out.println(number + " Is Not Prime Number");
        }
    }
}
