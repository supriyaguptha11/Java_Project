package basics;/*
Ask the user to enter the table number and limit value
I/P
Enter the number : 3
Enter the limit value : 15

// Print table in a reverse order:
3 x 15 = 45
3 x 14 = 42
3 x 13 = 39
3 x 12 = 36
...
3 x 1 = 3

O/P

 */

import java.util.Scanner;

public class PrintTableInReverseFromDesiredValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();
        System.out.println("Enter the limit value :");
        int limitNum = scanner.nextInt();
        for(int i = limitNum; i >= 1;i--){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
