package patternproblems;

import java.util.Scanner;

public class PatternProblemADiagonally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        for(int i = 0;i < n ; i++){
            for(int j = 0;j < n; j++){
                if(i + j ==(n-1)/2 || j - i == (n-1)/2 || i == (n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
