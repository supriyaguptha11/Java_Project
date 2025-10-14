package execeptionHandling;

import java.util.Scanner;
class InvalidCustomerException extends Exception
{
    public InvalidCustomerException(String msg)
    {
        super(msg);
    }
}
class Atm
{
    private int acc = 4545;
    private int pwd = 1234;

    int accountNo;
    int password;
    public void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("kindly enter the account number");
        accountNo = scan.nextInt();

        System.out.println("Kindly enter the password");
        password = scan.nextInt();
    }
    public void verify() throws InvalidCustomerException
    {
        if(acc == accountNo && pwd == password)
        {
            System.out.println("Proceed to withdraw cash");
        }
        else {
//            System.out.println("ohh! seems like legend? whats the matter");
//            input();
//            verify();// if i write this the use gets multiple chances which is not good so, we use custom exception

            InvalidCustomerException ice = new InvalidCustomerException("Invalid Credentials");
            System.out.println(ice.getMessage());
            throw ice;
        }
    }
}
class Bank {
    public void initiate() {
        Atm atm = new Atm();
        try {
            atm.input();
            atm.verify();
        }
        catch (InvalidCustomerException ice) {
            System.out.println("Try Again!");
            try {
                atm.input();
                atm.verify();
            } catch (InvalidCustomerException ice2) {
                System.out.println("Try Again!");
                try {
                    atm.input();
                    atm.verify();
                } catch (InvalidCustomerException ice3) {
                    System.out.println("Your are a legend, cannot be given any more chances");
                }

            }
        }
    }
}

    public class ExceptionHandlingCustomException {
        public static void main(String[] args) {
            Bank b = new Bank();
            b.initiate();

        }
    }


