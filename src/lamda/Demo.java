package lamda;
// with  Anonymous inner class we can create object once and implement once , we cant reuse it.
class A
{
    public void show()
    {
        System.out.println("A in show");
    }
}
// to override A class we create other class , which extends A and overwrite it
// instead of creating another class we simply write this while creating object
// this works with abstract class, interface.

class B extends A{
    @Override
    public void show() {
        System.out.println("B in show");
    }
}


public class Demo {
    public static void main(String[] args) {
       // A obj = new B();
        A obj = new A(){
            @Override
            public void show() {                   // here it is called as Anonymous inner class
                System.out.println(" in new show");            }

            public void getData(){               // creating another method which is not in A class , but it won't print
                System.out.println("get data");
            }
        }; // here whatever override data/implementation we want to print we can simply here while creating object without creating another class and that extends parent class
        obj.show();


        // we can also create anonymous object also and call the method
        //     new B().show();

// if you would like to print getData() method then you must create another object and access it.

        new A(){                    // anonymous object creation
            public void show() {
                System.out.println(" in new show");            }

            public void getData(){
                System.out.println("get data");
            }
        }.getData();
    }
}
