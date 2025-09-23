package execeptionHandling;
// The catch block handles exception
// if you feel like occurring an exception(error) in the code(here denominator as non-zero) then keep that code in try block and if exception occurs
// then what should execute keep that code in catch block.
// if there is exception in try block then catch block will be executed.
// if user enters zero for denominator then exception occur and remaining code will not be executed and lead to catch block(for this code)



import java.util.Scanner;

public class LaunchExceptionHandling1 {
    public static void main(String[] args) {
        System.out.println("Connection Established");
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly enter the numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly enter the denominator for division");
            int d = scan.nextInt();

            int res = n/d;
            System.out.println("Result is " + res);
        }
        catch(Exception e)
        {
            System.out.println("Please enter the non zero denominator");
        }

        System.out.println("Connection Terminated");

    }
}
