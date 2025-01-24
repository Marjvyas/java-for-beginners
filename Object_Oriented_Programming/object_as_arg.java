package java_for_beginners.Object_Oriented_Programming;
class employee{
    int id1;
    String name1;
    int salary1;
    public employee(int id, String name, int salary){
        id1=id;
        name1=name;
        salary1=salary;
    }
    public employee compare(employee obj){
        if(this.id1>obj.id1){
            return this;
        }
        else if(this.id1<obj.id1){
            return obj;
        }
        else{
            return null;
        }
    }
}

class compare{
    
}
public class object_as_arg {
    public static void main(String[] args) {
        employee emp1=new employee(1234, "marj", 999);
        employee emp2=new employee(123, "marj vyas", 9990);
        employee emp3=emp1.compare(emp2);
        System.out.println("Object having greater id:");
        System.out.println(emp3.id1);
        System.out.println(emp3.name1);
        System.out.println(emp3.salary1);
    }
}
