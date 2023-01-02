package com.company;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Lab_assignment_3
{
    static class myEmployee
    {
        int id,salary;
        static int c=1;
        String name, designation;

        static int emp_count = 0;  // static instance field emp_count
        public static int getEmp_count() { //accessor method for emp_count
            return emp_count;
        }

        myEmployee(String name) //Freshers
        {
            emp_count++;
            id=c+200;
            c++;
            this.name = name;
            designation="Fresher";
            salary=10000;
        }
        myEmployee(String name,int salary,String designation) //Executive
        {
            emp_count++;
            this.name = name;
            id=c+500;
            c++;
            this.designation=designation;
            this.name = name;
            this.salary=salary;
        }

        myEmployee(){  //Temporary member // Default constructor
            emp_count++;
            id=c+100;
            c++;
            name = "XYZ";
            designation="Temporary";
            salary=15000;
        }

        public static void swap(int s1, int s2){   //example of a static method in Employee class
            int temp = s1;
            s1 = s2;
            s2 = temp;
            System.out.printf("After swapping: Emp1 Salary = %d, Emp2 Salary = %d",s1, s2);
        }

        public static myEmployee salaryComp(myEmployee a, myEmployee b){  // comparing 2 employees' salaries
            if(a.salary >= b.salary)
                return a;
            else
                return b;
        }

        //Two overloading methods named print
        void print(){
            System.out.println("\nThe employee name is: " + this.name);
            System.out.println("The employee id is: " + this.id);
            System.out.println("The employee salary is: " + this.salary);
            System.out.println("The employee designation is: " + this.designation);
        }

        void print(String name){
            System.out.println("The employee id is: " + this.id);
            System.out.println("The employee salary is: " + this.salary);
            System.out.println("The employee designation is: " + this.designation);
        }
    }


    public static void main(String[] args)
    {
        Lab_assignment_3.myEmployee emp[] = new Lab_assignment_3.myEmployee[4];
        emp[0]=new Lab_assignment_3.myEmployee("ABC");
        emp[1]=new Lab_assignment_3.myEmployee("Sneha",75000,"Executive");
        emp[2]=new Lab_assignment_3.myEmployee();
        emp[3] = new Lab_assignment_3.myEmployee("Shubham", 80000, "Manager");
        System.out.println("Assignment 3 \nSolution 1)\n");
        System.out.println("Here are the Employee details are: ");
        emp[0].print();
        emp[1].print();
        emp[2].print();
        emp[3].print();
        System.out.println("\nTotal count of employees: " + myEmployee.getEmp_count());
        System.out.println("\nComparing 2 employees on the basis of their salary... ");
        myEmployee comp = myEmployee.salaryComp(emp[1], emp[3]); //comparing salaries of employee 2 & 4
        System.out.println("The employee with a higher salary is: "+comp.name);
        System.out.println("\nDetails of the employee: ");
        comp.print(comp.name);
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("Solution 2)\n");
        System.out.println("'Java uses Pass by Value to pass parameters to a function.'");
        System.out.println("Writing a swap function to swap salaries of two employees...");
        System.out.println("\nBefore swapping: Emp1 Salary = "+emp[1].salary+", Emp2 Salary = "+emp[3].salary);
        myEmployee.swap(emp[1].salary, emp[3].salary); //pass by value

    }

}
