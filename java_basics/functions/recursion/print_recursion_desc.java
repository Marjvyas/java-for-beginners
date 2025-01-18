package functions.recursion;

import java.util.Scanner;

public class print_recursion_desc {
    static void display(int n){
        if(n>0){
            System.out.print(n+" ");
            display(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        display(n);
    }
}
