package interfaces;
interface Telusko
{
    void show();
    // interface methods cannot have body if u want to write body then u should explicitly use default keyword
    default void disp()
    {
        System.out.println("Telusko is cmg up with fast track boot course");
    }
    // we can also have static method in interface , however static menthod of an interface must not be abstract , it
    // it must have implementation , and static method of an interface will not get inherited in implementing classes.
    static void announcement()
    {
        System.out.println("8 days fast track spring boot course is announced by telusko");
    }
}
class Alien implements Telusko
{
    @Override
    public void show()
    {
        System.out.println("Hello Aliens, Welcome back");
    }

    // it is not compulsory to override disp() , if need arises we can override
    public void disp()
    {
        System.out.println("Telusko is cmg up with fast track boot course");
    }
}




public class LaunchInterface4 {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.show();
        a.disp();

        Telusko.announcement();


    }
}
