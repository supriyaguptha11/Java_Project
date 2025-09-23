package array;

import java.util.Arrays;

class Telusko
{
    String courseName;
    int courseCost;
    String city;
}

public class LaunchArray4 {
    public static void main(String[] args) {
//        Telusko t = new Telusko();
//        System.out.println(t);
//        System.out.println(t.getClass().getName());
//        System.out.println("***********");
//
//
//        int a[] = new int[4];
//        System.out.println(a);
//        System.out.println(a.getClass().getName());
//
//
//        int ar[][] = new int[4][2];
//        System.out.println(ar.getClass().getName());



// To sort an array using for each loop
        int array[] = {4,5,2,3,};
        for(int elem : array){
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println("**************");

        Arrays.sort(array);

        for(int elem : array){
            System.out.print(elem + " ");
        }
        System.out.println();



    }
}
