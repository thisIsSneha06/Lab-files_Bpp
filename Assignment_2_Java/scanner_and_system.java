package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class scanner_and_system {
    public static void main(String[] args) {
        //Scanner class
        Scanner sc = new Scanner(System.in);
        //System class
        System.out.print("Enter you name: ");
        String name = sc.next();
        System.out.print("Enter your roll no.: ");
        long roll = sc.nextLong();
        System.out.print("Enter your grade: ");
        char grade = sc.next().charAt(0);
        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();
        System.out.println("\nPrinting student details...");
        System.out.printf("\nName: %s\nRoll number: %d\nGrade: %c\nCGPA: %.2f",name,roll,grade,cgpa);
    }
}
