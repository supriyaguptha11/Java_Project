package strings;

public class LaunchString1 {
    public static void main(String[] args) {
        // direct value(literal)
//        String str1 = "Telusko";
//        String str2 = "Telusko";
//        System.out.println(str1 == str2);  // true
//        System.out.println(str1.equals(str2)); // true  // here it compares string data



        // using the new keyword
//        String str1 = new String("Telusko");
//        String str2 = new String("Telusko");
//        System.out.println(str1 == str2);  // false
//        System.out.println(str1.equals(str2)); // true , using .equals() // here it compares string data




//        String str1 ="Telusko";
//        String str2 = new String("Telusko");
//        System.out.println(str1.equals(str2));  // true
//        System.out.println(str1 == str2);       // false



        String str1 ="Telusko";
        String str2 ="telusko";
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1 == str2);
        System.out.println(str1.equalsIgnoreCase(str2));  //  true , bcz we are ignoring the case sensitivity






    }
}
