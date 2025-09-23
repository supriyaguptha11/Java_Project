package patternproblems;

import java.util.Scanner;

public class PatternProblem5PrintOWithoutCorners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        for(int i = 0; i <= n-1; i++){
            for(int j = 0; j <= n-1; j++){
             if((i == 0 && j > 0 && j < n-1)|| (j == 0 && i > 0 && i < n-1) || (i == n-1 && j > 0 && j < n-1)
                     || (j == n-1 && i < n-1 && i > 0)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
