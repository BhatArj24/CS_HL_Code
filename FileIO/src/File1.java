import java.util.*;
import java.io.*;

public class File1 {
    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();
        File f = new File("fi.txt");
        PrintWriter printer = new PrintWriter(f);
        for (int i = 0; i < 500; i++) {
            int num = rand.nextInt(200,301);
            printer.write(Integer.toString(num));
            printer.write("\n");
        }
        printer.close();
    }
}
