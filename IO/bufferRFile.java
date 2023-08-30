package IO;

import java.io.*;

public class bufferRFile {
    public static void main(String[] args) {
        File dir = new File("Pw");
        File file = new File(dir, "pwJava.txt");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("IO exception");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

    }
}
