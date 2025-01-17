package functions.recursion;

import java.util.Scanner;

public class fibonacci {
    static int fibo(int n){
        if(n==2){
            return 1;
        }
        if(n==1){
            return 0;
        }
        return fibo(n-2)+fibo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Upto which??: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci series upto "+n+": ");
        for(int i=1; i<=n; i++){
            System.out.print(fibonacci.fibo(i)+" ");
        }
        System.out.println("\n"+"Element present at "+n+" position is: "+fibonacci.fibo(n));
    }
}
