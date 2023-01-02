package com.company;
import java.util.*;

public class Lab_Assignment_9_1{
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 60;
        marks[1] = 80;
        marks[2] = 90;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter array index: ");
            int index = sc.nextInt();
            System.out.println("Enter number to divide: ");
            int num = sc.nextInt();
            System.out.println("\nValue at array index: "+marks[index]);
            System.out.println("Value at array-value/number: "+marks[index]/num);
        }

        catch(ArithmeticException e){
            System.out.println("\nArithmeticException occured!");
            System.out.println(e);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }

        catch (InputMismatchException ie){
            System.out.println("\nThe number should be of type integer.\n"+ie);
        }

        catch(Exception e) {
            System.out.println("\nSome other exception occured!");
            System.out.println(e);
        }
    }
}

