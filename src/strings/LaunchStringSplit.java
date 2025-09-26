package strings;

public class LaunchStringSplit {
    public static void main(String[] args) {
        // where there is a split it
//        String s1 = "RajaRamMohanRoy";
//        String[] str = s1.split("a"); // return type is array is String[] array
//        for(String s:str)
//        {
//            System.out.print(s); // RjRmMohnRoy
//        }
//        System.out.println();
//
//
//// where ever space is their split it
//        String s2 = "Raja Ram Mohan Roy";
//        String[] st = s2.split(" ");
//        System.out.println(s2.length()); // 18 , bcz it counting spaces also
//        System.out.println(st.length); // here it's taking Raja has 1 string Ram as 2 , Mohan as 3 Roy as 4, so 4 is the length
//                                       // Raja 0th index, Ram 1st Index, Mohan 2nd Index, Roy 3rd Index , so length is 4
//        for(String s:st)
//        {
//            System.out.print(s); // RajaRamMohanRoy
//        }

// trim
        String s1 = "    Raja Ram Mohan Roy  ";
        System.out.println(s1); // prints with spaces
        System.out.println(s1.trim()); // removes spaces at first(leading) and last(trailing)
        System.out.println(s1.stripTrailing());  //  removes spaces at last (Trailing)
        System.out.println(s1.stripLeading());  // it removes leading spaces means first spaces




    }
}
