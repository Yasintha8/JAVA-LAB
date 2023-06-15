package com.mycompany.shapeobj1;
public class Circle extends Shape
{
    private float radius;
    
    public Circle(float radius)
    {
        this.radius=radius;
    }
    
    @Override
   
    public float CalculateArea()
    {
        Area=(float)(Math.PI * radius * radius);
        return Area;
    }
}
