package collections;
import java.util.ArrayDeque;

// family of Queue and index based insertion is not allowed
// it follows Double-ended queue DS
// we can add data first or last but index based is not allowed
// order of insertion is preserved -means it will give the order the way you entered
// Duplicates are  allowed in ArrayDeque

public class LaunchArrayDeque {


    public static void main(String[] args) {

        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        System.out.println(ad);

        ad.add(40);
     //   ad.add(null); // null is not allowed we get NullPointerException
        System.out.println(ad);





    }
}
