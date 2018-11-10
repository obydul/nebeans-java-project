package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {

    @FunctionalInterface
    public interface Predicate {

        boolean test(Integer input);
    }

    public static List<Integer> filter(List<Integer> integerList, Predicate predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer integer : integerList) {
            if (predicate.test(integer)) {
                result.add(integer);
            }
        }
        List<Integer> integers = Arrays.asList(1, 4, 3, 5, 6, 7, 4, 34, 76, 8, -1, 5, -6, 5, 0);
        //List<Integer> evenNumbers = filter(integers, input -> input % 2 ==0);
        
        return result;        
    }

    public static void main(String[] args) {

    }
}
