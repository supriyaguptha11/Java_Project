package basics;// Print numbers in reverse order.
// I/P : Ask user for n value eg: 10
// O/P : 10 9 8 7 6 5 4 3 2 1  (Print numbers in reverse order from n to 1.)

// eg i/p: 8
// o/p : 8 7 6 5 4 3 2 1

// eg i/p: 5
// o/p : 5 4 3 2 1

// eg i/p : 4
// o/p : 4 3 2 1

// for loop
// first portion of the for loop is initialization. means you need to provide the value which should start in the output value.
// second portion of the for loop is condition. means you need to provide the condition which satisfies all the o/p values till end value of the output.
// third portion of the for loop is update (increment or decrement) decide whether increment or decrement based on output behaviour.

import java.util.Scanner;

public class PrintNumbersInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value : ");
        int number = scanner.nextInt();
        System.out.println("reverse order : ");
        for(int i = number; i>=1; i--){
            System.out.print("  " + i);
        }
    }
}
