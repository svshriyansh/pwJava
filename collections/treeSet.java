package collections;
import java.util.*;

class treeSet{
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(10);
        ts.add(02);
        ts.add(10);
        ts.add(11);
        ts.add(120);
        ts.add(70);
        ts.add(180);
        ts.add(200);

        System.out.println(ts);

        System.out.println( ts.higher(10));
        System.out.println(ts.lower(10));

        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));

        System.out.println(ts.ceiling(10));
        System.out.println(ts.floor(10));



    }
}


;