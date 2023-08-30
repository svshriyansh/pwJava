package maps;
import java.util.*;

public class hashAnsLink {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(01, "virat");//Entry the combination of key and value
        hm1.put(null, null);
        hm1.put(01, "virat");//same entry will not be stored

        System.out.println(hm1);
        LinkedHashMap lm1 = new LinkedHashMap();
        lm1.put(0.1, "Hi");
        lm1.put(1, "Hello");
        lm1.putIfAbsent(12, "Hi");

        System.out.println(lm1);
    }
}
