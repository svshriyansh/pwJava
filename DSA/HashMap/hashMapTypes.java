package DSA.HashMap;

import java.util.*;

public class hashMapTypes {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(5, "Sukhvender");
        map.put(1, "Mahender");
        map.put(4, "Balvender");
        map.put(6, "Jitender");
        map.put(3, "Harvender");

        System.out.println("Hashmap looks like " + map);

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(5, "Sukhvender");
        map1.put(1, "Mahender");
        map1.put(4, "Balvender");
        map1.put(6, "Jitender");
        map1.put(3, "Harvender");

        System.out.println("LinkedHashMap looks like " + map1);

        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(5, "Sukhvender");
        map2.put(1, "Mahender");
        map2.put(4, "Balvender");
        map2.put(6, "Jitender");
        map2.put(3, "Harvender");
        System.out.println("TreeMap looks like " + map2);
    }

}
