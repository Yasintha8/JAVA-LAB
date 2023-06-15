package com.mycompany.shapeobj1;
public class Rectangle extends Shape
{
    private float length;
    private float width;

    public Rectangle(float length,float width)
    {
        this.length=length;
        this.width=width;
    }

    @Override
     public float CalculateArea()
     {
         Area=length*width;
         return Area;
     }
         
}
