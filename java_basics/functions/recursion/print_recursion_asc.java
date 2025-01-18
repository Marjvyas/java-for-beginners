package functions.recursion;

import java.util.Scanner;

public class print_recursion_asc {
    static void display(int n){
        if(n>0){
            display(n-1);
            System.out.print(n+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        display(n);
    }
}
