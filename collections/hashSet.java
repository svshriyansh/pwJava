package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(10);
        hs.add(20);
        hs.add(60);

        System.out.println(hs);

        LinkedHashSet ls = new LinkedHashSet();
        ls.add(100);
        ls.add(120);
        ls.add(10);
        ls.add(10);
        ls.add(60);

        System.out.println(ls);
    }
}
