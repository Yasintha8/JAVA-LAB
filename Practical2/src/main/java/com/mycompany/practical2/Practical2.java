package com.mycompany.practical2;
public class Practical2 
{

    public static void main(String[] args) 
    {
        Item obj=new Item(4056,"walasmulla");
        obj.setlocation(2596);
        obj.setdescription("Matara");
         
       obj.display();
        
        System.out.println("Location :"+obj.getlocation());
        System.out.println("Item Description: " +obj.getdescription());
        
        Monster obj1=new Monster(10,"Town");
        obj1.setlocation(58);
        obj1.setdescription("Shop");

        System.out.println("Monster Location :"+obj1.getlocation());
        System.out.println("Monster Description: " +obj1.getdescription());
    }
}

      //part 2



