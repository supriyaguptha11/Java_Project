package strings;

public class LaunchMutableString2 {
    public static void main(String[] args) {
      //  StringBuffer sb1 = new StringBuffer();
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); //16 //  Capacity is 16 characters
        sb1.append("Sachin"); // 6  characters
        sb1.trimToSize(); // here memory will not waste of allocating 16 charracters here

//        sb1.append(" Tendulkar India"); // 15 characters // 6 + 15 = 21 //
//        System.out.println(sb1); // Sachin Tendulkar India
//        System.out.println(sb1.capacity()); // 34 bcz old capacity * 2 + 2 ==> 16 * 2 + 2 = 34 characters is allocated for Sachin Tendulkar India
//        // if 34 are filled then again 34 * 2 + 2


    }
}
