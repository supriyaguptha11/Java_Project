package oops.inheritance;
// extends object class in backend it's java nature
// One parent class can have multiple child classes
class AeroPlane     //not writing explicitly anything like parent or extend , then this class parent is object , it mean
                     // AeroPlane extends object class , it has all the properties what object has
{
    void fly()
    {
        System.out.println("AeroPlane flies");
    }
    void landing(){
        System.out.println("AeroPlane landing");
    }

}
// A class cannot extends multiple classes and called as multiple inheritance eg class PassengerPlane extends AeroPlane extends CargoPlane
// multiple inheritance is not allowed in java
class CargoPlane extends AeroPlane
{

}
class PassengerPlane extends AeroPlane
{

}
class CommercialPlane extends PassengerPlane                      // what ever there in PassengerPlane will comes in CommericialPlane(child) also
                                                                  // as it inherit the properties of Passengerplane(parent) this called multi-level inheritance
{

}



public class LaunchInheritance2 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.landing();
        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.landing();
        CommercialPlane cp2 = new CommercialPlane();
        cp2.fly();
        cp2.landing();

    }
}
