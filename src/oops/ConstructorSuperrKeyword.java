
// using super(); method
// super(); method is used to call parent class constructor.
// In multiple constructors, if you mentioned super(); method in the 1st constructor the other constructors also come under
// super(); method only, no need to mentioned explicitly.       same for this() also
// if you want to use this() for 2nd or 3rd constructors, (staying super() in 1st) then u have mention explicitly.

package oops;
class Demo {
    int num1, num2;

    Demo() {
        super();
        System.out.println("Zero param constructor");
    }

    Demo(int num1, int num2) {
        this(num1);               // used to calling another constructor from within the same class & must be 1st stmt.
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("2 Param constructor");
    }

    Demo(int num1) {
        this();                 // used to calling another constructor from within the same class & must be 1st stmt.
        this.num1 = num1;
        num2 = 44;
        System.out.println("1 param constructor");
    }

    void display() {
        System.out.println(num1);
        System.out.println(num2);
    }
}

    public class ConstructorSuperrKeyword {
        public static void main(String[] args) {
//            Demo demo1 = new Demo();
//            demo1.display();  // calling zero param constructor
//            Demo demo2 = new Demo(4);
//            demo2.display();     // calling 1 param const
            Demo demo3 = new Demo(4,24);
            demo3.display();

        }

    }
