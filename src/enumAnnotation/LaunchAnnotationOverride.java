package enumAnnotation;

class Animal
{
    public void animalUsuallyHuntsAndEat()
    {
        System.out.println("Animal is eating....");
    }
}
class Tiger extends Animal
{
    // overriding parent class method to suite child requirements
    @Override // tells that we are overriding the parent method in child
    public void animalUsuallyHuntsAndEat()
    {
        System.out.println("Tiger hunts and eat");
    }
}
public class LaunchAnnotationOverride {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.animalUsuallyHuntsAndEat();

    }

}
