package functionalInterface;


import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int increment2 = incrementByOneUsingFunction.apply(1);
        System.out.println(increment2);

        int multiplier = multiplyByFunction.apply(2);
        System.out.println(multiplier);

        Function<Integer, Integer> integerIntegerFunction = incrementByOneUsingFunction.andThen(multiplyByFunction);

        System.out.println(integerIntegerFunction.apply(2));


        System.out.println(doSomeOperation.apply(10));


        System.out.println("biFunctions");

        System.out.println(biFunctionImplementation.apply(10,20));

    }
    static Function<Integer,Integer> doSomeOperation = number -> number+10;

     static Function<Integer, Integer> incrementByOneUsingFunction =
            number -> number +1 ;

    static Function<Integer, Integer> multiplyByFunction =
            number -> number * 10 ;


    static BiFunction<Integer,Integer,Integer> biFunctionImplementation = (number1,operatorationNumber)
            -> number1 * operatorationNumber ;

}
