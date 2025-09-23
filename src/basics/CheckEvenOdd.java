package basics;//checks the number given by user is even or odd
import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number from 1 to 100:");
        int number = scanner.nextInt();
        if (number% 2==0) {
            System.out.println("the number " + number + " even");
        } else {
            System.out.println("the number "+ number + " odd");
        }
    }
}
