package multithreading;
/*
Why do we write
String res1 = new String("Java");
instead of just
String res1 = "Java";
Because new String("Java") creates a new, unique object in the heap, while "Java" (without new) refers to a shared string literal from the string pool.
We need unique objects when using them as locks in synchronized blocks otherwise,
multiple threads might accidentally share the same lock, causing incorrect synchronization behavior.

 */

// States of a thread - New->Runnable->Running->Dead
// in Running state  we have Sleep, Blocked, Wait
// in Running state if sleep time is over then it will return to Runnable state, there Thread Scheduler will schedule it
// this applies for blocked and wait as well


// multiple threads separately and concurrently one thread

class Library implements Runnable
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
             synchronized (res1) // as soon as book found it locks
             {
                 System.out.println("Student2 has acquired " + res1);
                 // search for another book
                 Thread.sleep(4000);
                 synchronized (res2) // it locks
                 {
                     System.out.println("Student2 has acquired " + res2);
                     Thread.sleep(4000);
                     synchronized (res3)
                     {
                         System.out.println("Student2 has acquired " +res3);
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


public class LaunchThreadApp {
    public static void main(String[] args) {

        Library lib = new Library();

        Thread thread1 = new Thread(lib); // new state
        Thread thread2 = new Thread(lib);

        thread1.setName("Student1");
        thread2.setName("Student2");

        thread1.start(); // runnable state
        thread2.start();


    }
}
