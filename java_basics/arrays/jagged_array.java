package java_for_beginners.java_basics.arrays;

import java.util.*;

public class jagged_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        sc.nextLine(); // Consume the newline character after nextInt()

        int[][] arr = new int[row][]; // Declare jagged array

        for (int i = 0; i < row; i++) {
            System.out.print("Enter the number of elements for row " + i + ": ");
            int col = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            arr[i] = new int[col]; // Initialize sub-array

            // Input elements for the current row
            for (int j = 0; j < col; j++) {
                System.out.print("Enter arr[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
                sc.nextLine(); // Consume the newline character
            }
        }

        // Output the entered jagged array
        System.out.println("Entered matrix: ");
        for (int[] x : arr) {
            System.out.print("|  ");
            for (int j : x) {
                System.out.print(j + "  ");
            }
            System.out.println("|");
        }

        sc.close(); // Close the scanner
    }
}

