package java_for_beginners.Object_Oriented_Programming.access_modifiers;
class Employee_details{
    private int id;
    private String name;
    public void setid(int i){
        id=i;
    }
    public void setname(String n){
        name=n;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
}
public class private_modifier {
    public static void main(String[] args) {
        //We cannot access the value directly because of private modifier...
        Employee_details emp=new Employee_details();
        emp.setid(1234);
        emp.setname("Marj Vyas");
        System.out.println("My id is: "+emp.getid());
        System.out.println("My name is: "+emp.getname());
    }
}
