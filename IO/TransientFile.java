package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Crickter implements Serializable {
    private String name;
    transient private int age;
    private int runs;

    public Crickter(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void Dip() {
        System.out.println(name);
        ;
        System.out.println(age);
        System.out.println(runs);
    }
}

public class TransientFile {
    public static void main(String[] args) throws Exception {
        // serilization..........
        // Crickter c = new Crickter("Sachin", 34, 30000);
        // FileOutputStream fos = new FileOutputStream("pwskills.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(bos);

        // oos.writeObject(c);
        // oos.flush();
        // c.Dip();
        // oos.close();

        // Deerilization..........
        FileInputStream fis = new FileInputStream("pwskills.txt");
        BufferedInputStream bif = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bif);
        Crickter cr = (Crickter) ois.readObject();
        cr.Dip();
        ois.close();

    }
}
