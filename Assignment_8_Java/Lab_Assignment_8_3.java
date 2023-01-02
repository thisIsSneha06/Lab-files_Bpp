package com.company;

public class Lab_Assignment_8_3 {
    public static void main(String[] args) {
        int i = 100;     // primitive type
        Integer i_obj1 = Integer.valueOf(i);    // creating Wrapper class object manually
        System.out.println("Before Autoboxing, obj1 of int i = "+i_obj1);
        Integer i_obj2 = i;           // Autoboxing
        System.out.println("After Autoboxing, obj1 + obj2 = "+(i_obj1+i_obj2));   // 100 + 100

        Integer i_obj = new Integer(100);
        System.out.println("\nBefore Unboxing from Integer type Wrapper to primitive int i = "+i);
        i = i_obj.intValue();          // Unboxing
        int j = i_obj;
        System.out.println("After Unboxing i_obj to primitive int j, i+j = "+(i+j));
    }
}
