package execeptionHandling;

// if you can't handle the exception using try and catch, then duck it using "throws" in the method signature which exception might occur
// we duck the exception in method signature not the body
// here if you call calc() method you will get exception that exception is handled by main
import java.util.Scanner;

class Alpha{
    public void calc()throws ArithmeticException
    {
        System.out.println("Alpha Connection Established");
        Scanner scan = new Scanner(System.in);

            System.out.println("Kindly enter the numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly enter the denominator for division");
            int d = scan.nextInt();

            int res = n / d;
            System.out.println("Result is " + res);

        System.out.println("Alpha connection terminated");
        }
    }

public class ExceptionHandlingthrows {
    public static void main(String[] args) {
        try {

            System.out.println("Main connection established");
            Alpha a1 = new Alpha();
            a1.calc();
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception caught at main method ");
        }
        System.out.println("Main connection terminated");
        
    }
}
