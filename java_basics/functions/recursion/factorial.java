package functions.recursion;

import java.util.Scanner;

public class factorial {
    static int fact(int a){
        if(a==0){
            return 1;
        }
        System.out.print(a+" * ");
        return a*fact(a-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("\nFactorial of "+n+" is "+factorial.fact(n));
    }
}
