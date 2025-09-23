package oops;


class Dog
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
    Dog( int cost, String name,String colour)
    {
       this.cost = cost;   // Assigning a Local variable to instance variable both are same names so using "this" keyword
       this.name = name;
       this.colour = colour;
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Dog d1 = new Dog(400, "sheero","white");
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getColour());



    }
}
