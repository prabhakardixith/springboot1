package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {
        List<Person> list = new ArrayList();
        list.add(new Person("prabhakar",Gender.MALE));
        list.add(new Person("uday",Gender.MALE));
        list.add( new Person("dechen",Gender.FEMALE));
        list.add(new Person("sikha",Gender.FEMALE));
        list.add(new Person("sara",Gender.FEMALE));


        System.out.println("Imperative approach");
        //Imperative approach
        List<Person> females = new ArrayList<Person>();
        for(Person person : list)
        {
            if(Gender.FEMALE.equals(person.gender))
            {
                females.add(person);
            }
        }
        for(Person f : females)
        {
            System.out.println(f);
        }


        //Declarative approach
        System.out.println("Declarative approach");
         List<Person> females2 = list.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        System.out.println(females2);


        System.out.println("declaratice approach without collectors.toList()");
        list.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);
    }
    static class Person
    {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
