import java.util.Scanner;
public class website_type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter website URL: ");
        String s=sc.nextLine();
        if(s.endsWith(".com")){
            System.out.println("Tis is commercial website.");
        }
        else if(s.endsWith(".org")){
            System.out.println("Tis is organizational website.");
        }
        else if(s.endsWith(".in")){
            System.out.println("Tis is an indian website.");
        }
    }
}
