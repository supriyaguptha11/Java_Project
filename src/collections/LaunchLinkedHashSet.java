package collections;

import java.util.LinkedHashSet;
// it will maintain the order of insertion
// in which order you enter it will print in same order
// order of insertion + hashing = LinkedHashSet

public class LaunchLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(50);
        lhs.add(150);
        lhs.add(25);
        lhs.add(75);
        lhs.add(125);
        lhs.add(175);
        System.out.println(lhs); // [100, 50, 150, 25, 75, 125, 175]

    }
}
