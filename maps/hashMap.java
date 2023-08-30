//More on hashmap like how to store data
package maps;

import java.util.*;
import java.util.Map.*;

class Student {
    private String name;
    private int age;
    private String city;

    Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return name + " " + age + " " + city;
    }

}

public class hashMap {
    public static void main(String[] args) {
        Student st1 = new Student("Monu", 18, "Meerut");
        Student st2 = new Student("Sonu", 28, "Kanpur");
        Student st3 = new Student("Pinku", 30, "Cili");

        HashMap hp1 = new HashMap();

        hp1.put(01, st1);
        hp1.put(02, st2);
        hp1.put(03, st3);

        System.out.println(hp1);

        Set data = hp1.entrySet();
        Iterator itr1 = data.iterator();

        while (itr1.hasNext()) {

            Map.Entry entry = (Entry) itr1.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
