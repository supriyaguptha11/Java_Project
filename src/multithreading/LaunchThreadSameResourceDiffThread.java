package multithreading;
// if you have same resources and different threads
/*
// here all three can enter the parking lot but all three cannot get into the car, drive the car and park the car
 so, we keep synchronized only to that particular thread where multiple threads should not run and wait until the first thread completes its task
 synchronized (this) { } to lock the particular tasks(in this case)to that particular task and
 this keyword is used bcz its currently running object task does
*/

class MyCar1 implements Runnable
{
    @Override
     public void run() {
        try {

            System.out.println(Thread.currentThread().getName() + " has entered parking lot");
            Thread.sleep(4000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " has entered into car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has started to drive the car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has came back and parked the car");
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

public class LaunchThreadSameResourceDiffThread {
    public static void main(String[] args) {
        MyCar1 car = new MyCar1();

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
