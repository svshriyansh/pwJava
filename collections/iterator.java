package collections;
import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList al1 =new ArrayList();
        al1.add(100);
        al1.add(400);
        al1.add(300);
        // al1.contains(200);

        Iterator itr =  al1.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        ListIterator lit = al1.listIterator(al1.size());
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }
    }
}
