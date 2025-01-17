package functions;
import java.util.Scanner;
public class factorial {
    float factorial(float a){
        if(a==0){
            return 1;
        }
        float result=1;
        while(a>0){
            result*=a;
            a-=1;
        }
        return result;
    }
    public static void main(String[] args) {
        factorial fact=new factorial();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        float n=sc.nextFloat();
        System.out.printf("Factorial of %.2f = %.2f",n,fact.factorial(n));
    }
}
