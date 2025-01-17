package functions;

import java.util.Scanner;

public class calculator {
    static float add(float a, float b){
        return a+b;
    }
    static float subtract(float a, float b){
        return a-b;
    }
    static float multiply(float a, float b){
        return a*b;
    }
    static float divide(float a, float b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        float a=sc.nextFloat();
        System.out.print("Enter value of b: ");
        float b=sc.nextFloat();
        System.out.printf("a + b = %.2f\n",calculator.add(a, b));
        System.out.printf("a - b = %.2f\n",calculator.subtract(a, b));
        System.out.printf("a * b = %.2f\n",calculator.multiply(a, b));
        System.out.printf("a / b = %.2f\n",calculator.divide(a, b));
    }
}
