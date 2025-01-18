package arrays;

import java.util.Scanner;

public class diagonal_sum_of_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows and colls for matrix A: ");
        int m=sc.nextInt();
        float [][] A=new float[m][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
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
        
        float sum=0;
        for(int i=0; i<m; i++){
            sum+=A[i][i];
        }
        System.out.println("\nSum of diagonal entries: "+sum);

    }
}
