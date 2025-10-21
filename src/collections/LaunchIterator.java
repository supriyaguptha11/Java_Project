package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LaunchIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        System.out.println(al);
        Iterator itr = al.iterator();
        // while -as long as there is data
        while(itr.hasNext()) // it will check the data is there or not
        {
            System.out.println(itr.next()); // the next method will take the cursor to the next step and fetch the data
        }

    }
}
