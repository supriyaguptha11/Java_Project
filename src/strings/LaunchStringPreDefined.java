// predefined methods
package strings;

public class LaunchStringPreDefined {
    public static void main(String[] args) {
        String str = "RajaRamMohanRoy";
        System.out.println(str.length());  // 15
        System.out.println(str.toLowerCase()); //rajarammohanroy
        System.out.println(str.toUpperCase());  //RAJARAMMOHANROY

        // from beginIndex where you want and endIndex from where you don't want
        System.out.println(str.substring(4,12));  //RamMohan
        System.out.println(str.substring(4));  //RamMohanRoy

        // character array
//        char ch[] = str.toCharArray();
//        for(char c:ch)
//        {
//            System.out.println(c);
//        }

        // to check the number at which position
        System.out.println(str.charAt(5));  // a
        System.out.println(str.concat("Ravi")); // RajaRamMohanRoyRavi
        // to check if it contains or not
        System.out.println(str.contains("Mohan")); // true
        System.out.println(str.startsWith("Raj")); // true
        System.out.println(str.startsWith("Roy")); // false
        System.out.println(str.indexOf("a")); // 1 it will give the starting index
        System.out.println(str.lastIndexOf("a")); // 10  it will give last index



    }

}
