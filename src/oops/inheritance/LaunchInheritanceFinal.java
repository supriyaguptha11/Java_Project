package oops.inheritance;
// final keyword can be applied to class but cannot participate in inheritance , it cannot be parent of any class

// final class Plane1
class Plane1
{
//     public final Plane1()      // final cannot be applied to constructor
//    {
//
//    }
   final int a = 10;
    final static int b = 20;          // final can be applied to static variable
    final public void fly()                    // final keyword can be applied to methods, it participate in inheritance also but cannot override
    {
        // a = 40;          // variables with final keyword cannot be changed
        System.out.println("Plane is flying");
    }
    final public static void fly1()                    // final keyword can be applied to static  methods
    {
        // a = 40;          // variables with final keyword cannot be changed
        System.out.println("Plane is flying");
    }

}
class FighterPlane1 extends Plane1
{
//    final public void fly()                   // if it final method then we cannot override it
//    {
//        System.out.println("Plane is flying");
//    }

}


public class LaunchInheritanceFinal {
    public static void main(String[] args) {
        FighterPlane1 fp = new FighterPlane1();
        fp.fly();

    }
}
