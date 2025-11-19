package multithreading.classlevellocking;

public class PhonePe extends Thread
{
    @Override
    public void run() {
        System.out.println("Balancing checking");
        HSBCBank.checkBalance();
    }
}

