
//using + operator if we add direct string literal/object memory will be in the string constant pool
// using + operator for references then memory will be in the heap area
// using concat method direct string object/literal or string references the memory will be created in the heap area
package strings;

public class LaunchStringConcat {
    public static void main(String[] args) {
        // if you try to add something,same string will not grow or shrink rather a new string will be created ,
        //existing string object will not change in the memory
//        String str1 = "Telusko";
//        System.out.println(str1);
//        str1 = str1.concat(" Alien");
//        System.out.println(str1);

//        String str1 = "Telusko";
//        System.out.println(str1);
//        String str2 = str1.concat(" Java");
//        System.out.println(str2);

//          String str1 = "Telusko";
//          System.out.println(str1);
//          String str2 = str1.concat(" Alien");
//          String str3 = str1 + str2;
////          System.out.println(str2);
////          System.out.println(str3);
//        System.out.println(str2 == str3); // false


// using (+) we can add any number of strings but in (concat) we can add only two number of strings
//        String s1 = "Telusko " + "Java "+"Spring boot "+ "Microservices";
//        System.out.println(s1);


        // anything added to a string is a string
        // to a string anything you concatenate it will become string
//         s = "Spring boot "+ 2500 + 3900 + 4500;
//        System.out.println(s);   // o/p Spring boot 250039004500

        // here first + is there is it adds next string
        String s1 = 45 + 55 + " Spring Boot";
        System.out.println(s1); // o/p 100 Spring Boot

    }
}
