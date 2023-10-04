import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Passengers {
    public static int[][] readDatato2D() throws IOException {
        File file = new File("C:\\Users\\BhatArj24\\Documents\\Code\\CS_HL_Code\\FileIO\\passengers.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<Integer> place = new ArrayList<Integer>();
        int[][] result = new int[30][7];
        String st;
        while ((st = br.readLine()) != null){


            place.add(Integer.parseInt(st));
        }
        int i = 0;
        while(i<210){
            result[i/7][i%7] = place.get(i);
            i++;
        }
        return result;
    }
    public static String convert(int num){
        if(num==0) return "Sunday";
        if(num==1) return "Monday";
        if(num==2) return "Tuesday";
        if(num==3) return "Wednesday";
        if(num==4) return "Thursday";
        if(num==5) return "Friday";
        if(num==6) return "Saturday";
        return null;
    }
    public static int columnSum(int col, int[][] passengers){
        int result = 0;
        for (int i = 0; i < 30; i++) {
            result+=passengers[i][col];
        }
        return result;
    }
    public static double[] highestAverage(int[][] passengers){
        double[] averages = new double[7];
        for (int i = 0; i < 7; i++) {
            averages[i] = (double) columnSum(i,passengers)/30;
        }
        int index = -1;
        double max = -1;
        for (int i = 0; i <6; i++) {
            if(averages[i]>max){
                max = averages[i];
                index = i;
            }
        }
        double[] result = {index,max};
        return result;
    }

    public static int salesCalculate(int[][] passengers, int col1,int row1,int col2, int row2, int[] fees){
        int result = 0;
        for (int i = row1; i < row2+1; i++) {
            for (int j = 0; j < 7; j++) {
                if(i==row1){
                    if(j<col1) continue;
                }
                if(i==row2){
                    if(j>col2) break;
                }
                if(i>0 && i<6){
                    result+=passengers[i][j]*fees[0];
                } else{
                    result+=passengers[i][j]*fees[1];
                }

            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        int[][] passengers = readDatato2D();
        double[] highestAvg = highestAverage(passengers);
        int[] fees = {20,30};
        System.out.println(convert((int)highestAvg[0])+": "+highestAvg[1]);


        System.out.println(salesCalculate(passengers,1,1,7,5,fees));
    }
}
