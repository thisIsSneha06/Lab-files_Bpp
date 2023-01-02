package com.company;
abstract class Figure{        // abstract class
    abstract double area(float d1, float d2);
    abstract double volume(float d1, float d2);
}

class Cylinder extends Figure{   // child class 1 with 2 overridden methods
    @Override
    double area(float radius, float height) {
        return 2*Math.PI*radius*height;
    }

    @Override
    double volume(float radius, float height) {
        return Math.PI*Math.pow(radius, radius)*height;
    }
}

class Cone extends Figure{     // child class 2 with 2 overridden methods
    @Override
    double area(float radius, float height) {
        double slant = Math.sqrt(radius*radius + height*height);
        return Math.PI*radius*slant;
    }

    @Override
    double volume(float radius, float height) {
        return 0.33*Math.PI*radius*radius*height;
    }
}

public class Lab_Assignment_7_2 {
    public static void main(String[] args) {
        Figure cn = new Cone();     // dynamic method dispatch
        Figure cyl = new Cylinder();

        double Area_cone = cn.area(3, 5);
        double Volume_cone = cn.volume(4, 3);
        double Area_cylinder = cyl.area(3, 7);
        double Volume_cylinder = cyl.volume(2, 4);

        System.out.printf("Area of cone = %.2f", Area_cone);
        System.out.printf("\nVolume of cone = %.2f", Volume_cone);
        System.out.printf("\n\nArea of cylinder = %.2f", Area_cylinder);
        System.out.printf("\nVolume of cylinder = %.2f", Volume_cylinder);
    }
}

