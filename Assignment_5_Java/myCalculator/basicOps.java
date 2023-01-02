package mypackage.myCalculator;

public class basicOps {
    public void add(int x, int y){
        System.out.println("\nSum of a & b: " +(x+y));
    }

    public void subtract(int x, int y){
        System.out.println("Difference of a & b: "+Math.abs(x-y));
    }

    public void multiply(int x, int y){
        System.out.println("Product of a & b: "+(x*y));
    }

    public void divide(int x, int y){
        if(x>y)
            System.out.println("Quotient of a & b: "+(x/y));
        else
            System.out.println("Quotient of a & b: "+(y/x));
    }

    public void modulo(int x, int y){
        System.out.println("Modulo a & b: "+(x%y));
    }
}