package execeptionHandling;

import java.util.Scanner;
// if exception is not handled then it will go to the caller of the method(main in this case)
// if your handling the exception in method(here alpha) then the exception will not go to the caller.
// even if you write try & catch in main method , the exception will not go there because it is handled in alpha method


class Alpha1 {

        public void calc ()
        {
            try{

            System.out.println("Alpha1 Connection Established");
            Scanner scan = new Scanner(System.in);

            System.out.println("Kindly enter the numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly enter the denominator for division");
            int d = scan.nextInt();

            int res = n / d;
            System.out.println("Result is " + res);

            System.out.println("Alpha1 connection terminated");
        }
            catch(ArithmeticException e)
            {
                System.out.println("Handled in alpha");
            }
    }
}

public class ExceptionHandledInMethod {
    public static void main(String[] args) {
        try {

            System.out.println("Main connection established");
            Alpha1 a = new Alpha1();
            a.calc();
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception caught at main method ");
        }
        System.out.println("Main connection terminated");

    }
}
