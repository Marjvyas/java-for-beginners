package conditional_and_loops;
import java.util.Scanner;
public class greater_among_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        if(a>b){
            if(a>=c){
                System.out.println(a+" is biggest number.");
            }
            else{
                System.out.println(c+" is biggest number.");
            }
        }
        else if(a<b){
            if(b>=c){
                System.out.println(b+" is biggest number.");
            }
            else{
                System.out.println(c+" is biggest number.");
            }
        }
        else if(a==b){
            if(a>c){
                System.out.println(a+" is biggest number.");
            }
            else if(a<c){
                System.out.println(c+" is biggest number.");
            }
            else{
                System.out.println("similar numbers.");
            }
        }
    }
}
