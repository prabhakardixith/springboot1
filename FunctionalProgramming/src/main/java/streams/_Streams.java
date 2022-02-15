package streams;

import imperative.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Streams
{
    private static List<Person> list;

    public static void main(String[] args) {
        List<Person> list = new ArrayList();
        list.add(new Person("prabhakar",Gender.MALE));
        list.add(new Person("suhel",Gender.MALE));
        list.add(new Person("uday", Gender.MALE));
        list.add( new Person("dechen", Gender.FEMALE));
        list.add(new Person("sikha", Gender.FEMALE));
        list.add(new Person("sara", Gender.FEMALE));

       list.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet()).forEach(gender -> System.out.println(gender));


        list.stream().filter(person -> person.gender.equals(Gender.MALE))
                .forEach(person -> System.out.println(person));


        String str [] ={"hi","bye"};
        Arrays.stream(str).filter(s -> s.length() > 2).forEach(s -> System.out.println(s));

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
