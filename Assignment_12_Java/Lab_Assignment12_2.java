package com.company;
import java.lang.*;

class ThreadJoining extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
            try
            {
                Thread.sleep(100);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            }

            catch(Exception ex)
            {
                System.out.println("Exception has been caught" + ex);
            }
            System.out.println(i);
        }
    }
}

class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }
}

public class Lab_Assignment12_2 implements Runnable
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: "+ t.getName());
        System.out.println("Is Current thread Alive? "+ t.isAlive());
    }

    public static void main(String args[]) throws Exception
    {
        Thread t = new Thread(new Lab_Assignment12_2());
        t.start();
        t.join(100);
        System.out.println("\nJoining after 100"+" milliseconds: \n");
        System.out.println("Current thread: " +t.getName());
        System.out.println("Is Current thread Alive? " + t.isAlive());     // isAlive()

        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
        t1.start();
        try
        {
            System.out.println("\n\nCurrent Thread: "+ Thread.currentThread().getName());
            t1.join();          // join()
        }
        catch(Exception ex)
        {
            System.out.println("Exception has been caught" + ex);
        }
        t2.start();
        try
        {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has been caught" + ex);
        }
        t3.start();


        ThreadDemo T1 = new ThreadDemo();
        ThreadDemo T2 = new ThreadDemo();
        ThreadDemo T3 = new ThreadDemo();
        System.out.println("\n\nThread priorities before setting...\n");
        System.out.println("Thread T1 priority : " + T1.getPriority());    // getPriority()
        System.out.println("Thread T2 priority : " + T2.getPriority());
        System.out.println("Thread T3 priority : " + T3.getPriority());
        T1.setPriority(2);      // setPriority()
        T2.setPriority(5);
        T3.setPriority(8);
        System.out.println("\nThread priorities after setting...\n");
        System.out.println("Thread T1 priority : " + T1.getPriority());
        System.out.println("Thread T2 priority : " + T2.getPriority());
        System.out.println("Thread T3 priority : " + T3.getPriority());
        System.out.println("\nCurrently Executing Thread : " + Thread.currentThread().getName());
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
    }
}

