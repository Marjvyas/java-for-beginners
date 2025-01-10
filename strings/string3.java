// package strings;
import java.util.Scanner;
public class string3 {
    public static void main(String[] args) {
        System.out.println("This are the basic string operations:");
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string:");
        String a=sc.nextLine();
        System.out.println("Length of string: "+a.length());
        System.out.println("first and last character: "+ a.charAt(0)+" and "+a.charAt(a.length()-1));
        System.out.println("Substring is: "+a.substring(0,a.indexOf(' ')));
        System.out.println("Upper string: "+a.toUpperCase());
        System.out.println("Lower string: "+a.toLowerCase());
        System.out.println("Trimmed string: "+a.trim());
        System.out.println("Check the string is empty or not: "+a.isEmpty());
        System.out.println("Split the string: "+a.split(" "));
        System.out.println("Join the elements with '-': "+String.join("-", "marj","Vyas",a));
        System.out.println("Convert the string to character array: "+"Marj".toCharArray());
    }
}
