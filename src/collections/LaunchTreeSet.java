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

        System.out.println(ts.ceiling(65)); // nearest higher value in your collection, check for 65 if present prints 65 , if not there then prints nearest higher value
        System.out.println(ts.higher(65));  // nearest higher value in your collection, not check for 65 present or not just give the higher value near to 65

        System.out.println(ts.floor(45)); // lower value , check 45 there or not , if not there prints nearest lower value
        System.out.println(ts.lower(45)); // lower value , don't check whether 45 there or not just prints the lower value near to 45

        System.out.println(ts.tailSet(75)); // [75, 100, 125, 150, 175]
        System.out.println(ts.headSet(75)); // [25, 50]
    }

}
