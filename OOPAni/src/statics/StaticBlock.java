package statics;

public class StaticBlock {

    static String name;
    static int id;

    static {
        name = "Obydul";
        id = 101;
    }

    static void display() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("");
    }

}
