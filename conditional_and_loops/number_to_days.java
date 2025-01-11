import java.util.Scanner;
public class number_to_days {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number(0-6): ");
        int n=sc.nextInt();
        switch(n){
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tueday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("Invalid Input.");
            break;
        }
    }
}