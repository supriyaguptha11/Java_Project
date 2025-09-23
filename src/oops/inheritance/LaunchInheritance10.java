package oops.inheritance;

// Static method can be inherited but cannot be override
class Demo4
{
    static int a;
    public static void disp()
    {
        a = 10;
        System.out.println(a + " Parent class disp ");
    }

}
class Demo5 extends Demo4
{
    public static void disp()
    {
        a = 10;
        System.out.println(a + " Child class disp ");
    }
}


public class LaunchInheritance10 {
    public static void main(String[] args) {
        Demo4 d = new Demo5();
        d.disp();
        //Demo4.disp();

        Demo5 d2 = new Demo5();
        d2.disp();
        //Demo5.disp();



    }
}
