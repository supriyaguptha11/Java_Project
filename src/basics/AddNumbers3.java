package basics;

import java.util.Scanner;
class AddNumbers3 {

    int hello = 10;

    public static void main(String[] args) {

        // Declaration
        int firstNumber;
        int secondNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstNumber:");
        firstNumber = scanner.nextInt();
        System.out.println("Enter secondNumber:");
        secondNumber = scanner.nextInt();

        addTwoNumbers(firstNumber, secondNumber);
        subtractTwoNumbers(firstNumber, secondNumber);
        multiplyTwoNumbers(firstNumber, secondNumber);
        divisionTwoNumbers(firstNumber,secondNumber);
        AddNumbers3 addNumbers3 = new AddNumbers3();
        System.out.println(addNumbers3.hello);

    }

    public static void addTwoNumbers(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("addition is " + result);
    }

    // Subtraction
    public static void subtractTwoNumbers(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("subtract is " + result);
    }

    // Multiplication
    public static void multiplyTwoNumbers(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("multiply is "+result);
        }
        //Division
    public static void divisionTwoNumbers(int number1, int number2) {
        if (number2 ==0) {
            System.out.println("cannot divide by zero");
            return;
        }
        int result = number1 / number2;
        System.out.println("division is " + result);
    }

    public void accessGlobal() {
        System.out.println("Printing.." + hello);
    }
    }