package map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;

class Passport
{
    private String name;
    private String city;
    private String country;

    public Passport(String name, String city, String country) {
        super();
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}





public class MapApplication {
    public static void main(String[] args) {
        System.out.println("Passport Information application");
      Passport pass1 =  new Passport("Rohan","Bengaluru", "India");
      Passport pass2 =  new Passport("Rohit","Mumbai", "India");
      Passport pass3 =  new Passport("Rahul","Calgary", "Canada");


     Integer id1= Integer.valueOf(101);
     Integer id2= Integer.valueOf(201);
     Integer id3= Integer.valueOf(301);

        HashMap<Integer, Passport> hm = new HashMap<>();
        hm.put(id1,pass1);
        hm.put(id2,pass2);
        hm.put(id3,pass3);

      //  System.out.println(hm);

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly enter your passport number");
        Integer userN = scan.nextInt();

        Set entry =hm.entrySet();
        Boolean flag = false;
        Iterator itr = entry.iterator();
        while(itr.hasNext())
        {
            Map.Entry keyValue = (Map.Entry) itr.next();
            Integer key = (Integer) keyValue.getKey();
            if(userN.equals(key))
            {
                System.out.println("Please find your passport details below");
                System.out.println(keyValue.getValue());
                flag = true;

            }

        }
        if(flag == false)
        {
            System.out.println("Unable to fetch your information based on passport id given");
        }
    }
}
