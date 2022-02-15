package functionalInterface.suppliers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Department{
    int id;
    String name;
}
public class SupplierPractice
{
    public static void main(String[] args)
    {
        System.out.println(consumerPractice.get());


    }

    static Supplier<String> consumerPractice = () -> new Department(123,"development").toString();
}
