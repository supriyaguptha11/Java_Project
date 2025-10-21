package collections;

import java.util.LinkedList;

// LinkedList has two interfaces List Interface and DequeueInterface
// Internally follow DoublyLinkedListDs
// it doesn't need contagious memory allocation
// here the data will not shift to other allocations ,instead a new node will be created and linked to previous node
// only linking happens here
// order of insertion is preserved -means it will give the order the way you entered
// Duplicates allowed in the linkedList

public class LaunchLinkedList {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(10);
        ll1.add("Spring");
        ll1.add("Hyderabad");
        ll1.add(20);
     //   System.out.println(ll1);
        ll1.addFirst(44);
        ll1.addLast(55);
        ll1.add(2,"Java");
  //      System.out.println(ll1);
        ll1.offer("DevOps"); // adds data at the rare-end // but the data might get added or rejected if there is any problem in memory
     //   System.out.println(ll1);

        ll1.offerFirst("Spring Boot");
        System.out.println(ll1);

        System.out.println(ll1.peek()); // it will copy the first element and give us, won't delete it
        System.out.println(ll1);

        System.out.println(ll1.poll()); // it will remove the first element and give us
        System.out.println(ll1);

        ll1.add("Java");
        System.out.println(ll1);

    }
}
