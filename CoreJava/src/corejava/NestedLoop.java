package corejava;

import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter initial number ");
        m = sc.nextInt();
        System.out.print("Enter last number ");
        n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);

            }
            System.out.println();
        }

    }
}
