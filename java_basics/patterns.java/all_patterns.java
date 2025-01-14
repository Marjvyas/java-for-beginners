
import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("\n<-------------------Square Patterns------------------->");
        System.out.println("\n1) Filled:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n2) Hollow:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==(n-1)){
                    System.out.print("*");
                }
                else if(j==0 || j==(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n<-------------------Right angle triangles------------------->");
        System.out.println("\n1) Filled:");
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n2) Inverted:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n3) Hollow:");
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==i || j==0 || j==(n-1)||i==(n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n<-------------------Pyramid------------------->");
        System.out.println("\n1) Full Pyramid: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(i+1)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n2) Inverted Pyramid: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n3) Hollow Pyramid: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(i+1)-1; k++){
                if(k==0 || k==2*i || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
