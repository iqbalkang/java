package Collections;

import java.util.PriorityQueue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(2);
        pq.add(5);
        pq.add(201);
        pq.add(20);
        pq.add(18);
        pq.add(43);
        pq.add(45);

        pq.remove();

        System.out.println(pq.element());


//        pq.add(20);
//        pq.offer(10);
//        pq.add(30);
//        pq.offer(5);
//        pq.add(15);
//        pq.offer(3);


        System.out.println(pq);

    }

}
