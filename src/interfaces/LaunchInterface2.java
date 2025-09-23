package interfaces;

// Multiple interface also can be implemented
interface Calc1
{
    void add(int a, int b); // public abstract void add(int a, int b);
    void sub(int a, int b);

}
interface Calc2
{
    void mul(int a, int b); // public abstract void add(int a, int b);
    void div(int a, int b);

}
class Calculator
{
    public void disp()
    {
        System.out.println("Calculator class");
    }
}
// A class can extend another class also implement one or more interfaces at a time, in this case 1st it must extends a class then implements an interface.
// if required we can extend the class also but should be written 1st
//class MynCalc1 extends Calculator implements Calc1, Calc2

class MynCalc1 implements Calc1, Calc2
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
    public void mul(int a, int b)
    {
        int res = a+b;
        System.out.println("Result is " +res);
    }
    public void div(int a, int b)
    {
        int res = a-b;
        System.out.println("Result is " +res);
    }
}

class MynCalc2 implements Calc1, Calc2
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
    public void mul(int a, int b)
    {
        int res = a+b;
        System.out.println("Result is " +res);
    }
    public void div(int a, int b)
    {
        int res = a-b;
        System.out.println("Result is " +res);
    }

}
class MynCalc3 implements Calc1,Calc2
{
//    public void add(int a, int b) {
//        int n1 = a;
//        int n2 = b;
//        int res = n1 + n2;
//        System.out.println("Result is " + res);
//    }
//
//    public void sub(int a, int b) {
//        int n1 = a;
//        int n2 = b;
//        int res = n1 - n2;
//        System.out.println("Result is " + res);
//    }
public void add(int a, int b)
{
    if(a>0 && b>0)
    {
        int res = a + b;
        System.out.println("Res is " + res);
    }
    else
    {
        System.out.println("Let the number be non zero");
    }

}

public void sub(int a, int b)
    {
        if(a>0 && b>0)
        {
            int res = a - b;
            System.out.println("Res is " + res);
        }
        else
        {
            System.out.println("Let the number be non zero");
        }

    }
    public void mul(int a, int b) {
        if (a > 0 && b > 0) {
            System.out.println("Res is " + (a * b));
        } else {
            System.out.println("Let the number be non zero");
        }
    }

    public void div(int a, int b) {
        if (a > 0 && b > 0) {
            System.out.println("Res is " + (a / b));
        } else {
            System.out.println("Let the number be non zero");
        }
    }

}
//class Algebra
//{
//    public void cal(Calc c, int a, int b)
//    {
//        c.add(a,b);
//        c.sub(a,b);
//
//    }
//}
public class LaunchInterface2 {
    public static void main(String[] args) {
//       Calc calc1 = new MyCalc1();
//       calc1.add(4,44);
//       calc1.sub(4,44);
//
//        Calc calc2 = new MyCalc2();
//        calc2.add(4,5);
//        calc1.sub(4,5);

        MynCalc1 cal1 = new MynCalc1();
        cal1.add(5,7);
        cal1.sub(6,9);
        cal1.mul(7,2);
        cal1.div(5,3);


        MynCalc2 cal2 = new MynCalc2();
        cal1.add(5,7);
        cal1.sub(6,9);
        cal1.mul(7,2);
        cal1.div(5,3);

        MynCalc3 cal3 = new MynCalc3();
        cal1.add(5,7);
        cal1.sub(6,9);
        cal1.mul(7,2);
        cal1.div(5,3);



    }
}

