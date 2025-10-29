package map;

// data is stored in the form of key value pair
// key can be of object type which is any type and value also can be of any type
// key must be unique , value need not be it can be duplicate
// key can be null and value also can be null
// order of insertion is not maintained
// key - value pair together is called as Entry
// key can't be duplicate
import java.util.HashMap;
import java.util.Hashtable;

class Alien
{
    private Integer id;
    private String courseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    public Alien(Integer id, String courseName) {
        super();
        this.id = id;
        this.courseName = courseName;
    }

    public Alien() {
        super();
    }
}




public class LaunchHashMap {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(1, "Java");
        hm1.put(2,"Spring");
        hm1.put(3,"Junit");

        System.out.println(hm1);

        Alien alien = new Alien(1, "Java");
        HashMap hm2 = new HashMap();
        hm2.put("Alpha","Java");
        hm2.put(alien,"SpringBoot"); // key - value
        hm2.put(4,"Microservices");
      //  hm2.put(4,"Microservices");
        hm2.put(5,"Microservices");  // key must be unique , value need not be

        hm2.put(null,"microservices"); // key can be null with respect to hashmap
        hm2.put(6, null); // value can also be null
        
        System.out.println(hm2);

        //Generics

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"Java"); // Entry
        hm.put(2,"SpringBoot");
     //   hm.put("Java","Junit");  // key and value are fixed bcz od generics
        System.out.println(hm);


        //Hash table


        Hashtable ht = new Hashtable();
        ht.put(1, "ALien");
        ht.put(2,"Alien"); //  key cant be duplicate
       // ht.put(null,"Spring"); //  key cannot be null
      //  ht.put("Hibernate",null); // value cannot be null

        System.out.println(ht);




    }
}
