package java_for_beginners.Object_Oriented_Programming;
class circle1{
    int radius;
    public circle1(){
        System.out.println("This is circle...");
    }
    public circle1(int radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class cylinder1 extends circle1{
    int height;
    public cylinder1(){
        System.out.println("This is cylinder...");
    }
    public cylinder1(int radius,int height){
        super(radius);
        this.height=height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class circle_extends_cylinder{
    public static void main(String[] args) {
        cylinder1 obj=new cylinder1(10,2);
        System.out.println("Volume of cylinder: "+obj.volume());
        System.out.println("Area of base of cylinder: "+obj.area());
    }
}
