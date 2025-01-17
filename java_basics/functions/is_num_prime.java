package functions;

import java.util.Scanner;

public class is_num_prime {
    static boolean prime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer n: ");
        int n=sc.nextInt();
        if(is_num_prime.prime(n)){
            System.out.println("It is a prime number.");
        }
        else{
            System.out.println("It is a nonprime number.");
        }
    }
}
