package argumentpass.callbyvalue;

public class CallByValueTest {

    public static void main(String[] args) {
        int a = 10;
        CallByValue c = new CallByValue();
        c.change(a);
        System.out.println(a);
    }
}
