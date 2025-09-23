package array;

import java.util.Arrays;

public class LaunchForEachArray {
    public static void main(String[] args) {
//        int a[] = {2,5,7,9};

        // Traditional for loop approach
//        for(int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }
//        System.out.println("*********");
//
//        // for each loop approach
//        for( int elements : a) {
//            System.out.println(elements);
//        }
//        int ar[][] = {{4,5,6},{3,4,5}};

// multiple dimensions

//        int ar[][] = {{4,5,6},{3,4,5}};
//
//        //traditional approach
//        for(int i = 0; i < ar.length; i++){
//            for(int j = 0; j < ar[i].length; j++){
//                System.out.print(ar[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//
//        System.out.println("*********");
//        // for each approach for 2 dimensional array  for(int row[]: ar)  for row"[]" is mandatory for 2D
//
//        for( int row[]: ar){
//            for( int elem : row){
//                System.out.print(elem + " ");
//
//            }
//            System.out.println();
//        }


        // reverse the array
        // traditional approach

        int a[] = {1,2,3,4};

        for(int i = a.length-1; i >= 0; i--){
            System.out.print(a[i]+ " ");
        }
        System.out.println();

//        // for each approach
//        for(int ele : a){
//            System.out.println(ele);
//        }  // we cannot modify it like traditional/general approach so, reverse a string is not possible


        // if we want only 2 numbers to print then we write as

        for(int i = 0; i < a.length-2; i++){
            System.out.print(a[i] +" ");
        }



    }
}
