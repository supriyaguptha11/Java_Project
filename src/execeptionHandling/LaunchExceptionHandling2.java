package execeptionHandling;

import java.util.Scanner;

public class LaunchExceptionHandling2 {
    public static void main(String[] args) {
            System.out.println("Connection Established");
            Scanner scan = new Scanner(System.in);
            System.out.println("Kindly enter the numerator for division");
            int n = scan.nextInt();

            System.out.println("Kindly enter the denominator for division");
            int d = scan.nextInt();

            int res = n/d;
            System.out.println("Result is " + res);


        System.out.println("Connection Terminated");
    }
}
