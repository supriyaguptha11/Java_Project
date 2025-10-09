package strings;

public class LaunchMutableString1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java");
        System.out.println(sb1);
        sb1.append(" Spring");// JavaSpring  // same string object getting changed
        System.out.println(sb1);
        sb1.append( 45.4);  //Java Spring45.4 //  we can take any type like boolean, int, double, float
        sb1.append(true); // Java Spring45.4true //same string object getting changed
        System.out.println(sb1);

    }

}
