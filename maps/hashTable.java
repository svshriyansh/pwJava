package maps;

import java.util.*;

public class hashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "Rohit");
        ht.put(2, "Rohan");
        ht.put(3, "Rani");

        System.out.println(ht);

        TreeMap tm = new TreeMap();
        tm.put(1, "Hitesh");
        tm.put(2, "Navin");
        tm.put(3, "Hyder");

        tm.clear();
        System.out.println(tm);
    }
    
}
