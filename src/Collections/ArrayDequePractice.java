package Collections;

import java.util.ArrayDeque;

public class ArrayDequePractice {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        dq.offerFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.offerFirst(5);
        dq.addFirst(6);

        dq.pollFirst();
        dq.pollFirst();
        dq.pollFirst();
        dq.pollFirst();

        System.out.println(dq);
    }

}
