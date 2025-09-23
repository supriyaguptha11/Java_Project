package basics;

import java.util.Scanner;

/*
Ask the user for three values
First number indicate the Multiplication table number
Second number indicates the From where the table start
Third number indicates till when the multiplication table prints

IP:
3
5
10

3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
 */
public class PrintTableFromDesiredStartAndEndNumberMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the table number : ");
        int tableNum = scanner.nextInt();
        System.out.println("Enter the start of the table :");
        int tableStart = scanner.nextInt();
        System.out.println("Enter the end of the table : ");
        int tableEnd = scanner.nextInt();
        for ( int i = tableStart;i <= tableEnd; i++ ){
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }
    }
}
