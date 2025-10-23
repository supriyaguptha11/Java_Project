package collections.generics;

//we can do for interface also
//interface Alpha<T> {
//
//        }
// for interface
//class Generics<T> implements Alpha<String>

    class Generics<T>
    {
    private T ref;

    public Generics(T ref) {
        this.ref = ref;
    }
    public void disp()
    {
        System.out.println("The type of t is : " + ref.getClass().getName());
    }

    public T getRef() // getter
    {
        return ref;
    }
}


public class LaunchGenericsCustom {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<>(44);
        g.disp();
        System.out.println(g.getRef());

      //  Generics<Integer> g1 = new Generics<>(SpringBoot); //compile time error bcz integer type ref and passing string value


        Generics<String> g2 = new Generics<>("SpringBoot");
        g2.disp();
        System.out.println(g2.getRef());

    }
}
