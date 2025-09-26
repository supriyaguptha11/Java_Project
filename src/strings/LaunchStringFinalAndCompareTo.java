package strings;

public class LaunchStringFinalAndCompareTo {
    public static void main(String[] args) {
//        final String s1 = "Spring";
//        s1 = s1 + "Java"; //

//        final String s1 = "Spring";
//        String s2 = s1 + " Java";
//        System.out.println(s2);


 //CompareTo()  - Compares value of strings lexicographically

//        String s1 = "SACHIN";
//        String s2 = "SACHIN  ";
//       int res = s1.compareTo(s2);
//        System.out.println(res); // 0
//        // we can write logic also
//
//        if(res == 0)
//            System.out.println("Strings are equal ");
//        else
//            System.out.println("Strings are not equal");


        // it compares first char, if it is not equal it will not compare the second/third it will directly give the difference
        // between them in our case V ASCII value is 86 and D is 68 , so 86-68 = 18 , so, it returns 18
        // also Positive difference means String1 is greater
        String s1 = "VIRAT";
        String s2 = "DHONI";
        int res = s1.compareTo(s2);
        System.out.println(res);
        if(res == 0)
            System.out.println("Strings are equal ");
        else
            System.out.println("Strings are not equal");



// in this case S is 83 and S is 83 are same so, it moved to next character A is 65 and E is 69 , so it will stop here and not proceed further
        // so, 65 - 69 = -4 , negative difference which ,means string 4 is greater than string3
        String s3 = "SAURAV";
        String s4 = "SEWAG";
        int result = s3.compareTo(s4);
        System.out.println(result);

    }
}
