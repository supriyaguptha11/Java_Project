package array;
// irregular array or jaggad array like different data , each class has different no. of students
// class 0 has 4, class 1 has 2, and class 2 has 3
// we declare array as int [][]marks = new int [3][]; , the last one is empty bcz we don't have fixed numbers
import java.util.Scanner;

public class LaunchArray2DIRR {
    public static void main(String[] args) {
        int [][]marks = new int [3][];
        marks[0] = new int[4];
        marks[1] = new int[2];
        marks[2] = new int[3];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < marks.length; i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                System.out.println("Kindly enter the marks of class " + i + " student " + j);
                marks[i][j]  = scan.nextInt();
            }
        }
        System.out.println("Marks stored in an array ");

        for(int i = 0; i < marks.length; i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }


    }
}

