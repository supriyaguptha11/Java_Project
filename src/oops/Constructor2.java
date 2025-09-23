package oops;


class Cat
{
    private int cost;
    private String name;
    private String colour;
    // generating getters and setters
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // creating a constructor with parameters
    Cat( int cost, String name,String colour)
    {
        this.cost = cost;   // Assigning a Local variable to instance variable both are same names so using "this" keyword
        this.name = name;
        this.colour = colour;
    }
    // another constructor with zero parameters
    Cat()
    {
        cost = 5000;
        name = "lappy";
        colour = "Black";
    }
}
public class Constructor2 {
    public static void main(String[] args) {
        Cat c1 = new Cat(400, "sheero","white");
        System.out.println(c1.getCost());
        System.out.println(c1.getName());
        System.out.println(c1.getColour());
        Cat c2 = new Cat();
        System.out.println(c2.getCost());
        System.out.println(c2.getName());
        System.out.println(c2.getColour());

    }
}
