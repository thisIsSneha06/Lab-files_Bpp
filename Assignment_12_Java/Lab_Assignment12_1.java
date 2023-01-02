package com.company;
class RunnableInterface implements Runnable
{
    Thread t;
    int i;
    RunnableInterface()     // constructor
    {
        t=new Thread(this,"Child Thread");
        System.out.println("Child Thread is: "+t);
        t.start();
    }
    public void run()
    {
        try
        {
            for(i=1;i<=10;i++)
            {
                System.out.println("Child Thread: "+i);
                t.sleep(300);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread is Interrupted" + e);
        }
    }
}

public class Lab_Assignment12_1 {
    public static void main(String args[])
    {
        new RunnableInterface();
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("\nMain Thread: "+i);
                Thread.sleep(800);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main Thread Interrupted! "+ e);
        }
    }
}