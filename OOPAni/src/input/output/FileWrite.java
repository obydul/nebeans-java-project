package input.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) {
        File dir = new File("person");
        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);

        String id, name;

        try {
            Formatter formatter = new Formatter(dirLocation + "/student.txt");
            Scanner sc = new Scanner(System.in);
            System.out.print("How many students = ");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.print("Enter student Id and name = ");
                id = sc.next();
                name = sc.next();
                formatter.format("%s %s\r\n", id, name);
            }
            formatter.close();
            System.out.println("");

//            formatter.format("%s %s\r\n", "101", "Obydul");
//            formatter.format("%s %s\r\n", "201", "Shakera");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception x) {
            System.out.println(x);
        }
    }
}
