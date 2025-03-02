// Description: Check if two strings are anagrams or not. Anagrams are the strings which have same characters but in different order.
// The program will take two strings as input and will check if they are anagrams or not. If they are anagrams, it will print "Anagrams". Otherwise, it will print "Not Anagrams".

package strings;

import java.util.Scanner;

public class string9 {
    static int frequency(char x, String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==x){
                count++;
            }
        }
        return count;
    }
    static boolean isAnagram(String a, String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        int flag=0;
        if(a.length()==b.length()){
            for(int i=0; i<a.length(); i++){
                char temp=a.charAt(i);
                if(frequency(temp, a)!=frequency(temp, b)){
                    flag=1;
                }
            }
            if(flag==0){
                return true;
            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(isAnagram(a, b)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
