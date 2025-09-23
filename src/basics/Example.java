package basics;

public class Example {
    int a, b;

    public Example() {
        this(10, 20); // calls the constructor with parameters
    }

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new Example();
//        new Basics.Example(100,200);
    }
}