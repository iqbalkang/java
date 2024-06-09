package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {

    public static void main(String[] args) {
        var list = new LinkedList<>(List.of(2, 3, 4, 5));
        var el1 = list.peek();
        var el2 = list.peekLast();
        var el3 = list.element();

        System.out.println(el1 + " " + el2 + " " + el3);
    }
}
