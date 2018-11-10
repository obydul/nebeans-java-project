package oop;

public class Test {

    public static void main(String[] args) {
        Teacher t = new Teacher("Obydul Islam", "Male", 45632211);
//        t.name = "Obydul Islam";
//        t.gender = "Male";
//        t.phone = 45632211;
//        t.setInformation("Obydul Islam", "Male", 45632211);
        t.displayInformation();

        Teacher t1 = new Teacher("Shakera", "Female", 45632211);
//        t1.name = "Shakera";
//        t1.gender = "Female";
//        t1.phone = 45632211;
        
//        t1.setInformation("Shakera", "Female", 45632211);
        t1.displayInformation();
        //System.out.println(t1.name + " " + t1.gender + " " + t1.phone);
    }
}
