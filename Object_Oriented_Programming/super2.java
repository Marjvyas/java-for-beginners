package java_for_beginners.Object_Oriented_Programming;
class parent2{
    int a;
    public parent2(int a1){
        System.out.println("Hey this is parent class.");
        a=a1;
    }
}
class child2 extends parent2{
    public child2(int a1){
        super(a1);
        System.out.println("This is child class");
    }
    public void change(){
        System.out.println(a);
    }

}
public class super2 {
    public static void main(String[] args) {
        child2 obj=new child2(12);
        obj.change();
    }
}
