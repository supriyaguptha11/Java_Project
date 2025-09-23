package basics;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number : ");
        int secondNumber = scanner.nextInt();
        int start;
        int end;
        if(firstNumber > secondNumber) {
            start = secondNumber;
            end = firstNumber;
        }else{
            start = firstNumber;
            end = secondNumber;
        }
        for(int i = start+1;i< end;i++){
            System.out.println(i);
        }
    }

}

