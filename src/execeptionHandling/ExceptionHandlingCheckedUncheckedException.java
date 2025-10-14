package execeptionHandling;
// At compile time the compiler will check the possibility of exception - this exception called CheckedException
// then you to handle that exception, here exception handled using(throws InterruptedException)
// exceptions occurs at run time only

// Exceptions whose possibilities will not checked by compiler, developer has to check the exception called as- UnCheckedException

// thread means control, where ever thread goes that line will get executed

public class ExceptionHandlingCheckedUncheckedException {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main method started");
        // we are saying the thread to sleep for 5 seconds , at that time nothing will happen in code
        // so, here java compiler says at that your application may be Interrupted
        // you might get one InterruptedException
        Thread.sleep(5000); // Unhandled exception: java.lang.InterruptedException

        System.out.println("main method ended");


    }
}
