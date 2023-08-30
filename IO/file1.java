// creating file in a directory
package IO;

import java.io.*;

public class file1 {
    public static void main(String[] args) throws IOException {
        // File dir = new File("Pw");
        // System.out.println(dir.isDirectory());
        // dir.mkdir();

        // File file = new File(dir, "pwskills.txt");
        // file.createNewFile();
        // System.out.println("File refering to pwskills : " + file.isFile());

        int count = 0;
        File f = new File("IO");
        String str[] = f.list();
        for (String name : str) {
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are : " + count);
    }
}
