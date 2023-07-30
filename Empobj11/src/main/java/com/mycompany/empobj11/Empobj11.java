package com.mycompany.empobj11;
public class Empobj11 {

    public static void main(String[] args) 
    {
        Employee e1=new Employee();
        Employee e2=new Employee();
        
        e1.setempID(5);
        e1.setempName("Mr.Bogdan");
        e1.setempDesignation("Matara");
         
         System.out.println();
        
        System.out.println("Employee ID :"+e1.getempID());
        System.out.println("Employee Name :"+e1.getempName());
        System.out.println("Employee Designation :"+e1.getempDesignation());
        
        
        e2.setempID(10);
        e2.setempName("Ms.Bird ");
        e2.setempDesignation("Colombo");
        
        System.out.println("Employee ID :"+e2.getempID());
        System.out.println("Employee Name :"+e2.getempName());
        System.out.println("Employee Designation :"+e2.getempDesignation());
    }
 }
