package oops.launchstatic;

class Alien
{
    static
    {
        System.out.println("static block1");
    }
    static
    {
        System.out.println("static block2");
    }

    {
        System.out.println("non static, java initialization1");
    }
    {
        System.out.println("non static, java initialization1");
    }


//    static void show() {
//        System.out.println("Static method");
//    }
}


public class MultipleStaticAndJavaBody {
    public static void main(String[] args) {
        Alien a1 = new Alien();
       // Alien a2 = new Alien();        // if we use this static is called once and java initialization 2 times bcz it is called everytime when constructor is called.

//        Alien.show();
    }
}
