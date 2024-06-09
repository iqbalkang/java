package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        Integer[] aa = {1, 2, 3, 4, 5};

        ArrayList<Integer> al1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> al2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        Iterator<Integer> it = al1.iterator();

        while(it.hasNext()) {
            if(it.next() == 1) {
                it.remove();
            }
        }
        System.out.println(al1);
    }
}
