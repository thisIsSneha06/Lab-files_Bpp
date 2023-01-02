package com.company;
import java.io.*;
class A extends Thread    // table of 2
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(2 + " x "+ i + " = "+(i*2));
            try {
                A.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nThread 1 has been executed successfully!");
    }
}
class B extends Thread    // table of 5
{
    public void run()
    {
        for (int j = 1; j <= 10; j++)
        {
            System.out.println(5 + " x " + j + " = " +(j*5));
            try {
                B.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nThread 2 has been executed successfully!");
    }
}
class C extends Thread    // table of 10
{
    public void run()
    {
        for (int k = 1; k <= 10; k++)
        {
            System.out.println(10 + " x " + k + " = " +(k*10));
            try {
                C.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nThread 3 has been executed successfully!");
    }
}
public class Lab_Assignment_11{
    public static void main(String args[])throws IOException{
        A T1 = new A();
        B T2 = new B();
        C T3 = new C();

        // setPriority()
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.setPriority(5);
        T3.setPriority(9);

        //getPriority()
        System.out.println("\nThread 1 priority = "+T1.getPriority());
        System.out.println("\nThread 2 priority = "+T2.getPriority());
        System.out.println("\nThread 3 priority = "+T3.getPriority());

        //join()
        try
        {
            System.out.println("Current Thread: " + Thread.currentThread().getName() + "\n");
            T1.join();
        }

        catch(Exception ex)
        {
            System.out.println("Exception! " + ex);
        }

        T1.start();
        //isAlive()
        if(T1.isAlive())
            System.out.println("Thread 1 is running...");

        T2.start();
        if(T2.isAlive())
            System.out.println("\nThread 2 is running...");

        T3.start();
        if(T3.isAlive())
            System.out.println("\nThread 3 is running...");
    }
}
