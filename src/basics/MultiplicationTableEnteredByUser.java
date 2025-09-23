package basics;//multiplication table of a number entered by the user (from 1 to 10).

import java.util.Scanner;

public class MultiplicationTableEnteredByUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number*i));
        }
    }
}
