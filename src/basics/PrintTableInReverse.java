package basics;/*
Print table in reverse for the number entered by user:
I/P: 3
O/P:
3 x 10 = 30
3 x 9 = 27
3 x 8 = 24
3 x 7 = 21
3 x 6 = 18
3 x 5 = 15
3 x 4 = 12
3 x 3 = 9
3 x 2 = 6
3 x 1 = 3
 */
import java.util.Scanner;

public class PrintTableInReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        for(int i = 10; i >= 1; i--){
            System.out.println(num + " x " + i + " = " + (num *i));
        }
    }
}
