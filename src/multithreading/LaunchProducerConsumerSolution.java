package multithreading;
// the solution for this problem is
// if producer produced 1 data so the producer has to check that the consumer is consumed 1 data or not
// if consumed produce 2 data, if not consumed wait and don't produce 2 data

class Producer1 extends Thread
{
    Queue1 q;
    int i = 1;
    public Producer1(Queue1 q)
    {
        this.q = q;
    }
    public void run() {

        while (true)
        {
            q.produce(i++);
        }
    }
}
class Consumer1 extends Thread
{
    Queue1 q;
    public Consumer1(Queue1 q)
    {
        this.q = q;
    }
    public void run() {

        while (true) {
            q.consume();
        }
    }
}

class Queue1  {
    int data;
    boolean flag = false;

    synchronized public void produce(int i)
    {
        try {
            if (flag == true) {
                wait();
            } else {
                data = i;
                System.out.println("I Have produced Data " + data);
                flag = true;
                notify();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

   synchronized public void consume()
    {
        try {
            if(flag == false)
            {
                wait();
            }
            else
            {
                System.out.println("I Have consumed Data " + data);
                flag = false;
                notify();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}


public class LaunchProducerConsumerSolution {
    public static void main(String[] args) {


        Queue1 q = new Queue1();

        Producer1 prod = new Producer1(q);
        Consumer1 c = new Consumer1(q);

//        new Producer(q).start();  // we can also use anonymous object bcz its invoking only one time
//        new Consumer(q).start();

        prod.start();
        c.start();

    }
}
