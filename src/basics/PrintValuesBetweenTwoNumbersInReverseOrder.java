package basics;// I/P: 2 8
// O/P: 7 6 5 4 3

import java.util.Scanner;

public class PrintValuesBetweenTwoNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Basics.Reverse order :");
        for(int i = secondNumber-1; i > firstNumber; i--){
            System.out.println(i);
        }
    }
}
