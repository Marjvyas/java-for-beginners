package arrays;
import java.util.Scanner;
public class matrices_addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows for matrix A and B: ");
        int m=sc.nextInt();
        System.out.print("Enter no. of colls for matrix A and B: ");
        int n=sc.nextInt();
        float [][] A=new float[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter A["+i+"]["+j+"]: ");
                A[i][j]=sc.nextFloat();
            }
        }
        float [][] B=new float[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter B["+i+"]["+j+"]: ");
                B[i][j]=sc.nextFloat();
            }
        }
        System.out.println("Matrix A:");
        for(float [] i : A){
            System.out.print("|  ");
            for(float j:i){
                System.out.printf("%.2f  ",j);
            }
            System.out.println("|");
        }
        System.out.println("Matrix B:");
        for(float [] i : B){
            System.out.print("|  ");
            for(float j:i){
                System.out.printf("%.2f  ",j);
            }
            System.out.println("|");
        }
        float [][] C=new float[m][n];
        System.out.println("Resultant matrix after addition of two matrices: ");
        for(int i=0; i<m; i++){
            for(int j=0 ;j<n; j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(float [] i : C){
            System.out.print("|  ");
            for(float j:i){
                System.out.printf("%.2f  ",j);
            }
            System.out.println("|");
        }

    }
}
