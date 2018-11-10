package abstractclass;

public class Test {

    public static void main(String[] args) {
        MobileUser ms;
        ms = new Obydul();
        ms.call();
        ms.sendMessage();
        ms = new Shakera();
        ms.sendMessage();
    }
}
