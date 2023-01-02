package mypackage.AccessModifier;

class A2{
    protected void msg()
    {System.out.println("Hello");}
}

public class protected_1 {
    public static void main(String args[]){
        A2 obj = new A2 ();
        obj.msg();
    }
}
