package patternproblems;

import java.util.Scanner;

// Ask user to print n number of stars
// I/P : 5
// O/P : *****
public class SimpleOneLinePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print("*");
        }
    }
}
