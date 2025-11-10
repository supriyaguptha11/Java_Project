package multithreading;

// In synchronized at a time only one thread gets executed
// until the first thread execution is complete the other thread will not execute

class MyCar implements Runnable
{
    @Override
   synchronized public void run() {
        try {


        System.out.println(Thread.currentThread().getName() + " has entered parking lot");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " has entered into car");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " has started to drive the car");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " has came back and parked the car");

    }
     catch(Exception e)
    {
        e.printStackTrace();
    }
    }

}

public class LaunchThreadSynchronized {
    public static void main(String[] args) {
        MyCar car = new MyCar();

        // creating threads
        // here reference variable car is saying that in MyCar task is available go do it
        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        //setting name to a thread
        t1.setName("RAMESH");
        t2.setName("SURESH");
        t3.setName("DINESH");

        // giving life to a thread
        t1.start();
        t2.start();
        t3.start();

    }
}
