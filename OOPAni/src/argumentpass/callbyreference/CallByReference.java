package argumentpass.callbyreference;

public class CallByReference {

    String name;

    void change(CallByReference r1) {
        r1.name = "Shakera";
    }

}
