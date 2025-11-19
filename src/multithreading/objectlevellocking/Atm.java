package multithreading.objectlevellocking;

public class Atm extends Thread
{
    private HSBCBank bank;
    public Atm(HSBCBank bank)
    {
        this.bank = bank;
    }
    @Override
    public void run()
    {
        System.out.println("Withdraw");
        bank.withdraw(4000);

    }

}
