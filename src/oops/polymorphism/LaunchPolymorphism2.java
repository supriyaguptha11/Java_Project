package oops.polymorphism;
// Creating parent type ref to child type to achieve run time polymorphism

class AeroPlane1
        {
public void takingoff()
        {
        System.out.println("aeroplane must takeoff in order to fly");
        }
public void landing()
        {
        System.out.println("aeroplane is landing");
        }

        }
class CargoPlane1 extends AeroPlane1
{
    public void takingoff()
    {
        System.out.println("CargoPlane requries longer runway to takeoff");
    }
    public void landing()
    {
        System.out.println("CargoPlane is landing");
    }


}
class FighterPlane1 extends AeroPlane1
{
    public void takingoff()
    {
        System.out.println("FighterPlane requries Shorter runway to takeoff");
    }
    public void landing()
    {
        System.out.println("FighterPlane is landing");
    }
}

public class LaunchPolymorphism2 {
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();
        FighterPlane1 fp = new FighterPlane1();
        AeroPlane1 aeroplane;           // added reference variable for parent type
        // using parent type reference variable "aeroplane", now assigning child type references like cp or fp
        aeroplane = cp;

        aeroplane.landing();
        aeroplane.takingoff();

// 1:M means we are using only one reference variable that is aeroplane(parent) and calling differnt childs(cp, fp) which are child type and getting diff outputs
        System.out.println("*****************");

        aeroplane = fp;        // 1:M

        aeroplane.landing();
        aeroplane.takingoff();


    }
}
