package patternproblems;

import java.util.Scanner;

public class PatternProblem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextByte();
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || i == n-1 || i ==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
//           System.out.print("   ");
//            for(int j = 5; j > 0; j--){
//                if( i == 0 || j >= 0){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }


            System.out.println();



        }
    }
}
