package com.company;
import java.util.*;
public class Lab_Assignment4_3 {
    //The mutable objects are objects whose value can be changed after initialization.
    // We can change the object's values, such as field and states, after the object is created. For example, Java.util.Date, StringBuilder, StringBuffer, etc.

    //Creating mutable class
    private String s;
    Lab_Assignment4_3(String s) {
        this.s = s;
    }
    public String getName() {
        return s;
    }
    public void setName(String coursename) {
        this.s = coursename;
    }

    //Creating Immutable class
//    Lab_Assignment4_3(final String s) {
//        this.s = s;
//    }
//    public final String getName() {
//        return s;
//    }

    public static void main(String[] args) {
        Lab_Assignment4_3 obj = new Lab_Assignment4_3("ExampleString");
        System.out.println("This is mutable.");
        System.out.println(obj.getName());
        obj.setName("Java Training");
        System.out.println(obj.getName());

        // Uncomment the codes and comment out the previous ones to stop errors as the constructors used in both cases are same
        // and due to shortage of time my brain can't figure out to undo this thing.

//        Lab_Assignment4_3 obj = new Lab_Assignment4_3("Example2_String");
//        System.out.println("This is immutable.");
//        System.out.println(obj.getName());
    }
}

