package oops.inheritance;

class AeroPlane1
{
    void fly()
    {
        System.out.println("AeroPlane flies");
    }
    void landing(){
        System.out.println("AeroPlane landing");
    }

}

class CargoPlane1 extends AeroPlane1
{
    // we are not writing the landing() bcz by CargoPlane1 extends AeroPlane1 it means AeroPlane1 properties has in CargoPlane , it is Inherited method
    void fly()                                                      // we are overwriting the fly(), it means overridden method is printed not the actual one, it called as overridden method
    {
        System.out.println("Flying the Aeroplane");
    }
    void takeoff()                                             // specialized method only there in child class
    {
        System.out.println("flight is going to takeoff");
    }
}
class PassengerPlane1 extends AeroPlane1
{

}
class CommercialPlane1 extends PassengerPlane1

{

}



public class LaunchInheritance4 {
    public static void main(String[] args) {
//        CargoPlane cp = new CargoPlane();
//        cp.fly();
//        cp.landing();
//        PassengerPlane pp = new PassengerPlane();
//        pp.fly();
//        pp.landing();
//        CommercialPlane cp2 = new CommercialPlane();
//        cp2.fly();
//        cp2.landing();
        // here we need to print both child and parent, to achieve run time polymorphism, we have created object for CargoPlane1(child) class & which it refers to AeroPlane1(parent) class ,here the reference is parent
        // both names should be same , but in one case the name can be its parent types that is CargoPlane1, parent is AeroPlane1
        AeroPlane1 plane = new CargoPlane1(); // upcasting means creating parent type reference to child type of object
        plane.fly();
        plane.landing();
        ((CargoPlane1)plane).takeoff(); // downcasting means temporarily changing parent type reference variable(plane) to child type, so that i can access specialized behaviour present in the class
        // takeoff is a specialized method which is only there in child class that is in CargoPlane1, so to call takeoff() we write ((CargoPlane1)plane).takeoff()
//
//        CargoPlane1 plane1 = new CargoPlane1();
//        plane1.fly();
//        plane1.landing();
//        plane1.takeoff();
    }
}
