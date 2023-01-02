package mypackage.myCalculator;

public class advOps {
    public void factorial(int a){
        int i,fact=1;
        for(i=1; i<=a; i++){
            fact=fact*i;
        }
        System.out.printf("\nFactorial: %d",fact);
    }

    public void log10(int x){
        System.out.printf("\nLog base 10 val: %.2f",Math.log10(x));
    }

    public void loge(int x){
        System.out.printf("\nLog base e val: %.2f",Math.log(x));
    }
    
    public void sine(double a){
        double b = Math.toRadians(a);
        System.out.printf("%.2f",Math.sin(b));
    }

    public void exponent(double base, double exponent){
        System.out.printf("%.0f power %.0f: %.3f",base, exponent, Math.pow(base, exponent));
    }
}
