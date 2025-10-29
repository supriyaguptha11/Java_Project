package map;

import java.util.Hashtable;

// key cannot be null
// value cannot be null

public class LaunchHashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1, "ALien");
        ht.put(2,"Alien"); //  key cant be duplicate
        // ht.put(null,"Spring"); //  key cannot be null
        //  ht.put("Hibernate",null); // value cannot be null

        System.out.println(ht);
    }
}
