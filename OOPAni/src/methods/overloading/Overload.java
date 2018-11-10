package methods.overloading;

public class Overload {
    // same method differnt parameter/signature
    
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("not in parameter");
    }
}
