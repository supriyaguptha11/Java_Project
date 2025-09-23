package array;

import java.util.Scanner;

public class LaunchArray1 {
    public static void main(String[] args) {
        int [] marks = new int[5];    // array

//        //marks [0] = 14;
//        marks [1] = 15;
//        marks [2] = 17;
//        marks [3] = 19;
        // we are repeating the same type of data so, instead of this we can use loops
        // here will take input from user

        Scanner scan = new Scanner(System.in);
        // for(int i = 0; i < marks.length; i++)  // marks.length is how many times the array is that many times you loop it
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Kindly enter the marks of student " + i);
            marks[i] = scan.nextInt();

        }
        System.out.println("Marks of students stored in an array : ");


        // Printing the array
        // for(int i = 0; i < marks.length; i++)  // marks.length is how many times the array is that many times you loop it

        for(int i = 0; i < 5; i++)
        {
            System.out.print(marks[i] + " ");  // what ever stored in marks[i] print it here.
        }
        System.out.println();   // next line


    }
}
