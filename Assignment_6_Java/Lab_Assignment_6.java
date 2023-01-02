package com.company;
class Shape{
    float dim1, dim2;
    public Shape(float r) {
        this.dim1 = r;
    }

    public Shape(float l, float b) {         // at most 2 dimensions
        this.dim1 = l;
        this.dim2 = b;
    }

    public double area(){
        System.out.println("This is the base class Shape");
        return 0;
    }

    public final void display(){                    // final method for displaying area
        System.out.printf("%.2f",this.area());
    }
}

class Circle extends Shape{  // subclass Circle
    Circle(float r){
        super(r);           // super method for fetching radius
    }
    @Override               // overriding method area
    public double area() {
        return Math.PI*dim1*dim1;
    }

}
class Rectangle extends Shape{  // subclass Rectangle
    Rectangle(float l, float b){
        super(l, b);
        // super method for fetching length & breadth
    }
    @Override               // overriding method area
    public double area() {
        return dim1*dim2;
    }
}

public class Lab_Assignment_6{
    public static void main(String[] args) {
        Shape r = new Rectangle(3, 5);
        Shape c = new Circle(5);
        System.out.print("Area of Rectangle: ");
        r.display();                     // Dynamic method dispatch
        System.out.print("\nArea of Circle: ");
        c.display();                     // Dynamic method dispatch
    }
}
