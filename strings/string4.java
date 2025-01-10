package strings;
import java.util.Scanner;
public class string4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a=sc.nextLine();
        System.out.println("Enter b string: ");
        String b=sc.nextLine();
        System.out.println("Compar a with b: "+a.equals(b));
        System.out.println("Compare a with b by ignoring case: "+a.equalsIgnoreCase(b));
        System.out.println("Check whether b exists in a or not: "+a.contains(b));
        System.out.println("Check whether the a starts with b: "+a.startsWith(b));
        System.out.println("Check whether the a endswith b : "+a.endsWith(b));
        System.out.println("Return the index of the first occurence of b in a: "+a.indexOf(b));
        System.out.println("Concat a and b: "+a.concat(b));
    }
}
