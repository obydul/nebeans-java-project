package enheritance;

public class TestInheritancePrivate {

    public static void main(String[] args) {
        TeacherPrivate t = new TeacherPrivate();
        t.setName("Obydul");
        t.setAge(28);
        t.setQualification("J2EE");
        t.displayInformation();
        t.setName("Shakera");
        t.setAge(20);
        t.setQualification("SSC");
        t.displayInformation();
    }
}
