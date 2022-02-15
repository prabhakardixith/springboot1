package functionalInterface.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Emp
{
    Integer empId;
    String name;

}
public class ConsumerPractice
{
   static List<Emp> list = new ArrayList<Emp>();
    public static void main(String[] args) {


        consumerPractice.accept(new Emp(123,"prabhakar"));
        System.out.println(list);
    }

    static Consumer<Emp> consumerPractice =emp ->
            list.add(emp);
}
