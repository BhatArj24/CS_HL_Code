import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Queues {

    public static Queue<Integer> stutter(Queue<Integer> q){
        Queue<Integer> q2 = new LinkedList<Integer>();


        while(!q.isEmpty()){
            int num = q.remove();
            q2.add(num);
            q2.add(num);

        }
        return q2;
    }
    public static Queue<String> mirror(Queue<String> q){
        String[] q2 = new String[q.size()];
        Stack<String> s = new Stack<String>();

        int size = q.size() ;
        for (int i = 0; i < size; i++) {
            q2[i] = q.remove();
        }
        for (int i = 0; i < q2.length; i++) {
            s.push(q2[i]);
        }
        for (int i = 0; i < q2.length; i++) {
            q.add(q2[i]);
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }

        return q;
    }
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<Integer>();
//        Scanner read = new Scanner(System.in);
//        System.out.print("Enter the amount of scores you want to enter:");
//        int num = read.nextInt();
//        for (int i = 0; i < num ; i++) {
//            q.add(read.nextInt());
//        }
//
//
//        // filtering out 100
//        Stack<Integer> s = new Stack<Integer>();
//        for (int i = 0; i < num; i++) {
//            int score = q.remove();
//            if(score != 100){
//                s.add(score);
//            }
//        }
//        while(!s.isEmpty()){
//            q.add(s.pop());
//        }
//
//
//        System.out.println(q);
        Queue<String> q = new LinkedList<String>();
        q.add("a");
        q.add("b");
        q.add("c");
        q = mirror(q);
        System.out.println(q);



    }
}
