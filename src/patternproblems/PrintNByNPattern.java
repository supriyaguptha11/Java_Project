package patternproblems;

import java.util.Scanner;

/*
// User enters a number
// Print n*n matrix with *
// I/P : 6
// O/P:
******
******
******
******
******
******
 */
public class PrintNByNPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}