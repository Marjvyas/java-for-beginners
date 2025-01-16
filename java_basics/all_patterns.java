
import java.util.Scanner;
public class all_patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("\n<-------------------Square Patterns------------------->");
        System.out.println("\n1) Filled:");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n2) Hollow:");
        System.out.println();
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
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n2) Inverted:");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n3) Hollow:");
        System.out.println();
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
        System.out.println("\n<-------------------Pyramid-1------------------>");
        System.out.println("\n1) Full Pyramid-1: ");
        System.out.println();
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
        System.out.println("\n2) Inverted Pyramid-1: ");
        System.out.println();
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
        System.out.println();
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
        System.out.println("\n<-------------------Pyramid-2------------------->");
        System.out.println("\n1) Full Pyramid-2: ");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n2) Inverted Pyramid-2: ");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n3) Hollow Pyramid-2: ");
        System.out.println();
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
        System.out.println("\n<-------------------Diamond------------------>");
        System.out.println("\n1) Full Diamond: ");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(i+1)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n3) Hollow Diamond: ");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(i+1)-1; k++){
                if(k==0 || k==2*i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(n-i)-1; k++){
                if(k==0 || k==2*(n-i)-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n<-------------------Zigzag------------------>");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i+j)%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n<-------------------x------------------>");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*(n-i)-1; j++){
                if(j==0 || j==2*(n-i)-2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int k=0; k<n-i-1; k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j==0 || j==2*i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n<-------------------Hourglass------------------>");
        System.out.println("\n1) Full Hourglass: ");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1; i<n; i++){
            for(int j=0; j<n-(i+1); j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*(i+1)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("\n2) Hollow Hourglass: ");
        System.out.println();
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*(n-i)-1; j++){
                if(j==0 || j==2*(n-i)-2 || i==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<n; i++){
            for(int k=0; k<n-i-1; k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j==0 || j==2*i || i==n-1){
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
