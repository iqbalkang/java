package Collections.Dheeru;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {

    public static void generateArrayList() {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(4);
        ints.add(2);
        ints.add(7);
        ints.add(10);
        ints.add(3);
        ints.add(5);
        System.out.println(ints);

        List<Integer> list2 = ints.subList(1,4);
        System.out.println(list2);
        list2.set(0, 12);
        list2.add(0, 22);
        System.out.println(ints);
        System.out.println(list2);


    }

    public static void main(String[] args) {
        generateArrayList();

    }
}
