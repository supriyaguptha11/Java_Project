package collections;

import java.util.PriorityQueue;

// family of queue
// it follows min-heap DS
// the root node is the highest priority
// detailed explanation how data is stored refer notes
// min-heap means minimum should be the top priority
// Duplicates are allowed in PriorityQueue



public class LaunchPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        System.out.println(pq);
        pq.add(125);
    //    pq.add(null); // null is not allowed we get NullPointerException
        System.out.println(pq);


    }
}
