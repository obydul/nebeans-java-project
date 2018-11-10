package veriablelengthargument;

public class VarArgs {

    void add(int n1, int n2) {
        System.out.println("add = " + n1 + n2);
    }

    void addArgumentLenght(int... num) {
        int sum = 0;
        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("addArgumentLenght = " + sum);
    }
}
