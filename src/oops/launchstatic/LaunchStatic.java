package oops.launchstatic;

class Demo1 {
    static int a, b, c;                   // static variables
    int x, y, z;                          // instance variables

    static {                               //static method
        a = 20;
        b = 30;
        c = 40;
    }
    void nonstatic()
    {
        x = 22;
        y = 33;
        z = 44;
    }
   static void disp()
    {
        System.out.println("static variables ");
        System.out.println( "a " + a);
        System.out.println( "b " + b);
        System.out.println( "c " + c);

    }
    void disp2()
    {
        System.out.println("non static variables ");
        System.out.println( "x " + x);
        System.out.println( "r " + y);
        System.out.println( "z " + z);

    }
    Demo1()
    {

    }

}

public class LaunchStatic {
    public static void main(String[] args) {
        Demo1.disp();
        Demo1 d1 = new Demo1();
        d1.nonstatic();                                  // to call nonstatic() method which initialized x,y,z
        d1.disp2();


    }

}
