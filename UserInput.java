import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the integer value:");
        int a=s.nextInt();
        s.nextLine();
        System.out.println("Enter the single word:");
        String str2=s.nextLine();
        System.out.println("Enter the string:");
        String str1=s.nextLine();
        System.out.println("Enter the floating point no.:");
        float f=s.nextFloat();
        System.out.print("Integer no: "+a+" Word: "+str2+" String: "+str1+" Float: "+f);
    }
}
