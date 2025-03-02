// Description: Write a Java program to perform the following operations on two strings A and B:
// 1. Print the sum of the lengths of A and B.
// 2. Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
// 3. Capitalize the first letter in A and B and print them on a single line, separated by a space.
package strings;


import java.io.*;
import java.util.*;

public class string5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}
