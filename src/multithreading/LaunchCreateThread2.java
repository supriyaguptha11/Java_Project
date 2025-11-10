package multithreading;
// Implementing runnable Interface

import java.util.Scanner;

class Alpha2 implements Runnable
{
    @Override
    public void run ()
    {
        banking();
    }
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

class Beta2 implements Runnable
{
    @Override
    public void run ()
    {
        try {
            PrintingStars();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void PrintingStars() throws InterruptedException {
        System.out.println("Printing activity started..");
        for (int i = 0; i <= 4; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated....");
    }
}

class Gamma2 implements Runnable
{
    @Override
    public void run ()
    {
        try {
            focus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void focus() throws InterruptedException {
        System.out.println("Important message started....");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Focus is the key ");
            Thread.sleep(4000);
        }
        System.out.println("Important message terminated");



    }
}



public class LaunchCreateThread2 {
    public static void main(String[] args) throws InterruptedException {
        Alpha2 a = new Alpha2();
        Beta2 b = new Beta2();
        Gamma2 g = new Gamma2();

        // creating a thread instance
        // inside a of ALpha2 run method is present, so we are giving ref a to a thread likewise all
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        Thread thread3 = new Thread(g);

        // before start method there is no life for thread , we can check that by using isAlive();

//        System.out.println(thread1.isAlive()); // false bcz there is no life for thread
//        System.out.println(thread2.isAlive());// false
//        System.out.println(thread3.isAlive());// false

        thread1.start();
        thread2.start();
        thread3.start();
// join(); method is a way of controlling threads
        thread1.join();//The join() method blocks the calling thread (main thread here) until the target thread finishes execution.
        thread2.join();
        thread3.join();

//        System.out.println(thread1.isAlive()); // true  bcz start method has life
//        System.out.println(thread2.isAlive()); // true
//        System.out.println(thread3.isAlive()); // true


        System.out.println("Application terminated................");





    }
}

