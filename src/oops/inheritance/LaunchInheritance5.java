package oops.inheritance;

class Alpha
{
    int a, b;
    public Alpha()
    {
        a = 10;
        b = 20;
        System.out.println("Alpha zero param constructor");
    }
    public Alpha(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Param constructor of Alpha");
    }
}
class Beta extends Alpha
{
    int x, y;
    public Beta()
    {
        x = 2;
        y = 3;
        System.out.println("Beta zero param constructor");
    }
    public Beta(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("Param constructor of Beta");
    }

    public void disp()
    {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }

}

public class LaunchInheritance5 {
    public static void main(String[] args) {
        Beta b = new Beta();
        b.disp();
//        Beta b1 = new Beta(40,50);
//        b1.disp();

    }
}
