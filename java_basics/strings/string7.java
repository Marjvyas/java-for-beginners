// Description: Java program to find the smallest and largest substring of length k from a given string.
// The program will take a string and an integer k as input and will return the smallest and largest substring of length k.
// The program will use the substring() method of the String class to extract the substrings.
package strings;

import java.util.Scanner;

public class string7 {
    public static String getSmallestAndLargest(String s, int k){
        String small=s.substring(0,k);
        String large=s.substring(0,k);
        for(int i=1; i<=s.length()-k; i++){
            if(s.substring(i,i+k).compareTo(small)<0){
                small=s.substring(i,i+k);
            }
            if(s.substring(i,i+k).compareTo(large)>0){
                large=s.substring(i,i+k);
            }
        }
        return small+"\n"+large;// small and large are the two strings according to lexico-graphical order
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
