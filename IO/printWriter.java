package IO;

import java.io.*;

public class printWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("PW", "pwskill.txt");
        FileWriter fw = new FileWriter(file);

        PrintWriter pw = new PrintWriter(fw);
        pw.println("JAVA");
        pw.println(100);
        pw.println("Hello");
        pw.println(50.67);
        pw.close();

    }
}
