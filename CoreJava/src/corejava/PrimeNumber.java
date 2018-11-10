package corejava;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number ");
        n = sc.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(n + " Is Prime Number ");
        } else {
            System.out.println(n + " Is Not Prime ");
        }
    }
}
