package collections;

import java.util.*;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(12);
        ad1.add(13);
        ad1.add(13);
        ad1.add(16);

        System.out.println("1 ->" + ad1);

        ad1.addFirst(01);
        ad1.addLast("last");

        System.out.println("2 -> " + ad1);

        ad1.offer(100);
        ad1.offerFirst(001);
        ad1.offerLast(800);

        System.out.println("3 -> " + ad1);

    }

}
