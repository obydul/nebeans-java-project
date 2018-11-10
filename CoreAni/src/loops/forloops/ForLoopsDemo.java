package loops.forloops;

public class ForLoopsDemo {

    public static void main(String[] args) {
        int[] a = {6, 9, 8, 7, 5, 6, 9};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        System.out.println(sum);
    }
}
