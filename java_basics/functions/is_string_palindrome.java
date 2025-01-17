package functions;

import java.util.Scanner;

public class is_string_palindrome {
    static boolean palindrome(String s){
        int start=0;
        int end=s.length() - 1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String s=sc.nextLine();
        if(is_string_palindrome.palindrome(s)){
            System.out.println("String is palindrome.");
        }
        else{
            System.out.println("String is not palindrome.");
        }
    }
}
