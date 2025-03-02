// Description: Program to extract a substring from a string.
// The program will take a string and two integers as input and will return the substring of the string from the first integer to the second integer.
// The program will use the substring() method of the String class to extract the substring.
package strings;

import java.util.Scanner;

public class string6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}
