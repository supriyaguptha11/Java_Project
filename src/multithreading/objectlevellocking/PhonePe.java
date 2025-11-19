package multithreading.objectlevellocking;

public class PhonePe extends Thread
{
    private HSBCBank bank;

    public PhonePe(HSBCBank bank)
    {
        this.bank = bank;
    }
    @Override
    public void run() {
        System.out.println("Balancing checking");
        bank.checkBalance();
    }
}

