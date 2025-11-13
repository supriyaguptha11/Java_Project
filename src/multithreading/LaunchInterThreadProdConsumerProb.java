package multithreading;
// Producer consumer problem
// the producer keep on producing the data, even it's not checking whether my consumer is consuming it or not
// the consumer here is consuming the same data multiple times and not going to the next data

class Producer extends Thread
{
    Queue q;
    int i = 1;
    public Producer(Queue q)
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
class Consumer extends Thread
{
    Queue q;
    public Consumer(Queue q)
    {
        this.q = q;
    }
    public void run() {


        while (true) {
            q.consume();
        }
    }
}
class Queue
{
    int data;

     public void produce(int i)
    {
        data = i;
        System.out.println("I Have produced Data " + data);
    }

     public void consume()
    {
        System.out.println("I Have consumed Data "+ data);
    }

}



public class LaunchInterThreadProdConsumerProb {
    public static void main(String[] args)
    {
        Queue q = new Queue();

        Producer prod = new Producer(q);
        Consumer c = new Consumer(q);

//        new Producer(q).start();  // we can also use anonymous object bcz its invoking only one time
//        new Consumer(q).start();

        prod.start();
        c.start();

    }
}
