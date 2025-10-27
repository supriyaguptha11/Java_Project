package collections;

import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollectionsSorting {
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

        System.out.println("*********************");
        ArrayList <String>list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Alien");
        list2.add("Spring");
        list2.add("Junit");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

    }
}
