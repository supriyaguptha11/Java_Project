package interfaces;
// An interface cannot implement another interface
// An interface can extends another interface
//interface Demo1
//{
//    void disp();
//}
//interface Demo2 implements  Demo1
//{
//
//}

interface Demo1
{
   void disp();
   // inside an interface we can have variable
   float pi = 3.14f;  // public, static, final, float all these are there in behind the scene, float pi = 3.14f;
}
interface Demo2 extends  Demo1
{
    void show();
}
class Alpha implements Demo2
{
    public void disp()
    {
        System.out.println("Focus is the key");
    }
    public void show()
    {
        System.out.println("Focus is the key");
    }
}

public class LaunchInterface3 {
    public static void main(String[] args) {
        Demo1 d = new Alpha();
        d.disp();

        Demo2 d2 = new Alpha();
        d2.disp();
        d2.show();
        //Demo1.pi


    }
}
