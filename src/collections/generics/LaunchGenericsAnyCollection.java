package collections.generics;

import basics.Array;

import java.util.*;

public class LaunchGenericsAnyCollection {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(); // Parent of arraylist is list

  //    List<Integer>list2 = new LinkedList<>(); //LinkedList has properties of list and Deque, but we gave List has parent type ,so it doesn't have deque properties


        List<Integer> l=Arrays.asList(10,20,30,40); // creates collection of List ArrayList

    }
    public static Iterable<Integer> getIntergers()
    {
    //    return new ArrayList<Integer>(); // we can return any collection bcz Iterable is parent of all collections
        return new TreeSet<Integer>(); // allowed of any collection
    }

    public static List<Integer> getInteger()
    {
        return new ArrayList<Integer>();  // allowed ArrayList is child of List
      //  return new TreeSet<Integer>();  // not allowed bcz its List type
    }






}
