package multithreading.classlevellocking;

public class Atm extends Thread
{ @Override
    public void run()
    {
        System.out.println("Withdraw");
        HSBCBank.withdraw(4000);

    }

}
