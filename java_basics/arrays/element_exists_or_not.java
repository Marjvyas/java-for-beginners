package arrays;
import java.util.Scanner;
public class element_exista_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n=sc.nextInt();
        float [] arr=new float[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter arr["+i+"]: ");
            arr[i]=sc.nextFloat();
        }
        System.out.print("Enter the element which you want to find: ");
        float x=sc.nextFloat();
        int flag=0;
        for(float i : arr){
            if(i==x){
                System.out.println("Element found in array...");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found...");
        }
    }
}
