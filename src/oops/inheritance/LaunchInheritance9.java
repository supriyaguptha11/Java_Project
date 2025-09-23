package oops.inheritance;

// Rules for overriden method in child class
class Plane
{

}
class FighterPlane extends Plane
{

}
class T
{

}
class Animal
{
    public void eat()
    {
        System.out.println("Animals are required to eat");
    }
    public void eating(String FoodType)
    {
        System.out.println("Animals are eating");
    }
    void Sleep()
    {
        System.out.println("Animal is sleeping");
    }
//    public void running()
//    {
//        System.out.println("Animal is running");
//    }
    public Plane running()
    {
        System.out.println("Animal is running");
        Plane p = new Plane();
        return p;
    }
}
class Tiger extends Animal
{
//   // void eat()     // cannot reduce the visibility while overriding inherited methods here it is default
//    {
//        System.out.println("Tiger hunts and eat");
//    }

   public void eat()
    {
        System.out.println("Tiger hunts and eat");
    }
    public void eating(String FoodType)         // it is possible bcz it has argument like parent , if you dont write String FoodType in child then it is considered as specialized method which is not there in parent
    {
        System.out.println("tigers are eating");
    }
    public void eating()         // here it is  specialized method bcz the argument is not there , as it has in parent, its overloaded method of child class and hence its specialized method of child class
    {
        System.out.println("tigers are eating");
    }
    protected void sleep()  // we can increase the visibility overriding inherited methods
    {
        System.out.println("Tiger is sleeping ");
    }
//    public int running()       // the primitive return types cannot be changed
//    {
//        System.out.println("Tiger is running to hunt");
//        return 10;
//    }

    public FighterPlane running()        // co-varient return type are such return types where there is a parent child r/s,or is-A relation ship
    {
        System.out.println("Tiger is running to hunt");
        FighterPlane fp = new FighterPlane();
        return fp;

    }
//    public T running()       // throws error bcz no relationship between T and parent class
//    {
//        System.out.println("Tiger is running to hunt");
//        T t = new T();
//        return t;
//
//    }

}

public class LaunchInheritance9 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
