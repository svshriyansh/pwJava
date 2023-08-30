package maps;
import java.util.Map;
import java.util.* ;
public class access {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(01, "virat");//Entry the combination of key and value
        hm1.put(null, null);
        hm1.put(02, "Rohan");//same entry will not be stored
        hm1.put(03, "Hrittik");//same entry will not be stored
        hm1.put(04, "Joncena");//same entry will not be stored
        hm1.put(05, "Nik");//same entry will not be stored

        //get value of specific key
        System.out.println(hm1.get(5));

        //get all the keys
        Set key = hm1.keySet();
        Iterator itr1 = key.iterator();
        while(itr1.hasNext()){
            // System.out.println(itr1.next());
            Integer keyVal = (Integer)itr1.next();
            System.out.println(keyVal);
        }
        System.out.println("<----------------->");
        
        //get all the values
        Collection values =hm1.values();
        Iterator itr2=values.iterator();
        while(itr2.hasNext()){
            String st1 = (String)itr2.next();
            System.out.println(st1);
        }

        System.out.println("<----------------->");

        //get the entries
       Set entry = hm1.entrySet();
       Iterator itr3=entry.iterator();

       while(itr3.hasNext()){
        // System.out.println(itr3.next());
            Map.Entry data =(java.util.Map.Entry)itr3.next();
            System.out.println(data.getKey() +" : "+ data.getValue());
       }
    }
}
