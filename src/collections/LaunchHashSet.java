package collections;

// it will search in that particular bucket only , it doesn't perform entire search
// it has some formulae that it stores in that particular bucket only and searches also in particular bucket only.
// even if there are 100 elements still the search operations happens only one time
// the search operation is O(1)
// if 75% of that bucket is filled in that hash table that the size will increase to double
// it doesn't even consider the duplicates
import java.util.HashSet;

public class LaunchHashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);
        System.out.println(hs);
        hs.add(50);
        //hs.add(null); // null is allowed
        System.out.println(hs);


    }
}
