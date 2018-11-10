package final_keyword;

public class University {

    final String name = "DiiT";
    final int fees;// blank final variable initialize in constructor
    static final int roll;//static final variable static block e initialize korte hoy

    public University() {
        fees = 38000;
    }

    static {
        roll = 101;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Fees : " + fees);
    }
    
    void display1() {
        System.out.println("University Info");
    }
}
