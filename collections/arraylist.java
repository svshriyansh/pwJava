package collections;

import java.util.*;;

public class arraylist {
   public static void main(String[] args) {
      int[] a = new int[5];
      System.out.println("gfhefwhkhfkjds" + a);
      ArrayList al1 = new ArrayList();

      al1.add(100);
      al1.add(400);
      al1.add(300);
      al1.contains(200);
      System.out.println(al1.indexOf(100));
      al1.ensureCapacity(10);
      System.out.println("Ensuring capicity " + al1.size());
      al1.trimToSize();
      System.out.println("After triming " + al1.size());
      System.out.println(al1);
      al1.clear();
      System.out.println("After clearing" + al1);
      System.out.println("*****************************");

      ArrayList al2 = new ArrayList();
      al2.add(600);
      al2.add(2.2);
      al2.add("Shriyansh");
      al2.add("S");
      // addind duplicate
      al2.add(600);

      System.out.println(al2);
      System.out.println("*****************************");

      ArrayList al3 = new ArrayList();
      // adding other collection in arraylist
      al3.add(1);
      al3.add(10);
      System.out.println(al3);
      System.out.println("After adding collections");
      al3.addAll(al2);
      System.out.println(al3);

   }
}
