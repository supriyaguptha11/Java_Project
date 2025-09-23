package basics;

import java.util.Scanner;

// Print n natural numbers
// I/P : Ask the user to enter desired integer value
// O/P : Print natural numbers from 1 to user entered integer value
public class PrintNaturalNumbersUptoN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        for(int i=1;i <= num ;i++){
            System.out.print(" " + i);
        }
    }
}
