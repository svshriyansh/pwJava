package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readfile {
    public static void main(String[] args) throws IOException {
        File dir = new File("PW");
        File file = new File(dir, "pwskills.txt");

        FileReader fr = new FileReader(file);
        // int i = fr.read();

        char ch[] = new char[(int) file.length()];
        fr.read(ch);
        for (char data : ch) {
            System.out.print(data);
        }
        // while (i != -1) {
        // System.out.print(i + " ---->");
        // System.out.println((char) i);
        // i = fr.read();
        // }
        fr.close();

    }
}
