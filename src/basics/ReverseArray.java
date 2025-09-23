package basics;//If the user inputs a number (say, 20), and you want to print all even and odd numbers up to that number

import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the range : ");
        int number = scanner.nextInt();
        String evenNumber = " ";
        String oddNumber = " ";
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                evenNumber = evenNumber + i +" ";
            } else {
                oddNumber = oddNumber + i +" ";
            }
        }
        System.out.println("even number : " + evenNumber);
        System.out.println("odd number : " + oddNumber);


    }
}


