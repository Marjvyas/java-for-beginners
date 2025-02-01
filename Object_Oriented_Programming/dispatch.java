package java_for_beginners.Object_Oriented_Programming;
class Phone{
    public void phone1(){
        System.out.println("This is phone...");
    }
    public void ring(){
        System.out.println("phone is ringing...");
    }
}
class SmartPhone extends Phone{
    public void smartphone1(){
        System.out.println("This is smartphone...");
    }
    @Override
    public void ring(){
        System.out.println("smartphone is ringing...");
    }
}
public class dispatch {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        obj.ring();
        //obj.smartphone(); //not allowed...
    }
}
