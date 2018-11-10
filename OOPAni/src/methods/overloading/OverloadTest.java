package methods.overloading;

public class OverloadTest {

    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add();
        ob.add(5, 6);
        ob.add(2.3, 6.1);
        ob.add(4, 5, 6);
    }
}
