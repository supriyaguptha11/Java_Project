package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
// collection is dynamic it is not fixed size , it increases the size as you add the data
// to avoid the concurrent modification a package is created called Concurrent package sub package of Util package
// all the collection classes has renamed , earlier it was Arraylist now it is CopyOnArrayList, for linked list CopyOnLinkedList


public class LaunchFailSafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        System.out.println(al);

//        Iterator itr = al.iterator();
//
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//            al.add(44); // concurrent modification , fail-safe
//        }

 // ListIterator is same as iterator, but it has one advantage of printing in reverse
//        ListIterator litr =al.listIterator();
//        while(litr.hasNext())
//        {
//            System.out.println(litr.next());
//        }

        // in reverse order
        ListIterator litr =al.listIterator(al.size());
        while(litr.hasPrevious()) // reverse order
        {
            System.out.println(litr.previous());
        }


    }
}
