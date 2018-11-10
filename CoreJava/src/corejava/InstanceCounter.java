package corejava;

public class InstanceCounter {

    static {
        System.out.println("Class InstanceCounter loading....");
    }
    static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;
    static int instanceCounter;

    static {
        System.out.println("ONE_DAY_IN_MILLIS :: " + ONE_DAY_IN_MILLIS + "instanceCounter :: " + instanceCounter);
    }

    {
        InstanceCounter.instanceCounter++;
        System.out.println("instanceCounter :: " + instanceCounter);
    }

    public static void main(String[] args) {
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        System.out.println("instanceCounter in main :: " + instanceCounter);
    }

    static {
        System.out.println("Class InstanceCounter loaded");
    }
}
