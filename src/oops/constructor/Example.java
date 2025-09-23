package oops.constructor;

class pen {
    String colour;
    int cost;
    String brand;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public pen(String colour, int cost, String brand) {
        this.colour = colour;
        this.cost = cost;
        this.brand = brand;
    }
    pen()
    {

    }

    pen(String colour, int cost) {
        this.colour = colour;
        this.cost = cost;
    }

    void printDetails() {
        System.out.println(colour +" " + "cost is "+ cost);
    }
    void printAll() {
        System.out.println(colour +" " + "cost is "+ cost + " "+ brand);
    }
}

public class Example {

    public static void main(String[] args) {
        pen p1 = new pen("red",12);
        pen p2 = new pen();
        p2.setBrand("cello");
        p2.setColour("black");
        System.out.println(p2.getColour());
        System.out.println(p2.getBrand());
        // p1.printDetails();
        pen p3 = new pen("red",12, "techno tip");
        p3.printAll();


    }

}
