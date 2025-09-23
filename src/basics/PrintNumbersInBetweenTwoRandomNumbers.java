package basics;// I/P : 2 8
// O/P : 3 4 5 6 7

// I/P : 7 1
// O/P : 2 3 4 5 6

// I/P : 10 16
// O/P : 11 12 13 14 15

// I/P : 20 12
// O/P : 13 14 15 16 17 18 19


import java.util.Scanner;

public class PrintNumbersInBetweenTwoRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber = scanner.nextInt();
        System.out.println("number between two numbers : ");
        if (firstNumber < secondNumber) {
            for (int i = firstNumber + 1; i < secondNumber; i++) {
                System.out.println(i);
            }
        } else if (firstNumber > secondNumber ){
            for (int i = secondNumber + 1; i < firstNumber; i++) {
                System.out.println(i);
            }

        }
    }
}
