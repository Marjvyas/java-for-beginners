package arrays;
import java.util.Scanner;
public class sum_of_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        float [] arr=new float[n];
        float sum=0;
        for(int i=0; i<n; i++){
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=sc.nextFloat();
            sum+=arr[i];
        }
        System.out.printf("Sum of all elements is: %.2f",sum);
    }
}
