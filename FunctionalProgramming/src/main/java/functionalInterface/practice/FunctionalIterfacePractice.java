package functionalInterface.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class User
{
    String fName;
    String lNAMe;

    public User(String fName, String lNAMe) {
        this.fName = fName;
        this.lNAMe = lNAMe;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lNAMe='" + lNAMe + '\'' +
                '}';
    }
}
public class FunctionalIterfacePractice
{
    public static void main(String[] args)
    {

        System.out.println(practiceFunction.apply(new User("prabhakar","dixith")));
        System.out.println(practiceFunction.apply(new User("anushka","patil")));

    }

    static Function<User, String> practiceFunction =
            user -> user.toString();

}
