import java.sql.SQLOutput;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first digit: ");
        float a=sc.nextFloat();
        System.out.print("Enter second digit: ");
        float b=sc.nextFloat();
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+(a/b));
        System.out.println("a%b: "+(a%b));
    }
}
