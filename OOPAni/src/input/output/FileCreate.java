package input.output;

import java.io.File;

public class FileCreate {

    public static void main(String[] args) {
        String location = System.getProperty("user.dir");
        System.out.println(location);

        //File dir = new File("C:\\Users\\bts-2\\Desktop\\person");// specific location e folder create
        File dir = new File("person");//project er location e folder create hobe
        dir.mkdir();
        String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        String dirName = dir.getName();
        System.out.println(dirName);
        //dir.delete();
//        if (dir.delete()) {
//            System.out.println(dir.getName() + "folder has been deleted");
//        }

//        File file1 = new File("student.txt");
//        File file2 = new File("teacher.txt");
//        File file1 = new File("C:/Users/bts-2/Documents/NetBeansProjects/OOPAni/person/student.txt");
//        File file2 = new File("C:/Users/bts-2/Documents/NetBeansProjects/OOPAni/person/teacher.txt");
        File file1 = new File(dirLocation + "/student.txt");
        File file2 = new File(dirLocation + "/teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are crated");
        } catch (Exception e) {
            System.out.println(e);
        }

        if (file1.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not exists");
        }

    }
}
