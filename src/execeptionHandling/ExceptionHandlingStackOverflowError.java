package execeptionHandling;
// recursive call
//StackOverflowError
// in alpha it calls beta , and coming beta its calls alpha , again beta again alpha it happens continuously
// so , there is a stackoverflow error occurs

class Alien
{
    public void alpha()
    {
       beta();

    }
    public void beta()
    {
        alpha();

    }
}

public class ExceptionHandlingStackOverflowError {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.beta();

    }
}
