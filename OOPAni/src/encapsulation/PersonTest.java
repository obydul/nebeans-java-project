package encapsulation;

public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Obydul");
        p.setId(101);
        p.display();
        p.setName ("Shakera");
        p.setId (102);
        p.display();
        
    }

}
