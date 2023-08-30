package DSA.HashMap;

import java.util.*;

public class hashFunction {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();

        hashmap.put(5, "Sukhvender");
        hashmap.put(1, "Mahender");
        hashmap.put(4, "Balvender");
        hashmap.put(6, "Jitender");
        hashmap.put(3, "Harvender");

        System.out.println("\n-> Hashmap of a given data is " + hashmap + "\n");

        String result = hashmap.get(4);
        System.out.println("Object key is -> " + result);
        System.out.println("\nHash map contain key 9 -> " + hashmap.containsKey(9));
        hashmap.remove(1);
        System.out.println();
        for (Map.Entry<Integer, String> e : hashmap.entrySet()) {
            System.out.println("HashMap key is  " + e.getKey() + " : " + e.getValue());
        }

    }
}
