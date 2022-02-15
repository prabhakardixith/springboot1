package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicates
{
    public static void main(String[] args)
    {
        System.out.println(isPhoneNumberValid("07000000001"));
        System.out.println(isPhoneNumberValid("09000000121"));

        System.out.println("Predicate Functional Interface");
        System.out.println(predicateFunction.test("07212121121"));

        System.out.println("BiPredicate");

        System.out.println(BipredicateFunction.test("07",2));
    }
    static boolean isPhoneNumberValid(String phoneNumber)
    {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> predicateFunction = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static BiPredicate<String,Integer> BipredicateFunction = (phoneNumber,len) ->
            phoneNumber.startsWith("07") && phoneNumber.length() == len;
}
