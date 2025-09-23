package basics;

import java.util.Scanner;
class AddNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstNumber:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter secondNumber:");
        int secondNumber = scanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("result is " + result);
    }
}