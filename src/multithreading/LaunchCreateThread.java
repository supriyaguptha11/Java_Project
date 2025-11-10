package multithreading;
// creating a thread - 1. by extending predefine class called thread 2. by implementing a runnable interface
// Apart from main thread , whatever thread we create we need to define a task to that thread, it is there inside a method called run method

import java.util.Scanner;

class Alpha1 {
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

class Beta1 {
    public void PrintingStars() throws InterruptedException {
        System.out.println("Printing activity started..");
        for (int i = 0; i <= 4; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated....");
    }
}

class Gamma1 {
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



public class LaunchCreateThread {
    public static void main(String[] args) throws InterruptedException {
        Alpha1 a = new Alpha1();
        Beta1 b = new Beta1();
        Gamma1 g = new Gamma1();

        a.banking();
        b.PrintingStars();
        g.focus();

    }
}
