package collections;
// we can store any type of data in collection ,it stores data as objects
// if we add data it will grow , if we remove it will shrink
// suitable for insertion of data at rare-end
// order of insertion is preserved -means it will give the order the way you entered
// duplicates allowed in the arraylist

import java.util.ArrayList;

public class LaunchArrayList {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(35.5);
        al.add("Java");
        al.add('c');
        al.add(true);
       // System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(0,44); // add 44 at 0th location , 10 will shift to 1st position and 20 will shift to 2nd location

        al2.addAll(al);  // this will add all data at the rare-end
        System.out.println(al2);
        System.out.println(al2.contains(20));
        System.out.println(al2.containsAll(al));
//        al2.remove(0);
//        System.out.println(al2);
        al2.add(10);
    //    al2.add(null); // null is allowed
        System.out.println(al2);



    }
}
