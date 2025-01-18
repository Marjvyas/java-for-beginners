package java_for_beginners.Object_Oriented_Programming.basics;
class Mobile{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void call(){
        System.out.println("Calling...");
    }
}
public class cellphone {
    public static void main(String[] args) {
        Mobile mb=new Mobile();
        mb.ring();
        mb.vibrate();
        mb.call();
    }
}
