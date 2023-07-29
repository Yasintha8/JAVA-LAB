package com.mycompany.employeeobj;
public class Employeeobj 
{

    public static void main(String[] args) 
    {
       Employee e1=new Employee();
       e1.setempName("yasintha");
       e1.setempAge(22);
       e1.setempSalary(3000000.00f);
       
        System.out.println("Employee name is: "+e1.getempName());
        System.out.println("Employee age is: "+e1.getempAge());
        System.out.println("Employee salary is: "+e1.getempSalary());
       
    }
}
