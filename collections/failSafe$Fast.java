package collections;
import java.util.*;
import java.util.concurrent.*;

public class failSafe$Fast {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(800);
        al.add(400);
        al.add(300);
        al.add(200);

        
        // for (int i = 0; i < al.size(); i++) {
        //     System.out.println(al.get(i));
        //     al.add(2); it will create an infinite loop
        // }

        
        // Fail Fast as it will give exception ConcurrentModificationException which is not good
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            // al.add(2);
        }

        System.out.println("<--------------------->");
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
        al1.add(100);
        al1.add(800);
        al1.add(400);
        al1.add(300);
        al1.add(200);
        // Fail fast
        Iterator itr1 = al1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
            al1.add(2);
        }



        
    }
}
