package multithreading.objectlevellocking;

public class GooglePay extends Thread
{
    private HSBCBank bank;

    public GooglePay(HSBCBank bank)
    {
        this.bank = bank;
    }
    @Override
    public void run() {
        System.out.println("Deposit");
        bank.deposit(4000);
    }
}
