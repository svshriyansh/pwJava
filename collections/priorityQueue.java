package collections;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add(50);
        pq.add(25);
        pq.add(75);
        pq.add(25);
        pq.add(175);
        pq.add(225);
        pq.add(225);

        // Double , String is not allowed will give runtime exception
        // pq.add(22.84);
        // pq.add("Hi");
        System.out.println(pq);
    }
}
