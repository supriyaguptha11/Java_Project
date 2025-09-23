package oops.launchabstract;

// in abstract, we can have a methods without body means without implementing the body and with only method signatures
// other classes will implement them
// you make any of the method as abstract as its mandatory to make class also abstract

// In java, we can have methods without body/implementation with only method signature, however such methods must be declared as abstract using abstract keyword
// abstract methods are such methods which doesn't have body or implementation
// if one method is also declared as abstract in a class then the class also must be declared as abstract
// abstract class can have all methods as abstract
// abstract class can have few methods as abstract & few methods as concrete(method with body)


abstract class Animal
{
     public Animal()    // abstract class can have constructor however this will be executed bcz of super() method present in child classes
    {
        System.out.println("Animal of constructor");
    }
//   abstract public Animal()     we cannot make constructor as abstract
//    {
//        System.out.println("Animal of constructor");
//    }

   // abstract int age;  // we cannot have a variable as abstract
    public abstract void eat();

    // public final abstract void eat();   //  we cannot make abstract method  as final bcz abstract method do participate in inheritance (someone has to override it in a child class)
    // while final do participate in inheritance but can't be override

    public abstract void running();

}
class Tiger extends Animal
{
    public void eat()
    {
        System.out.println("Tiger hunts and eats ");
    }
    public void running()
    {
        System.out.println("Tiger is running to hunt");
    }
    public void run()
    {
        System.out.println("Tiger is running ");
    }
}
class Monkey extends Animal
{
    public void eat()
    {
        System.out.println("Monkey steals and eats");
    }
    public void running()
    {
        System.out.println("Monkey is running after stealing ");
    }
}
class Forest
{
    public void permit(Animal animal)       // parent type reference
    {
        animal.eat();    // 1:M
        animal.running();

    }
}
public class LaunchAbstract1 {
    public static void main(String[] args) {
      //  Animal a = new Animal();           // we cannot create instance/object of an abstract class .// but we can create ref of abstract class to achieve polymorphism
        Tiger t = new Tiger();
        Monkey m = new Monkey();
        Forest f = new Forest();
        f.permit(t);
        f.permit(m);
        //  ((Tiger) t).run();    // if there is spl method in one child class,& not there in parent, then we need to downcast it
        t.run();

    }

}

