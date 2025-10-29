package map;

import java.util.TreeMap;
// gives you in sorted order based on key
// key cannot be null
// value can be null

public class LaunchTreeMap {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(1,"Spring");
        tm.put(3,"Hibernate");
        tm.put(2,"Alien");

     //   tm.put(null,"Java"); //  key cannot be null
        tm.put(4,null); //  value can be null

        System.out.println(tm);
    }
}
