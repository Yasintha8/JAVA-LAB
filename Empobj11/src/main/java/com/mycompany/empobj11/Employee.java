package com.mycompany.empobj11;
public class Employee 
{
      private int empID;
    private String empName;
    private String empDesignation;
    
    //setters and getters
    
    public void setempID(int empID)
    {
        this.empID=empID;
    }
    public int getempID()
    {
        return empID;
    }
    
    public void setempName(String empName)
    {
        this.empName=empName;
    }
    public String getempName()
    {
        return empName;
    }
    
    public void setempDesignation(String  empDesignation)
    {
        this.empDesignation= empDesignation;
    }
    public String getempDesignation()
    {
        return  empDesignation;
    }

}
