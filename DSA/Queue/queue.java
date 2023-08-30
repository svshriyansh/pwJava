package DSA.Queue;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println("Queue looks like " + queue);

        System.out.println("Top element before deletion " + queue.peek());

        queue.remove();

        System.out.println("Top element before deletion " + queue.peek());
    }
}
