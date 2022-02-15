package functionalInterface.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Emp2
{
    Integer empId;
    String name;

}

public class BiConsumerPractice
{
   static List<Emp2> list = new ArrayList<Emp2>();
    public static void main(String[] args) {


        consumerPractice.accept(123,"prabhakar");
        consumerPractice.accept(12345,"anushka");
        System.out.println(list);
    }

    static BiConsumer<Integer,String> consumerPractice = (id,name) ->
            list.add(new Emp2(id,name));
}
