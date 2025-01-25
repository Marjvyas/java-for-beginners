package java_for_beginners.Object_Oriented_Programming;

import java.util.Scanner;
class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
}

public class employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        emp.name="Marj";
        emp.salary=999999999;
        System.out.println("Salary: "+emp.getsalary());
        System.out.println("Name: "+emp.getname());
    }
}
