package conditional_and_loops;
import java.util.Scanner;
public class odd_and_even_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=0; i<=n; i++){
            arr[i]=i;
        }
        System.out.println("Odd numbers:");
        for(int i:arr){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nEven numbers");
        for(int i:arr){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
