package veriablelengthargument;

public class VarArgsTest {
    public static void main(String[] args) {
        VarArgs va = new VarArgs();
        va.add(5, 8);
        va.addArgumentLenght(5, 8,8);
        va.addArgumentLenght(5, 8,6,63);
        va.addArgumentLenght(5, 8,4,8,5,9,7);
    }    
}
