package collections.generics;

import java.util.ArrayList;
import java.util.Locale;

public class LaunchGenerics {
    public static void main(String[] args) {
        //typesafety int
        int ar[] = new int[3];

        ar[0] = 14;
        ar[1] = 24;
        ar[2] = 34;

        int data = ar[0];


        //typesafety string

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "Spring";
        str[2] = "Alien";
      //  str[3] = 44;  canot add int type nof data to string

        String info = str[1];


        //nottypesafety

        ArrayList al = new ArrayList();
        al.add("SpringBoot");
        al.add("Microservices");
        al.add("Java");
       // al.add(44);

        String s1 = (String) al.get(0);
        s1= s1.toLowerCase();
        System.out.println(s1);

        String s2 = (String) al.get(1);
        s2= s2.toLowerCase();
        System.out.println(s2);

        String s3 = (String) al.get(2);
        s3= s3.toLowerCase();
        System.out.println(s3);

//        String s4 = (String) al.get(3);
//        s4 =s4.toLowerCase();
//        System.out.println(s4);     // occurs Exception because the 3rd one is int type of data

       // typesafety
// type safety is achieved in collection using Generics
        ArrayList<String> list = new ArrayList<>();
        list.add("Generics");
        list.add("Microservices");
        list.add("Java");
       // list.add(10);  // compile time error that its int type of data

        for(String d:list)
        {
            System.out.println(d);
        }


    }
}
