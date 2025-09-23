package interfaces;

// All the methods are public and abstract in interface
interface Calc
{
    void add(int a, int b); // public abstract void add(int a, int b);
    void sub(int a, int b);

}
class MyCalc1 implements Calc
{
    public void add(int a, int b)
    {
        int res = a+b;
        System.out.println("Result is " +res);
    }
    public void sub(int a, int b)
    {
        int res = a-b;
        System.out.println("Result is " +res);
    }
}

class MyCalc2 implements Calc
{
    public void add(int a, int b)
    {
       int n1 = a;
       int n2 = b;
       int res = n1 + n2;
       System.out.println("Result is " +res);
    }
    public void sub(int a, int b)
    {
        int n1 = a;
        int n2 = b;
        int res = n1 - n2;
        System.out.println("Result is " +res);
    }

}
class MyCalc3 implements Calc {
    public void add(int a, int b) {
        int n1 = a;
        int n2 = b;
        int res = n1 + n2;
        System.out.println("Result is " + res);
    }

    public void sub(int a, int b) {
        int n1 = a;
        int n2 = b;
        int res = n1 - n2;
        System.out.println("Result is " + res);
    }
}
class Algebra
{
    public void cal(Calc c, int a, int b)
    {
        c.add(a,b);
        c.sub(a,b);

    }
}
public class LaunchInterface {
    public static void main(String[] args) {
//       Calc calc1 = new MyCalc1();
//       calc1.add(4,44);
//       calc1.sub(4,44);
//
//        Calc calc2 = new MyCalc2();
//        calc2.add(4,5);
//        calc1.sub(4,5);

        MyCalc1 cal1 = new MyCalc1();

        MyCalc2 cal2 = new MyCalc2();

       MyCalc3 cal3 = new MyCalc3();

        Algebra a = new Algebra();
        a.cal(cal1,3,5);
        a.cal(cal2,10,7);
        a.cal(cal3,10,5);


    }
}
