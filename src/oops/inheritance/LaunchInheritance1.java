package oops.inheritance;


class Telusko {
    int age;

    void disp()
    {
        age = 10;
        System.out.println("Telusko is "+ age + " year old");
    }
}
class Alien extends Telusko
{
                                  // Here im not writing anything and using this class object creation
                                  // i can execute the properties of Telusko class because of Extends keyword

}




public class LaunchInheritance1 {
    public static void main(String[] args) {
//        Telusko t = new Telusko();
//        t.disp();
        Alien a = new Alien();
        a.disp();

    }
}
