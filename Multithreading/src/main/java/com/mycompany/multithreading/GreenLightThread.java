package com.mycompany.multithreading;

public class GreenLightThread extends Thread 
{
    public void run() 
    {
        try 
        {
            while (true) 
            {
                System.out.println("Green Light");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
