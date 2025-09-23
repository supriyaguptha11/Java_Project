package oops;

class pencil {
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

        pencil(String colour, int cost, String brand) {
        this.colour = colour;
        this.cost = cost;
        this.brand = brand;
    }
    pencil()
    {
        colour = "red";
        cost = 5000;
        brand = "nemo";
    }

    pencil(String colour, int cost) {
        this.colour = colour;
        this.cost = cost;
    }

//    void printDetails() {
//        System.out.println(colour +" " + "cost is "+ cost);
//    }
//    void printAll() {
//        System.out.println(colour +" " + "cost is "+ cost + " "+ brand);
//    }
}

public class Example2 {

    public static void main(String[] args) {
        pencil p1 = new pencil("white",300,"breed");
        System.out.println(p1.getColour());
        System.out.println(p1.getCost());
        System.out.println(p1.getBrand());
        pencil p2 = new pencil();
        System.out.println(p2.getColour());
        System.out.println(p2.getCost());
        System.out.println(p2.getBrand());
    }

}

