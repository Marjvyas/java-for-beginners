package arrays;
import java.util.Scanner;
public class transpose_of_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows for matrix A: ");
        int m=sc.nextInt();
        System.out.print("Enter no. of colls for matrix A: ");
        int n=sc.nextInt();
        float [][] A=new float[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("Enter A["+i+"]["+j+"]: ");
                A[i][j]=sc.nextFloat();
            }
        }
        System.out.println("\n Entered Matrix A: ");
        for(float [] i : A){
            System.out.print("|  ");
            for(float j:i){
                System.out.printf("%.2f  ",j);
            }
            System.out.println("|");
        }
        System.out.println("\n Transpose of matrix A: ");
        for(int i=0; i<n; i++){
            System.out.print("|  ");
            for(int j=0; j<m; j++){
                System.out.printf("%.2f  ",A[j][i]);
            }
            System.out.println("|");
        }
    }
}
