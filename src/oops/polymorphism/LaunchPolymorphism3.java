package oops.polymorphism;

//achieve real time polymorphism
class AeroPlane2
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
class CargoPlane2 extends AeroPlane2
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
class FighterPlane2 extends AeroPlane2
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
class Airport
{
    public void permit(AeroPlane2 aeroplane)           // parent type ref
    {
        aeroplane.landing();
        aeroplane.takingoff();
    }
}
public class LaunchPolymorphism3 {
    public static void main(String[] args) {
        CargoPlane2 cp = new CargoPlane2();
        FighterPlane2 fp = new FighterPlane2();
        Airport a = new Airport();

        a.permit(cp);
        a.permit(fp);



    }
}
