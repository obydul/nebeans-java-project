package corejava;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, sum = 0, r, temp;

        System.out.print("Enter digits = ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

    }

}
