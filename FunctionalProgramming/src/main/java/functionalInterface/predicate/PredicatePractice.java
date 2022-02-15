package functionalInterface.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Predicate;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Admin
{
    Integer adminId;
    String name;
}
public class PredicatePractice
{
    public static void main(String[] args)
    {

        System.out.println(predicatePractice.test(new Admin(123,"prabhakar")));

        System.out.println(predicatePractice1.test(new Admin(3,"pd")));

    }

    static Predicate<Admin> predicatePractice =
            admin -> admin.getAdminId() == 123;

    static Predicate<Admin> predicatePractice1 =
            admin -> admin.getName().equals("pd") && admin.getAdminId() == 3;
}
