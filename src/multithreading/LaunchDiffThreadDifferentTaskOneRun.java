package multithreading;

// controlling the threads ,
// we have 3 threads , 3 tasks and single run method
import java.util.Scanner;

class Alpha3 implements Runnable
{
    @Override
    public void run ()
    {
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("BANK"))
        {
            banking();
        } else if (threadName.equals("FOCUS"))
        {
            focus();
        }
        else
        {
            printingStars();
        }

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

    public void printingStars()  {
        System.out.println("Printing activity started..");
        for (int i = 0; i <= 4; i++) {
            System.out.println("**");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Printing activity terminated....");
    }

    public void focus() {
        System.out.println("Important message started....");
        for (int i = 0; i <= 4; i++) {
            System.out.println("Focus is the key ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Important message terminated");



    }
}


public class LaunchDiffThreadDifferentTaskOneRun{
    public static void main(String[] args) throws InterruptedException {
        Alpha3 a = new Alpha3();



        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(a);
        Thread thread3 = new Thread(a);

        thread1.setName("BANK");
        thread2.setName("STAR");
        thread3.setName("FOCUS");

        thread1.start();
        thread2.start();
        thread3.start();

//        thread1.join();
//        thread2.join();
//        thread3.join();

        System.out.println("Application terminated................");

    }
}


