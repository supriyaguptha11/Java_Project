// single try block and multiple catch blocks

package execeptionHandling;
import java.util.Scanner;

public class ExceptionHandling3_Single_try_multiple_catch {
    public static void main(String[] args) {
        System.out.println("Connection Established");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly enter the numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly enter the denominator for division");
            int d = scan.nextInt();

            int res = n / d;
            System.out.println("Result is " + res);
            System.out.println("Kindly enter size of an array");
            int size = scan.nextInt();

            int ar[] = new int[size];
            System.out.println("Kindly enter element to be inserted in an array");
            int elem = scan.nextInt();

            System.out.println("Kindly enter position at which element to be inserted");
            int index = scan.nextInt();
            ar[index] = elem;

            System.out.println("Data inserted in a array is " + ar[index]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Please enter non zero number");
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Please enter only positive values");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be within limits, Don't cross Boundaries");
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }

        System.out.println("Connection Terminated");
    }
}
