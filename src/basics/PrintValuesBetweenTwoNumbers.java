package basics;

import java.util.Scanner;

// Print values between two numbers
// I/P : first number by the user is 2 and second number by the user is 8
// O/P : 3 4 5 6 7

// I/p : 3 to 9
// O/P : 4 5 6 7 8
public class PrintValuesBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Output in reversed order: ");
        for(int i = firstNumber+1; i < secondNumber; i++){
            System.out.print(i + " ");
        }

    }
}
