package java_for_beginners.Object_Oriented_Programming.basics;
class Employee_details{
    private int id;
    private String name;
    public Employee_details(){
        id=1234;
        name="Marj";
    }
    public Employee_details(int i){
        id=i;
        name="Ritesh";
    }
    public Employee_details(int i, String n){
        id=i;
        name=n;
    }
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
public class constructor {

    public static void main(String[] args) {
        // Employee_details emp=new Employee_details();
        // System.out.println(emp.getid());
        // System.out.println(emp.getname());

        // Employee_details emp=new Employee_details(123);
        // System.out.println(emp.getid());
        // System.out.println(emp.getname());

        Employee_details emp=new Employee_details(123,"Narendra");
        System.out.println(emp.getid());
        System.out.println(emp.getname());
    }
}
