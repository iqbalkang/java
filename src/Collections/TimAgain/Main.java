package Collections.TimAgain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"bala", "jeeto", "prince", "abhi"};
        List<String> list = new ArrayList<>(List.of(names));
        list.forEach(System.out::println);

        list.add("gary");
        list.addAll(List.of("vicky", "pawan"));
        list.forEach(System.out::println);

        System.out.println("contains gary?: " + list.contains("gary"));
        list.removeIf(s -> s.charAt(0) == 'g');
        list.forEach(System.out::println);






    }
}
