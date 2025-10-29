package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
// no difference between hash map and linked hashmap
// linked hash map is a child class of hash map
class Beta
{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beta{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Beta(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Beta() {
        super();
    }
}



public class LaunchLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("Alien","Java");
        Beta beta = new Beta(1, "Java");

        lhm.put("Alpha","Java");
        lhm.put(beta,"SpringBoot"); // key - value
        lhm.put(4,"Microservices");
        //  hm2.put(4,"Microservices");
        lhm.put(5,"Microservices");  // key must be unique , value need not be

        lhm.put(null,"microservices"); // key can be null with respect to hashmap
        lhm.put(6, null); // value can also be null

        System.out.println(lhm);

    }
}
