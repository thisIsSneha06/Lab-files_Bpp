package com.company;
import java.util.*;
class Operations{
    float add(float a, float b) {return a+b;}
    float sub(float a, float b) {return a-b;}
    float mul(float a, float b) {return a*b;}
    float div(float a, float b) {return a/b;}
    float mod(float a, float b) {return a%b;}
}
public class Simple_Calculator {
    public static void main(String[] args) {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        Operations cal = new Operations();
        System.out.println("\tSIMPLE CALCULATOR");
        System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo\n6. Exit");
        Task:   //used label to perform continuous operations
        while(ch != 6){
            System.out.println("\nChoose an operation: ");
            ch = sc.nextInt();
            float a, b, ans;
            switch(ch){
                case 1:
                    System.out.println("Enter two operands: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    ans = cal.add(a,b);
                    System.out.println("The answer is: "+ans);
                    break;
                case 2:
                    System.out.println("Enter two operands: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    ans = cal.sub(a,b);
                    System.out.println("The answer is: "+ans);
                    break;
                case 3:
                    System.out.println("Enter two operands: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    ans = cal.mul(a,b);
                    System.out.println("The answer is: "+ans);
                    break;
                case 4:
                    System.out.println("Enter two operands: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    ans = cal.div(a,b);
                    System.out.println("The answer is: "+ans);
                    break;
                case 5:
                    System.out.println("Enter two operands: ");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    ans = cal.mod(a,b);
                    System.out.println("The answer is: "+ans);
                    break;
                case 6:
                    System.out.println("Exiting finish!!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            if(ch!=6)
                System.out.println("\nContinue performing operations ... \n");
                continue Task;
        }


    }
}
