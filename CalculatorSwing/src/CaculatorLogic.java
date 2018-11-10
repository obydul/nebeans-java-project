
public class CaculatorLogic {
    public double add(double a, double b){
        return a+b;        
    }
    public double substruct(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        if (b ==0) {
            System.out.println("can't divide by zero");
            return 0;
        }
        else {
            return a/b;
        }
    }
    public double stringToDouble(String a){
        return Double.parseDouble(a);
    }
}
