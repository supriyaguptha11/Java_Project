package oops.launchstatic;

class Demo2{
    static int a,b;
    int x,y,z;
    static
    {
        a = 20;
        b = 30;
    }
    {                               //initialization block it executes before the constructor body executes,
                                     // whenever there is a constructor call

        x = 22;
        y = 33;
        z = 44;
        System.out.println("Java initialization or java body");
    }
    static void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
    void disp2()
    {
        System.out.println(a);                  // static variables can access in non-static method also bcz they have loaded in class loader subsystem
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}

public class LaunchStatic1 {
    public static void main(String[] args) {
        Demo2.disp();
        Demo2 d2 = new Demo2();
        d2.disp2();
    }
}
