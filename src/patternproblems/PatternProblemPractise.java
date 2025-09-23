package patternproblems;

import java.util.Scanner;

public class PatternProblemPractise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("  ");
//        for(int i = n; i >= 1; i--){
//            for(int j = 1;j <= i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("  ");
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // move to next line
            System.out.println();

        }
    }
}

