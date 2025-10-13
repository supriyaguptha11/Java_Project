package execeptionHandling;

import java.util.Scanner;
//  Throwing the handled exception is called rethrowing
// if there is a "throw" stmt then the next lines will not be executed
//" throw" is used to rethrow the handled exception
// we write throw inside catch block/ inside a method
//throw is used to throw the exception manually
// if throw keyword used lines below the throw keyword will not get executed, immediately control leaves the method
// so u can use "finally{}" , if there is exception or not finally blocks gets executed
// if exception has occurred and corresponding catch block is not matched , still finally blocks gets executed goes to Default exception handler


class Alpha2 {

    public void calc () throws ArithmeticException
    {
        try{

            System.out.println("Alpha Connection Established");
            Scanner scan = new Scanner(System.in);

            System.out.println("Kindly enter the numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly enter the denominator for division");
            int d = scan.nextInt();

            int res = n / d;
            System.out.println("Result is " + res);

           // System.out.println("Alpha2 connection terminated");
        }
        //catch(NullPointerException e)
        catch(ArithmeticException e)
        {
            System.out.println("Handled in alpha");
            throw e;
        }
        finally{
            System.out.println("Alpha2 connection terminated");
        }
    }
}

public class ExceptionHandlingthrow {
    public static void main(String[] args) {
        try {

            System.out.println("Main connection established");
            Alpha2 a = new Alpha2();
            a.calc();
        }
        //catch(NullPointerException e)
        catch(ArithmeticException e)
        {
            System.out.println("exception caught at main method ");
        }
        System.out.println("Main connection terminated");

    }
}
