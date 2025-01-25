package java_for_beginners.Object_Oriented_Programming;
class xvalue{
    int x;
    public xvalue(){
        System.out.println("This is class for x...");
    }
    public xvalue(int x){
        this.x=x;
    }
    public int getx(){
        return this.x;
    }
}
class yvalue extends xvalue{
    int y;
    public yvalue(){
        System.out.println("This is class for y...");
    }
    public yvalue(int y, int x){
        super(x);
        this.y=y;
    }
    public int gety(){
        return this.y;
    }

}
class zvalue extends yvalue{
    int z;
    public zvalue(){
        System.out.println("This is class for z...");
    }
    public zvalue(int z, int y, int x){
        super(y,x);
        this.z=z;
    }
    public int getz(){
        return this.z;
    }

}
public class constructors_in_inheritance {
    public static void main(String[] args) {
        // zvalue obj=new zvalue();

        zvalue obj=new zvalue(12,13,14);
        System.out.println("z: "+obj.getz());
        System.out.println("y: "+obj.gety());
        System.out.println("x: "+obj.getx());


    }
}
