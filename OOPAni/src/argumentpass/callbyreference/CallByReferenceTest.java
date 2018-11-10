package argumentpass.callbyreference;

public class CallByReferenceTest {

    public static void main(String[] args) {
        CallByReference cr = new CallByReference();
        cr.name = "Obydul";
        System.out.println(cr.name);

        cr.change(cr);
        System.out.println(cr.name);
    }
}
