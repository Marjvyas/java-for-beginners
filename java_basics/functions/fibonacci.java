package functions;

import java.util.Scanner;

public class fibonacci {
    static void fibo(int n){
        int a=0;
        int b=1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Upto which position?: ");
        int n=sc.nextInt();
        fibonacci.fibo(n);
    }
}
