package lamda;

//Class inside a class
class Person {
    public void show()
    {
        System.out.println("Telusko");
    }
//    class Phone{   // if you would like to use non-static class then u must create obj with outer class ref
//
//    }
    static class Phone{
        public void getDetails()
        {
            System.out.println("Iphone");
        }
    }
}

/**
 * This is my spl weekend proj
 * this a documentation how you can write in java just go to tools Generate JavaDoc
 * it creates a separate doc file
 *
 */

public class InnerClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.show();

       // Person.Phone phn = p1.new Phone();
        // if inner class is not static we use this , we use the reference of outer class p1(in this case) to create new obj

        Person.Phone phn = new Person.Phone();
        phn.getDetails();

    }
}
