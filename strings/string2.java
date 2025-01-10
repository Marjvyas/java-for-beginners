package strings;
import java.util.Scanner;
public class string2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Script project:");
        System.out.print("Enter your first name:");
        String a=sc.nextLine();
        System.out.print("Enter your last name:");
        String b=sc.nextLine();
        System.out.print("Enter your hobby:");
        String c=sc.nextLine();
        System.out.print("Enter Your age:");
        int d=sc.nextInt();
        System.out.println();
        System.out.println("The script according to given data is as follows:");
        System.out.println("Hello everybody...");
        System.out.println("My self "+a+" "+b);
        System.out.println("My hobby is: "+c);
        System.out.println("I am "+d+" years old.");


    }
}
