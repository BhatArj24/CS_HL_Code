import java.io.*;
import java.util.Arrays;


public class Passengers {
    public static int[][] readDatato2D() throws IOException {
        File file = new File("C:\\Users\\BhatArj24\\Documents\\Code\\CS_HL_Code\\FileIO\\passengers.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int[][] result = new int[30][7];
        String st;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 7; j++) {
                while ((st = br.readLine()) != null){


                    result[i][j] = Integer.parseInt(st);
                }



            }
        }


        return result;
    }
    public static void main(String[] args) throws IOException {
        int[][] passengers = readDatato2D();

        System.out.println(Arrays.deepToString(passengers));
    }
}
