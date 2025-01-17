package functions;

import java.util.Scanner;

public class reverse_string {
    static void reverse(String s){
        String result="";
        for(int i=s.length() - 1; i>=0; i--){
            result+=s.charAt(i);
        }
        System.out.println("Reversed string: "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        reverse_string.reverse(s);
    }
}
