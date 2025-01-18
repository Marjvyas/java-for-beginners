package functions.recursion;

import java.util.Scanner;

public class sum_of_n_nums {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int x=n+sum(n-1);
        System.out.print(n+" + ");
        return x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println("\nSum of "+n+" natural numbers is: "+sum(n));
    }
}
