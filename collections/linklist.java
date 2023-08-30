package collections;

import java.util.*;

public class linklist {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(300);
        ll1.add(400);

        System.out.println(ll1);

        System.out.println(ll1.indexOf(300));
        System.out.println(ll1.lastIndexOf(300));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());
        ll1.push(1);
        System.out.println(ll1);
    }
    
}
