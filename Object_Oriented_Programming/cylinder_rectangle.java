package java_for_beginners.Object_Oriented_Programming;
class cylinder{
    private float r;
    private float h;
    public cylinder(float radius, float height){
        r=radius;
        h=height;
    }
    public void setradius(float radius){
        r=radius;
    }
    public void setheight(float height){
        h=height;
    }
    public float getheight(){
        return h;
    }
    public float getradius(){
        return r;
    }
    public float getsurfacearea(){
        return 2*(float)Math.PI*r*h+(float)Math.PI*r*r;
    }
    public float getvolume(){
        return (float)Math.PI*r*r*h;
    }

}

class rectangle{
    private float l;
    private float b;
    public rectangle(){
        l=5;
        b=5;
    }
    public rectangle(float length, float bredth){
        l=length;
        b=bredth;
    }
    public void setlength(float length){
        l=length;
    }
    public void setbredth(float bredth){
        b=bredth;
    }
    public float getlength(){
        return l;
    }
    public float getbredth(){
        return b;
    }
    public float getarea(){
        return l*b;
    }
    public float getperimeter(){
        return 2*(l+b);
    }

}
public class cylinder_rectangle {
    public static void main(String[] args) {
        cylinder c=new cylinder(1, 2);
        System.out.println("height: "+c.getheight());
        System.out.println("radius: "+c.getradius());
        System.out.println("surface area: "+c.getsurfacearea());
        System.out.println("volume: "+c.getvolume());
        
        rectangle r=new rectangle();
        System.out.println("height: "+r.getlength());
        System.out.println("radius: "+r.getbredth());
        System.out.println("surface area: "+r.getarea());
        System.out.println("volume: "+r.getperimeter());

    }
}
