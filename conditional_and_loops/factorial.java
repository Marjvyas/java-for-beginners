package conditional_and_loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        int result=1;
        int i=n;
        System.out.println("\nFactorial of "+n+" is: ");
        while(i!=0){
            result*=i;
            System.out.print(i+" * ");
            i--;
        }
        System.out.println("\n"+result);
    }
}
