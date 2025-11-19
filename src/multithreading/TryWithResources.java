package multithreading;



import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
// if you implement AutoCloseable , it will internally close the resource
//class Alien implements AutoCloseable
//{
//    @Override
//    public void close() throws Exception
//    {
//        System.out.println("Close method of alien");
//    }
//}

public class TryWithResources {
    public static void main(String[] args) throws Exception {

//        try(Alien alien = new Alien())
//        {
//
//        }
//        BufferedWriter writer = null;
//        try
//        {
//            writer = new BufferedWriter(new FileWriter("D:\\Java_Practice\\java.txt"));
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        finally
//        {
//            writer.close();
//        }
// instead of writing like this, a separate finally block to close, use try with resources
// if you write it in try , if exception occurs or not but that will execute and close
// after java 8 it will close automatically
        // if we use try with resources , we can just use try block no need of catch block, but if exception occurs catch will not be there to handle the exception


//        try(BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Java_Practice\\java.txt"));)
//        {
//
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }



    }
}
