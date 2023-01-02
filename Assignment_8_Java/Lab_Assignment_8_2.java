package com.company;
import java.sql.SQLOutput;
import java.util.*;
class Student implements Comparable<Student>{        // Sorting using Comparable
    int roll;
    String name;
    String dept;
    int marks;
    Student(int roll, String name, String dept, int marks){
        this.roll=roll;
        this.name=name;
        this.dept=dept;
        this.marks=marks;
    }

    public int compareTo(Student st){     // Sort by Roll number
        if(roll==st.roll)
            return 0;
        else if(roll>st.roll)
            return 1;
        else
            return -1;
    }
}

class RollComparator implements Comparator<Student>{     // Sorting using Comparator
    public int compare(Student s1,Student s2){          // Sort by Roll number
        if(s1.roll==s2.roll)
            return 0;
        else if(s1.roll>s2.roll)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<Student>{     // Sorting using Comparator
    public int compare(Student s1,Student s2){          // Sort by Name
        return s1.name.compareTo(s2.name);
    }
}

class MarksComparator implements Comparator<Student>{     // Sorting using Comparator
    public int compare(Student s1,Student s2){           // Sort by Marks obtained
        if(s1.marks==s2.marks)
            return 0;
        else if(s1.marks>s2.marks)
            return 1;
        else
            return -1;
    }
}

public class Lab_Assignment_8_2{
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(11, "Shubham", "CSE", 93));
        al.add(new Student(45, "Mohit", "EE", 95));
        al.add(new Student(32, "Ayushi", "ECE", 83));
        al.add(new Student(90, "Aman", "IT", 74));
        al.add(new Student(54, "Sneha", "CSE", 90));

        Collections.sort(al);
        System.out.println("\n1) Sorting Algorithm using Comparable:\n");
        System.out.println("\tSorting by Roll Number...\n");
        for(Student st:al){
            System.out.println("\t-> " +st.roll+"  "+st.name+"  "+st.dept+"  "+st.marks);
        }

        System.out.println("\n2) Sorting Algorithm using Comparator: ");
        System.out.println("\n\ta) Sorting by Roll number... \n");
        Collections.sort(al,new RollComparator());
        for(Student st: al){
            System.out.println("\t-> " +st.roll+"  "+st.name+"  "+st.dept+"  "+st.marks);
        }

        System.out.println("\n\tb) Sorting by Name... \n");
        Collections.sort(al,new NameComparator());
        for(Student st: al){
            System.out.println("\t-> " +st.roll+"  "+st.name+"  "+st.dept+"  "+st.marks);
        }

        System.out.println("\n\tc) Sorting by Marks obtained... \n");
        Collections.sort(al,new MarksComparator());
        for(Student st: al){
            System.out.println("\t-> " +st.roll+"  "+st.name+"  "+st.dept+"  "+st.marks);
        }
    }
}