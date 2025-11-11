package multithreading;
/*
// student 2 in reverse order like res3, res2, res1
// let assume thread 1 is student1 and thread 2 is student2
 thread1 search for res1 Java and apply lock and goes to sleep state for 4 sec
Thread Scheduler won't waste CPU time, so it sends Thread2, thread 2 will lock the res3 spring boot (reverse order) and goes to sleep
 meanwhile thread1 wakes and go to runnable state there Thread scheduler sends it, thread1 locks res2 DSA and goes to sleep
 thread 2 wakes and go to runnable state again Thread scheduler sends it, there thread2 won't find res2 DSA bcz it is locked by thread1
 so, thread 2 goes to blocked state until thread1 releases it.
 again thread1 wakes and search for res3 spring boot thread 1 cannot find bcz it is locked by thread2, so thread1 will go to blocked state until thread2 releases it
 in this way both the threads will stuck in blocked state permanently due to cyclic dependency of resources it is called as DeadLock

 //solution for deadlock is - proper usage of synchronized key word
*/
// this problem occurs only if single resource multiple threads

class Library1 implements Runnable
{
    String res1 = new String("Java");
    String res2 = new String("DSA");
    String res3 = new String("SpringBoot");


    @Override
    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("Student1"))
        {
            try
            {
                System.out.println("Student 1 got into library");
                Thread.sleep(3000);
                synchronized (res1)
                {
                    System.out.println("Student1 has acquired " + res1);
                    Thread.sleep(4000);
                    synchronized (res2)
                    {
                        System.out.println("Student1 has acquired " + res2);
                        Thread.sleep(4000);
                        synchronized (res3)
                        {
                            System.out.println("Student1 has acquired " +res3);
                            Thread.sleep(4000);
                        } // the moment control comes out of this the res3 is released
                    } // res2 released
                } // res1 is released

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

        }
        else
        {
            try
            {
                System.out.println("Student 2 got into library");
                Thread.sleep(3000);
                synchronized (res3) // as soon as book found it locks
                {
                    System.out.println("Student2 has acquired " + res3);
                    // search for another book
                    Thread.sleep(4000);
                    synchronized (res2) // it locks
                    {
                        System.out.println("Student2 has acquired " + res2);
                        Thread.sleep(4000);
                        synchronized (res1)
                        {
                            System.out.println("Student2 has acquired " +res1);
                            Thread.sleep(4000);
                        }
                    }
                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}


public class LaunchDeadLock {
    public static void main(String[] args) {

        Library1 lib = new Library1();

        Thread thread1 = new Thread(lib); // new state
        Thread thread2 = new Thread(lib);

        thread1.setName("Student1");
        thread2.setName("Student2");

        thread1.start(); // runnable state
        thread2.start();


    }
}

