package IO;

import java.io.*;

public class file {
    public static void main(String[] args) throws IOException {
        File file1 = new File("Pw.txt");
        System.out.println("Do file existes: " + file1.exists());
        file1.createNewFile();
        System.out.println("Do file existes: " + file1.exists());

        File dir = new File("PW");
        System.out.println("Do directory existes: " + dir.exists());
        dir.mkdir();
        System.out.println("Do directory existes: " + dir.exists());

    }
}
