// We are writing the data into the file from the java code
package IO;

import java.io.*;

public class file3 {
    public static void main(String[] args) throws IOException {
        File dir = new File("Pw");
        File file = new File(dir, "pwskills.txt");

        // Filewritter has overriding nature thus it will over write the data everytime
        // we insert it
        // If we want to append the data in the fle then we need to pass true in the
        // paramater of the constructor
        FileWriter fw = new FileWriter(file, true);
        fw.write(65);
        fw.write("\n");
        fw.write(75);
        char ch[] = { 'j', 'a', 'v', 'a' };
        fw.write("\n");
        fw.write(ch);
        fw.write("\n");
        fw.write("Java is the great language");
        fw.close();
        fw.flush();
        System.out.println("Open the file to se the results");
    }
}
