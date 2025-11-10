package multithreading;

import java.util.Scanner;
/*  here we are not created any thread and total 3 activities are there to perform -starts from main thread
and until the first activity(Banking application) is not completed it will not go to the next activity bcz single thread is there
and CPU time cycle is getting wasted bcz of single-threaded programming
*/
// here we are achieving concurrent
public class LaunchSingleThread1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application started.....");
        System.out.println("Banking application started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user number");
        int un = sc.nextInt();
        System.out.println("enter the password");
        int pass = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking activity terminated..");

// another activity not linked to banking application
        System.out.println("Printing activity started..");
        for (int i = 0; i<= 4;i++)
        {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated....");


// another activity and not linked to any of above
        System.out.println("Important message started....");
        for (int i = 0; i<= 4;i++)
        {
            System.out.println("Focus is the key ");
            Thread.sleep(4000);
        }
        System.out.println("Important message terminated");


        System.out.println("Application terminated................");

    }
}
