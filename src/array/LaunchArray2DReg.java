package array;
// 2D or 2 Dimensional regular array
// class 0, 1, 2 and students are 4, 4, 4
// it is fixed that it has 4 students for each class, so write as marks[3][4]

import java.util.Scanner;

public class LaunchArray2DReg {
    public static void main(String[] args) {
        int [][]marks = new int  [3][4];
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
