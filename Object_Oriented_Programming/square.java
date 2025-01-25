package java_for_beginners.Object_Oriented_Programming;

import java.util.Scanner;

class Square_details{
    float length;
    public void setlength(float n){
        length=n;
    }
    public float area(){
        return (float)Math.pow(length, 2);
    }
    public float perimeter(){
        return 4*length;
    }
}
public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Square_details s=new Square_details();
        System.out.print("Enter the length: ");
        float a=sc.nextFloat();
        s.setlength(a);
        System.out.println("Area of the square: "+s.area());
        System.out.println("Perimeter of the square: "+s.perimeter());
    }
}
