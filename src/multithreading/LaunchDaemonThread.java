package multithreading;
//Garbage collector is a Daemon Thread
// A secondary thread(or)a background thread, after executing all the threads, at the end the daemon thread has to execute at-least once
// During the other thread execution Daemon thread also can execute no problem but, at the end daemon thread has to execute at-least once
// here it's not worrying about first typing then spell check then saving , they are in a race that everyone should go first
// here comes the picture of DAEMON thread,
// so we are saying , typing is our first priority , so we are setting them like
// ms2.setDaemon(true); ms3.setDaemon(true);
// and also we are setting there priority less, default priority is 5, so we setting it to low like 3 ,4
/*
 daemon thread should keep in loop
 if you give infinite loop for daemon thread it will not execute for infinite times it will follow the primary thread activity
 in our case we have given infinite loop for daemon thread still it executes only 3 times bcz in primary thread has 3
 daemon thread will make sure that it will execute at lat after the primary thread even in between how many it executes still executes at last
*/

/*
 how to make a thread daemon?
 set Daemon to true, give a priority less than 5 and task of the thread in infinite loop
 */


class MSWord extends Thread
{
    @Override
    public void run()
    {
       String name = Thread.currentThread().getName();
       if(name.equals("TYPE"))
       {
           typing();
       }
       else if (name.equals("SPELL"))
       {
           spellCheck();
       }
       else
       {
           autoSaving();
       }

    }
    public void typing()
    {
        try
        {
            for(int i = 0; i < 3; i++)
            {
                System.out.println("Typing...");
                Thread.sleep(3000);
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public void spellCheck()
    {
        try
        {
            for(;;) // infinite loop
            {
                System.out.println("Spelling check...");
                Thread.sleep(3000);
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public void autoSaving()
    {
        try
        {
            for(;;) // infinite loop
            {
                System.out.println("Auto saving...");
                Thread.sleep(3000);
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}

public class LaunchDaemonThread {
    public static void main(String[] args) {
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();
        MSWord ms3 = new MSWord();

        ms1.setName("TYPE");
        ms2.setName("SPELL");
        ms3.setName("SAVING");

        ms2.setDaemon(true);
        ms3.setDaemon(true);

        ms2.setPriority(4);
        ms3.setPriority(3);


        ms1.start();
        ms2.start();
        ms3.start();


    }
}
