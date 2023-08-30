package maps;

import java.util.*;

class Employee {
    private String name;
    private int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String toString() {
        return name + " ";
    }

    @Override
    public void finalize() {
        System.out.println("Finalize is called by garbage collector");
    }

}

public class weakhash {
    public static void main(String[] args) {

        Employee e = new Employee("Rohit", 114);

        // e = null; // Elligible for garbage collector
        // System.gc();
        // System.out.println(e);
        // System.out.println("Last line");
        /*
         * !output
         * null
         * Last line
         * Finalize is called by garbage collector
         */

        /*
         * HashMap dominate garbage collector Thus it is not getting called
         * ! output
         * {Rohit =Hyder}
         * null
         * Last line
         * 
         */
        // HashMap hs = new HashMap();
        // hs.put(e, "Hyder");
        // System.out.println(hs);
        // e = null; // Elligible for garbage collector
        // System.gc();
        // System.out.println(hs);
        // System.out.println("Last line");

        /*
         * WeakHashMap do not dominate garbage collector
         * !output
         * {Rohit =Hyder}
         * {}
         * Last line
         * Finalize is called by garbage collector
         * 
         */
        WeakHashMap hs = new WeakHashMap();
        hs.put(e, "Hyder");
        System.out.println(hs);
        e = null; // Elligible for garbage collector
        System.gc();
        System.out.println(hs);
        System.out.println("Last line");
    }
}
