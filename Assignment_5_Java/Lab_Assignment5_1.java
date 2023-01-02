package mypackage;
import java.util.*;
import mypackage.myCalculator.basicOps;
import mypackage.myCalculator.advOps;
public class Lab_Assignment5_1 {
    public static void main(String[] args) {
        basicOps bs = new basicOps();
        advOps adv = new advOps();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        bs.add(a, b);            // Using methods from basic operations class in sub-package myCalculator of my_package package
        bs.subtract(a, b);
        bs.divide(a, b);
        bs.multiply(a, b);
        bs.modulo(a, b);
        System.out.print("\nEnter val for advanced operations: ");
        int val = sc.nextInt();
        adv.factorial(val);     // Using methods from advanced operation class in sub-package myCalculator of my_package package
        adv.log10(val);
        adv.loge(val);
        System.out.print("\nSine b: ");
        adv.sine(b);
        System.out.print("\n\nEnter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        System.out.println("\nFinding x power y...");
        adv.exponent(x, y);
    }
}
