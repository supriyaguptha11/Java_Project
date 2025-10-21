package collections;
import java.util.ArrayList;
import java.util.Iterator;

// collection is dynamic it is not fixed size , it increases the size as you add the data


public class LaunchAccessingData {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
//        al.add(100);
//        al.add(35.5);
//        al.add("Java");
//        al.add('c');
//        System.out.println(al);
//        double d = (double) al.get(2); // downcast
//        System.out.println(d);

        // it is advised to use same type of data


        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        System.out.println(al);
        // for loop to print them

//        for(int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//        }
        // except arraylist and linked list other won't support for index based accessing

        // for each loop

//        for( Object o :al)
//        {
//            System.out.println(o);
//        }
//
//        for(int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//            al.add(45);  // concurrent modification , here 45 keeps adding until ram is full because its in loop
//        }
// for loop can't understand structural modification and concurrent modification
        // so use iterator

       Iterator itr = al.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
           al.add(44);  // concurrent modification , still we got exception and our program failed fast mechanism
       }

       // now i want to fail safely,  ConcurrentModificationException should not be generated this mechanism called fail-safe










    }
}
