package java_for_beginners.Object_Oriented_Programming;
interface car1{
    void drive1();
    void brake1();
}
interface hornfeature{
    void horn();
}
class maruti2 {
    public maruti2(){
        System.out.println("This is maruti2...");
    }
    public void cng(){
        System.out.println("This is CNG car1...");
    }
}
class omni1 extends maruti2 implements car1,hornfeature{
    public void horn(){
        System.out.println("Pooo Pooo Pip Pip");
    }
    public void drive1(){
        System.out.println("Driving...");
    }
    public void brake1(){
        System.out.println("Braking...");
    }
}
public class interface1 {
    public static void main(String[] args) {
        omni1 obj=new omni1();
        
        obj.drive1();
        obj.cng();
        obj.horn();
        obj.brake1();
    }
}
