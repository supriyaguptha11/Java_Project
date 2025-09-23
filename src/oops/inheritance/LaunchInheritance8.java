package oops.inheritance;

class Parent
{
    int i= 10;
    void disp()
    {
        System.out.println("Disp of Parent");
    }
}

class Child extends Parent
{
    int i = 100;
    void alpha()
    {
        System.out.println("alpha");
        System.out.println(i);
        System.out.println(super.i);
        super.disp();
    }
    void disp()
    {
        System.out.println("Disp of child");
    }
}



public class LaunchInheritance8 {
    public static void main(String[] args) {
        Child c = new Child();
        c.alpha();
        //c.disp();
//        new Child().alpha();      // plan of calling only one task instead of object creation like Child c = new Child();  c.alpha();
//        new Child().disp();
    }
}
