package corejava;

public class NestedForLoop {

    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j <= i; j++) {
                total += i;
                System.out.println("nestel loop i = " + i);
                System.out.println("nestel loop j = " + j);
            }
        }
        System.out.println("Total = " + total);
    }

}
