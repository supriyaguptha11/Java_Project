package multithreading.classlevellocking;

public class GooglePay extends Thread
{
    @Override
    public void run() {
        System.out.println("Deposit");
        HSBCBank.deposit(4000);
    }
}
