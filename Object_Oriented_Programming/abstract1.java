package java_for_beginners.Object_Oriented_Programming;
abstract class car{
    public car(){
        System.out.println("This is car...");
    }
    public void start(){
        System.out.println("Starting a car...");
    }
    public void brake(){
        System.out.println("Stopping a car...");
    }
    abstract public void fuel();
}
class toyota extends car{
    public toyota(){
        System.out.println("this is toyota...");
    }
    @Override
    public void fuel(){
        System.out.println("This is toyota... using deisel as a fuel");
    }
}
abstract class maruti extends car{
    public maruti(){
        System.out.println("this is maruti...");
    }
    public void drive(){
        System.out.println("Driving a car...");
    }
    abstract public void horn();
}
class omni extends maruti{
    public omni(){
        System.out.println("this is omni...");
    }
    public void horn(){
        System.out.println("peep.....peep...");
    }
    public void fuel(){
        System.out.println("This is Omni...Omni uses petrol as a fuel...");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        omni obj1=new omni();
        obj1.start();
        obj1.drive();
        obj1.brake();
        obj1.horn();
        obj1.fuel();
        System.out.println("------------------------------------");
        toyota obj2=new toyota();
        obj2.start();
        obj2.brake();
        obj2.fuel();
        System.out.println("------------------------------------");
        car obj3=new omni();
        obj3.start();
        obj3.brake();
        obj3.fuel();

    }
}
