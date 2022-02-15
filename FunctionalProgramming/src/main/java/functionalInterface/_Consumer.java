package functionalInterface;

import sun.misc.GC;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer
{
    public static void main(String[] args)
    {
       greetCustomer(new Customer("prabhakar","998878"));

        System.out.println("calling Consumer Functional Interface");

        greetCustomerConsumer.accept(new Customer("anushka","231231"));


        biConsumerUser.accept(new Customer("amma","0987"),false);


    }
    static BiConsumer<Customer,Boolean> biConsumerUser = (customer,showPhone)
            ->
            System.out.println("hello "+customer.customerName +
                    ", thanks for registering phone number "
                    + (showPhone ? customer.customerPhoneNumber : "*****"));


    static void greetCustomer(Customer customer)
    {
        System.out.println("hello "+customer.customerName +
                ", thanks for registering phone number "
                +customer.customerPhoneNumber);
    }

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("hello "+customer.customerName +
                    ", thanks for registering phone number "
                    +customer.customerPhoneNumber);;

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
