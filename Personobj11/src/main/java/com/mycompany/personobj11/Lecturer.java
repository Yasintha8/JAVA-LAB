package com.mycompany.personobj11;
public class Lecturer extends Person
{
   private String programme;
   
   public Lecturer(String name,int id)
   {
       super(name,id);
   }

    public void setProgramme(String programme) 
    {
        this.programme = programme;
    }

    public String getProgramme() 
    {
        return programme;
    }
   
}
