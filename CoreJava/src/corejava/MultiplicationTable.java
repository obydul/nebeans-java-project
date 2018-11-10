package corejava;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.print("Enter First Number ");
        n = sc.nextInt();
        System.out.print("Enter Last Number ");
        m = sc.nextInt();
        System.out.println();

        for (int i = n; i <= m; i++) {
            System.out.println("number start " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + j * i);
            }
            System.out.println();
        }

    }
}
