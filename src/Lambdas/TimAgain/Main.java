package Lambdas.TimAgain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record Person(String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName + " " + lastName;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("vicky", "pahwa"),
                new Person("prince", "trivedi"),
                new Person("jeeto", "kang"),
                new Person("bala", "kang"),
                new Person("abhi", "khindri")
        ));

        people.sort((p1, p2) -> p1.lastName.compareTo(p2.lastName));
        for(Person p : people) System.out.println(p);
        System.out.println("-".repeat(50));

        interface enhancedComparator<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var newComp = new enhancedComparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o1.lastName.compareTo(o2.lastName);
                return result == 0 ? secondLevel(o1, o2) : result;
            }

            @Override
            public int secondLevel(Person o1, Person o2) {
                return o1.firstName.compareTo(o2.firstName);
            }
        };

        people.sort(newComp);
        for(Person p : people) System.out.println(p);


//        var comp = new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p1.lastName.compareTo(p2.lastName);
//            }
//        };
    }
}
