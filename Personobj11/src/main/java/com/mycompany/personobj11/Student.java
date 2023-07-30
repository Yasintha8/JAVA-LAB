package com.mycompany.personobj11;
public class Student extends Person
{
    private String Course;
    public Student(String name,int id)
    {
        super(name,id);
    }
    
    public void setCourse(String Course) 
    {
        this.Course = Course;
    }

    public String getCourse() 
    {
        return Course;
    }

}
