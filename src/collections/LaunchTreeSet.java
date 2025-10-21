package collections;

import java.util.TreeSet;

// stores the data in sorted order automatically
// tree set is family of set interface
// balanced binary search tree
// index based insertion is not allowed
// Duplicates are not allowed in Tree set

public class LaunchTreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);

        ts.add(125);
        System.out.println(ts);
    }
}
