package functionalInterface.predicate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Admin1
{
    Integer adminId;
    String name;
}

public class BiPredicatePractice
{
    public static void main(String[] args)
    {

        System.out.println(predicatePractice.test(new Admin1(123,"prabhakar"),123));

        System.out.println(predicatePractice1.test(new Admin1(3,"pd"),"pda"));

    }

    static BiPredicate<Admin1,Integer> predicatePractice =
            (admin,id) -> admin.getAdminId() == id;

    static BiPredicate<Admin1,String>  predicatePractice1 =
            (admin,name) -> admin.getName().equals(name) && admin.getAdminId() == 3;
}
