package multithreading;

// in java anything and everything is executed bcz of thread
// Thread (line of execution) will be there in stack frame bcz the execution part present in stack frame
// wherever the thread goes that part will be executed



public class LaunchThreadBasicUnderstanding {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Application Started.......");
       // Thread.sleep(5000);

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()); // default name is main
        System.out.println(thread.getPriority()); // default priority is 5

        Thread.sleep(4000);

        // we can change the thread name and priority

        thread.setName("Spring");
        thread.setPriority(4);

        System.out.println(thread.getName());
        System.out.println(thread.getPriority());



        System.out.println("Application Terminated......");

    }
}
