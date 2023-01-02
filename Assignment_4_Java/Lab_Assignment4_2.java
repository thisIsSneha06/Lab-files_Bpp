package com.company;
import java.io.*;
import java.util.*;
public class Lab_Assignment4_2 {
    public static void main(String[] args) {
        char temp;
        System.out.println("All about StringBuffer class in Java\n");
        System.out.print("Enter a string to start with...\n=> ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        System.out.println("\nNow even if the length of the string is: " + sb.length() + ", its capacity is: " + sb.capacity()
                + "\nwhich is the total allocated space for the string.\n");
        sb.append("_hello");
        System.out.println("String after appending hello becomes: " + sb);
        System.out.println("\nYou can always increase the capacity by (oldcapacity*2)+2 ");
        System.out.print("Enter the new capacity: ");
        int cap = sc.nextInt();
        sb.ensureCapacity(cap);
        System.out.println("The new capacity of string is: " + sb.capacity());
        StringBuffer str2 = new StringBuffer("Welcome to Java.");
        System.out.println("\nOld length of str2: " + str2.length());
        str2.setLength(10);
        System.out.println("New str2 after setting length is: " + str2.toString() + " with length: " + str2.length());
        System.out.println();
        String str = new String("Java supports OOP. It is compiled-interpreted.");
        char[] ch = new char[40];
        try {
            str.getChars(0, 26, ch, 0);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println(e);
        }
        int index = sb.indexOf("hello");
        System.out.println("\nIndex of hello in first string: "+index);
        System.out.println("Inserting bonjour... Deleting hello... ");
        sb.delete(index, index+5);
        sb.insert(index, "bonjour");
        System.out.println("New string: "+sb);
        sb.setCharAt(6, 'S');
        System.out.println("\nAfter setting character at an index, new string: "+sb);
        sb.deleteCharAt(6);
        System.out.println("Deleted the new char added, now string: "+s);
    }
}
