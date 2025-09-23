package oops.inheritance;


// this(); of 2 arguments check for 2 arguments constructor & control goes there
class Alpha2
{
    int a, b;
    public Alpha2()
    {
        a = 10;
        b = 20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha2(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Param constructor of Alpha");
    }
}
class Beta2 extends Alpha2 {
    int x, y;

    public Beta2() {
        this(4,44);            // this(); with 2 arguments
        x = 2;
        y = 3;
        System.out.println("Beta zero param constructor");
    }

    public Beta2(int x, int y) {
        super(33, 44);                          //super(); with arguments to call parent class param constructor
        this.x = x;
        this.y = y;
        System.out.println("Param constructor of Beta");
    }

    public void disp() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

}
public class LaunchInheritance7 {
    public static void main(String[] args) {
//        Beta2 b = new Beta2(88,99);
//        b.disp();
        Beta2 b2 = new Beta2();
        b2.disp();
    }

}


