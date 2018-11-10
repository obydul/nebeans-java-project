package enheritance;

public class TestInheritance {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Obydul";
        t.age = 28;
        t.qualification = "J2EE";
        t.displayInformation2();
        
        Teacher t1 = new Teacher();
        t1.name = "Shakera";
        t1.age = 20;
        t1.qualification = "SSC";
        t1.displayInformation2();

    }

}
