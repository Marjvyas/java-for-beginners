// Description: Write a program to convert an integer to a string. If the input integer is within the range -100 to 100, print "Good job". Otherwise, print "Wrong answer".
// The program will take an integer as input and will convert it to a string using the Integer.toString() method.
import java.util.Scanner;

public class int_to_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=-100 && n<=100){
            String s=Integer.toString(n);
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}
