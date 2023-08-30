package api_annotation;

import java.util.*;

public class forEach {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        al1.add(4);

        System.out.println(al1);

        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(l1);

        // External loop
        for (Integer i : al1) {
            System.out.println(i);
        }

        System.out.println("------------");
        /*
         * ! using inbuilt function for iterating the list
         * if we are useing forEach method then need to give implementation of cosumer
         * inter face
         * as shwn by using lambda function
         * 
         */
        l1.forEach(i -> System.out.println(i));
    }
}
