package java_for_beginners.Object_Oriented_Programming;
class One{
    public void oneMethod(){
        System.out.println(
            "This is class one."
        );
    }
}
class Two extends One{
    @Override
    public void oneMethod(){
        
        System.out.println(
            "This is class two."
        );
    }
}
public class method_overriding {
    public static void main(String[] args) {
        Two obj=new Two();
        obj.oneMethod();
    }
}
