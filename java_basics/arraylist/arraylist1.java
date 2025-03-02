package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> Arr1=new ArrayList<>(n);
        for(int i=1; i<=n; i++){
            int d=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>(d);
            for(int j=1; j<=d; j++){
                arr.add(sc.nextInt());
            }
            Arr1.add(arr);
        }
        int q=sc.nextInt();
        for(int i=1 ;i<=q; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<=n && y<=Arr1.get(x-1).size()){
                System.out.println(Arr1.get(x-1).get(y-1));
            }
            else{
                System.out.println("ERROR!");
            }
        }
    }
}
