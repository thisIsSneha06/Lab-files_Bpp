package com.company;
import java.io.*;
import java.util.*;
public class Lab_Assignment4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String p = sc.next();
        System.out.println("Re-enter password: ");
        String cp = sc.next();
        if(p.equalsIgnoreCase(cp))     //equalsIgnoreCase()
            System.out.println("Login successful!");
        else
            System.out.println("Incorrect password");
        System.out.println("Enter username: ");
        String user = sc.next();
        String[] substrings = user.split("");
        for(int i=0; i<user.length();i++){   // length()
            System.out.println("Char at "+i+" is: "+user.charAt(i));   //charAt()
        }

        System.out.println("\nAdding '_Bppimt' after username...");
        String user2 = user.concat("_Bppimt");
        System.out.println("New username: "+user2);   //concat()
        if(user.isEmpty())    //isEmpty()
            System.out.println("Username is empty.");
        else
            System.out.println("Username not empty.");

        System.out.println("\nNew username has "+user2.compareTo(user)+" characters more than old username.");   //compareTo()
        int index1 = user2.indexOf("_");           //indexAt()
        int index2 = user2.indexOf("t");
        System.out.println("Concatenated substring was found at index: "+index1+" or position: "+(index1+1)+" of new username.");
        System.out.println("The substring was: "+user2.substring(index1, index2+1));      //substring()
        String s1 = "\nWELCOME TO JAVA "+user2+" !!";
        char[] ch=s1.toCharArray();      //toCharArray()
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }

        System.out.println("\nEnter your name: ");
        String name = sc.next();
        System.out.println("Your name: "+ name.toUpperCase());
        System.out.println("Enter email id: ");
        String email = sc.next();
        int len = email.length();
        System.out.println("Your email: "+email.toLowerCase()+" consists of "+String.valueOf(len)+" characters.");

    }
}
