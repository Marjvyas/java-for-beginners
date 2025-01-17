package arrays;

import java.util.Scanner;

public class matrix_multiplication {
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
        System.out.println("No. of rows for matrix B is: "+n);
        System.out.print("Enter no. of colls for matrix B: ");
        int n1=sc.nextInt();
        float [][] B=new float[n][n1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n1; j++){
                System.out.print("Enter B["+i+"]["+j+"]: ");
                B[i][j]=sc.nextFloat();
            }
        }
        float [][] c=new float[m][n1];
        System.out.println("\nResultant matrix after multiplication:");
        for(int i=0; i<m; i++){
            for(int k=0; k<n1; k++){
                float sum=0;
                for(int j=0; j<n; j++){
                
                    sum+=A[i][j]*B[j][k];
                }
                c[i][k]=sum;
            }
        }
        for(float [] i : c){
            System.out.print("|  ");
            for(float j:i){
                System.out.printf("%.2f  ",j);
            }
            System.out.println("|");
        }

    }
}
