//Description: Insert and delete elements in an arraylist
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(N);
        for(int i=0; i<N; i++){
            arr.add(sc.nextInt());
        }
        int Q=sc.nextInt();//number of queries
        //Insert x y: Insert integer y at position x
        //Delete x: Delete the integer at position x
        for(int i=0; i<Q; i++){
            if(sc.next().equals("Insert")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                arr.add(x, y);
            }
            else{
                int x=sc.nextInt();
                arr.remove(x);
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
