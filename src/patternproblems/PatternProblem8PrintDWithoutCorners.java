package patternproblems;

import java.util.Scanner;

public class PatternProblem8PrintDWithoutCorners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j < n-1 || j == 0 || i == n-1 && j < n-1 || j == n-1 && i > 0 && i < n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
