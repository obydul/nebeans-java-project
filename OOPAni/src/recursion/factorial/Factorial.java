package recursion.factorial;

public class Factorial {
    int fact(int x){
        if(x == 1)
            return 1;
        else
            return x*fact(x-1);
    }
}
