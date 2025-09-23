import java.sql.SQLOutput;
import java.util.Scanner;

class Farmer{
    float pa;   //principal amount
    float td;     // time duration
    float si;     // simple interest
    static float roi;               // it is same for all farmer so, we are making it static to save memory
    static
    {
        roi = 2.5f;
    }
    void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter the loan amount required in rupees ");
        pa = scanner.nextFloat();
        System.out.println("Kindly enter time duration to repay loan in months");
        td = scanner.nextFloat();

       // roi = 2.5f;
    }
    void compute()
    {
        si = (pa*td*roi)/100.0f;
    }
    void disp()
    {
        System.out.println("Hello, Your simple interest is : " + si);
    }

}



public class LoanApp {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        Farmer f3 = new Farmer();


        System.out.println("Farmer1: ");
        f1.acceptInput();
        f1.compute();
        f1.disp();

        System.out.println("Farmer1: ");
        f2.acceptInput();
        f2.compute();
        f2.disp();

        System.out.println("Farmer3: ");
        f3.acceptInput();
        f3.compute();
        f3.disp();


    }
}
