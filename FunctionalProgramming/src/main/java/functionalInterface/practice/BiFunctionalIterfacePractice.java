package functionalInterface.practice;

import java.util.function.BiFunction;
import java.util.function.Function;

class Users
{
    String fName;
    String lNAMe;

    public Users(String fName, String lNAMe) {
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

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlNAMe(String lNAMe) {
        this.lNAMe = lNAMe;
    }

    public String getfName() {
        return fName;
    }

    public String getlNAMe() {
        return lNAMe;
    }
}

public class BiFunctionalIterfacePractice
{
    public static void main(String[] args)
    {

        System.out.println(practiceFunction.apply("diwakar","dixith"));
        System.out.println(practiceFunction.apply("shash","patil"));

    }

    static BiFunction<String,String, User> practiceFunction =
            (fName,lNAMe) -> new User(fName,lNAMe);

}
