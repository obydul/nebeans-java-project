package exception_handling;

import java.util.Scanner;

public class ExceptionProblem {

    public static void main(String[] args) {
        int count = 1;
        //while (true) {
        do {
            try {
                Scanner s = new Scanner(System.in);
                int a, b, result;
                System.out.print("Enter num 1 : ");
                a = s.nextInt();
                System.out.print("Enter num 2 : ");
                b = s.nextInt();
                result = a / b;
                System.out.println("Result : " + a + "/" + b + " = " + result);
                count = 0;
            } catch (Exception e) {
                System.out.println("Exception : " + e);
                System.out.println("You must enter an integer pls try again");
            }
        } while (count == 1);

    }
}
