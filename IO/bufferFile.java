package IO;

import java.io.*;

public class bufferFile {
    public static void main(String[] args) throws IOException {
        File dir = new File("Pw");
        File file = new File(dir, "pwJava.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(65);
        bw.newLine();
        bw.write("Java");
        bw.newLine();
        bw.write("is good");

        bw.close();

    }
}
