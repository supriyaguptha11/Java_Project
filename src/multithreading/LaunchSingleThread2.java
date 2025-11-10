package multithreading;

import java.util.Scanner;
/* If we use different classes also still same problem , after the first activity completed then it will go to the next one
bcz of single-threaded programming*/
class Alpha {
    public void banking() {
        System.out.println("Application started.....");
        System.out.println("Banking application started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user number");
        int un = sc.nextInt();
        System.out.println("enter the password");
        int pass = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking activity terminated..");

    }
}

    class Beta {
        public void PrintingStars() throws InterruptedException {
            System.out.println("Printing activity started..");
            for (int i = 0; i <= 4; i++) {
                System.out.println("**");
                Thread.sleep(4000);
            }
            System.out.println("Printing activity terminated....");
        }
    }

    class Gamma {
        public void focus() throws InterruptedException {
            System.out.println("Important message started....");
            for (int i = 0; i <= 4; i++) {
                System.out.println("Focus is the key ");
                Thread.sleep(4000);
            }
            System.out.println("Important message terminated");


            System.out.println("Application terminated................");
        }
    }



public class LaunchSingleThread2 {
    public static void main(String[] args) throws InterruptedException {
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gamma g = new Gamma();

        a.banking();
        b.PrintingStars();
        g.focus();

    }
}
