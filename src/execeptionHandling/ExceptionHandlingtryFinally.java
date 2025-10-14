package execeptionHandling;
// we can write try and finally blocks .
// even if there is a return statement in the method still the finally gets executed

import java.util.Scanner;

class Gamma {
    public int disp() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("disp method of gamma");
            return 10;
        }
        finally
        {
            System.out.println("finally block of gamma");
            return 44;

        }
    }
}

public class ExceptionHandlingtryFinally {
    public static void main(String[] args) {
        Gamma g = new Gamma();
        //g.disp();
        System.out.println(g.disp());

    }
}