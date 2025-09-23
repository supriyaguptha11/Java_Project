package oops.inheritance;


// to print param constructor of parent class we write super()explicilty with arguments as super(1,2) in child class
// so that control goes there instead of zero param constructor
class Alpha1
{
    int a, b;
    public Alpha1()
    {
        a = 10;
        b = 20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha1(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Param constructor of Alpha");
    }
}
class Beta1 extends Alpha1 {
    int x, y;

    public Beta1() {
        x = 2;
        y = 3;
        System.out.println("Beta zero param constructor");
    }

    public Beta1(int x, int y) {
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
public class LaunchInheritance6 {
    public static void main(String[] args) {
        Beta1 b = new Beta1(88,99);
        b.disp();
    }

    }

