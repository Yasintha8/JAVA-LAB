//Part 01

package com.mycompany.practical2;
public class Item 
{
    private int location;
    private String description;
    
    public Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    
    public void setlocation(int location)
    {
        location=location;
    }
    public int getlocation()
    {
        return location;
    }
    public void setdescription(String description)
    {
        description=description;
    }
    public String getdescription()
    {
        return description;
    }
    public void display()
    {
        System.out.println("Location is :"+location);
    }
    
}   
