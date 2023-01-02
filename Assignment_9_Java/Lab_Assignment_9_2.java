package com.company;
import java.util.Scanner;

class NegativeRadiusException extends Exception{    // user defined Exception
    @Override
    public String toString() {
        return "\nRadius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "\nRadius cannot be negative!\n";
    }
}

public class Lab_Assignment_9_2 {
    public static double area(int r) throws NegativeRadiusException{   // use of throws
        if (r<0){
            throw new NegativeRadiusException();      // use of throw
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter radius: ");
            int r = sc.nextInt();
            double ar = area(r);
            System.out.print("Area of circle: ");
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception!!"+e.getMessage());
        }

        // use of finally block
        int a = 9;
        int b = 3;
        while(true){
            try{
                System.out.println("a/b: "+a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("\nFinally the value of b is: "+b);
            }
            b--;
        }
        try{
            System.out.println("5/0: "+5/0);
        }

        finally{
            System.out.println("\nThis finally statement will be printed no matter what!!");
            System.out.println("Also try block here does not require catch block because finally block is used.\n");
        }
    }
}

