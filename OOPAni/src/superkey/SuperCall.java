package superkey;

public class SuperCall extends SuperTest {

    int x = 12;

    public SuperCall() {
        super();
        System.out.println("Child Class Consturtor");
    }
    
    

    @Override
    void display() {
        System.out.println(x);
        System.out.println(super.x);
        System.out.println("Inside Derived class");
        super.display();
    }
}
