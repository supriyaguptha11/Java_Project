package collections;

import java.util.ArrayList;
import java.util.Collections;

public class LaunchComparableComparator {
    public static void main(String[] args) {

        ArrayList <Integer>list = new ArrayList<>();
        list.add(100);
        list.add(50);
        list.add(150);
        list.add(25);
        list.add(75);
        list.add(125);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

    }
}
