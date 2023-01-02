package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_Assignment_8_1 {
    int n = 5;
    class Student {     // class Student with Student details
        int roll;
        String name;
        String dept;
        int marks;

        Student(int roll, String name, int marks, String dept) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.dept = dept;
        }
    }

    public static void main(String args[]) {
        System.out.println("Details of students are as follows:");
        System.out.println("Order => Roll Name Dept Marks\n");

        int roll[] = {11, 45, 32, 90, 54};
        String name[] = {"Shubham", "Mohit", "Ayushi", "Aman", "Sneha"};
        int marks[] = {93, 95, 83, 74, 90};
        String dept[] = {"CSE", "EE", "ECE", "IT", "CSE"};

        Lab_Assignment_8_1 custom = new Lab_Assignment_8_1();
        custom.addValues(roll, name, marks, dept);
    }

    public void addValues(int roll[], String name[], int marks[], String dept[]) {
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Integer> Marks = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            Marks.add(marks[i]);
            sum += marks[i];
        }
        int max = Collections.max(Marks);
        int min = Collections.min(Marks);
        int avg = sum / n;

        for (int i = 0; i < n; i++) {
            list.add(new Student(roll[i], name[i], marks[i], dept[i]));
        }
        printDetails(list);
        System.out.println("\nAverage marks of the students: " + avg);
        printMarks(list, max, min, avg);
    }

    public void printDetails(ArrayList<Student> list) {
        for (int i = 0; i < n; i++) {
            Student data = list.get(i);
            System.out.println(data.roll + "  " + data.name + "  " + data.dept + "  " + data.marks);
        }
    }

    public void printMarks(ArrayList<Student> list, int max, int min, int avg) {
        Integer[] Avg = new Integer[n];
        String Name_avg[] = new String[n];
        for (int i = 0; i < n; i++) {
            Student data = list.get(i);
            int m = data.marks;

            if (m == max)
                System.out.println("\n1) Maximum marks: " + data.marks + "  Scored by: " + data.name);
            if (m == min)
                System.out.println("2) Minimum marks: " + data.marks + "  Scored by: " + data.name);
            if (m > avg) {
                Name_avg[i] = data.name;
                Avg[i] = data.marks;
            }
        }

        System.out.println("3) More than average marks has been scored by: ");
        for(int j = 0; j< Avg.length; j++){
            if(Avg[j] != null)
                System.out.println("\t=> "+Name_avg[j]+" | Score: "+Avg[j]);
        }
    }
}

