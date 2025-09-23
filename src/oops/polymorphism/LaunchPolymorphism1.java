package oops.polymorphism;
// True polymorphism
class AeroPlane
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
class CargoPlane extends AeroPlane
{
    public void takingoff()
    {
        System.out.println("CargoPlane requries longer runway to takeoff");
    }

}
class FighterPlane extends AeroPlane
{
    public void takingoff()
    {
        System.out.println("FighterPlane requries Shorter runway to takeoff");
    }

}



public class LaunchPolymorphism1 {
    public static void main(String[] args) {
      AeroPlane cp = new CargoPlane();
      cp.takingoff();
      cp.landing();

//        AeroPlane fp = new FighterPlane();
//        fp.takingoff();


    }
}
