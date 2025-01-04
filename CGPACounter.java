import java.util.Scanner;
public class CGPACounter {
    public static void main(String[] args) {
//        write a program to calculate percentage of a given student in cbse board exam.
//        his marks from 5 subjects must be taken as input from the keyboard.(marks are out of 100)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of maths: ");
        float m=sc.nextFloat();
        System.out.print("Enter the marks of science: ");
        float s=sc.nextFloat();
        System.out.print("Enter the marks of physics: ");
        float p=sc.nextFloat();
        System.out.print("Enter the marks of english: ");
        float e=sc.nextFloat();
        System.out.print("Enter the marks of sanskrit: ");
        float sa=sc.nextFloat();
        System.out.println();
        System.out.println("The percentage of the student is: "+((m+s+p+e+sa)/50));
    }
}
