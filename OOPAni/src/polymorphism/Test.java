package polymorphism;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        Student s = new Student();
        p.display();
        t.display();
        s.display();
        System.out.println("");
        System.out.println("Runtime Polymorphism");
        p = new Teacher();
        p.display();
        p = new Student();
        p.display();
    }
}
