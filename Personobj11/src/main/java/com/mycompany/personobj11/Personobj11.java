package com.mycompany.personobj11;
public class Personobj11 
{

    public static void main(String[] args) 
    {
     Student s1 = new Student("Yasintha", 25);
     
        Lecturer L1 = new Lecturer("Chamikara", 36);
        s1.setCourse("programming");
        L1.setProgramme("Software");
        
        System.out.println("Name: " + s1.getname());
        System.out.println("ID : " + s1.getid());
        System.out.println("Course : " + s1.getCourse());
        
         
        System.out.println("Name: " + L1.getname());
        System.out.println("Id : " + L1.getid());
        System.out.println("Programme : " +L1.getProgramme());
    }

}

