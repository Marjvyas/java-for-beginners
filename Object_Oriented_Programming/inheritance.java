package java_for_beginners.Object_Oriented_Programming;
class parent{
    int a;
    String b;
    public void seta(int a){
        this.a=a;
    }
    public void setb(String b){
        this.b=b;
    }
    public int geta(){
        return a;
    }
    public String getb(){
        return b;
    }
}
class child extends parent{
    int c;
    public void setc(int c){
        this.c=c;
    }
    public int getc(){
        return c;
    }
}
public class inheritance {
    public static void main(String[] args) {
        child obj=new child();
        obj.seta(12);
        obj.setb("marj");
        obj.setc(13);
        System.out.println(obj.geta());
        System.out.println(obj.getb());
        System.out.println(obj.getc());
    }
}
