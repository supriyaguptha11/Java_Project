package execeptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception
{
    public UnderAgeException(String msg)
    {
        super(msg);
    }

}
class OverAgeException extends Exception
{
    public OverAgeException(String msg)
    {
        super(msg);
    }

}

class Applicant
{
    int age;

    public void input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your age");
        age = scanner.nextInt();

    }
    public void verify() throws UnderAgeException, OverAgeException {
        if(age >=18 && age <= 60)
        {
            System.out.println("Proceed with license Application");
        }
        else if(age<= 18)
        {
            UnderAgeException uae = new UnderAgeException("Have Patience kiddo! Your time will come.");
            System.out.println(uae.getMessage());
            throw uae;
        }
        else
        {
            OverAgeException oae = new OverAgeException("Your time is near! Rest at home");
            System.out.println(oae.getMessage());
            throw oae;

        }
    }

}

class RtO
{
    public void initiate()
    {
        Applicant app = new Applicant();

        try {
            app.input();
            app.verify();
        }
        catch (UnderAgeException | OverAgeException e)
        {
            System.out.println("Try Again !");
            try {
                app.input();
                app.verify();
            }
            catch (UnderAgeException | OverAgeException e1)
            {
                System.out.println("Your are blocked to apply for license due to age related restrictions");
            }
        }

    }

}
public class ExceptionHandlingCustom {
    public static void main(String[] args)
    {
        System.out.println("License Application");
        RtO rto = new RtO();
        rto.initiate();

    }
}
