package map;

import java.util.*;

interface Alpha
{
    interface Beta
    {
        static void disp()
        {
            System.out.println("Static method of an inner interface");
        }
    }

}




public class LaunchAccessingData {
    public static void main(String[] args) {
     //  Alpha.Beta.disp();

        HashMap <Integer, String> hm1 = new HashMap<>();
        hm1.put(1,"Java");// Entry inner interface of map
        hm1.put(2,"DSA");
        hm1.put(3,"Spring");

// printing the data
        System.out.println(hm1);
// Accessing the data
       String  data= hm1.get(3);
        System.out.println(data);

        System.out.println("**********");

       Collection<String> values=  hm1.values(); // to access all values
      Iterator<String> itr= values.iterator(); // accessing only values
      while(itr.hasNext())
      {
          System.out.println(itr.next());
      }
        System.out.println("********************");

      // accessing only keys

        Set<Integer> keys = hm1.keySet();
        Iterator<Integer> itr2 = keys.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }

        System.out.println("*************");

        Set entry=hm1.entrySet();// You get a Set of all entries — i.e., all key–value pairs. - entry
       Iterator itr3= entry.iterator();
       while(itr3.hasNext())
       {
          Map.Entry pair = (Map.Entry) itr3.next();
           System.out.println("Key : " + pair.getKey() + "  Value : " + pair.getValue());
       }


    }
}
