import java.util.Scanner;
public class grade {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks out of 100: ");
        int a=sc.nextInt();
        if(a>90 && a<=100){
            System.out.println("Grade A");
        }
        else if(a>80 && a<=90){
            System.out.println("Grade B");
        }
        else if(a>60 && a<=80){
            System.out.println("Grade C");
        }
        else if(a>33 && a<=60){
            System.out.println("Grade D");
        }
        else if(a<=33){
            System.out.println("Fail !!!");
        }
        else{
            System.out.println("Invalid marks");
        }
    }
}