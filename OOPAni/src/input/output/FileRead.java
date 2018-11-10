package input.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {
        File dir = new File("person");
        String dirLocation = dir.getAbsolutePath();
        String id, name;

        try {
            File file = new File(dirLocation + "/student.txt");
            Scanner sc = new Scanner(file);
            System.out.println("ID \t" + "Name");
            while (sc.hasNext()) {
                id = sc.next();
                name = sc.next();
                System.out.println(id + "\t" + name);
            }
            sc.close();
        } catch (Exception x) {
            System.out.println(x);
        }

    }

}
