package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// if target class is not  available or accessible, and you want to sort then use Comparator
// in Comparator the method we use is compare and pass two objects bcz its being implemented outside the target class
class Cricketer
{
    int age;
    String name;
    double avg;

    public Cricketer(int age, String name, double avg) {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }
}

// 3 ways to implement interface 1.implements 2.anonymous inner class 3.lambda

// for sorting , we sre using comparator

class Alpha implements Comparator<Cricketer>
{
    @Override
    public int compare(Cricketer o1, Cricketer o2) //  here need to pass two objects bcz its implementing outside target class
    {
        if (o1.avg> o2.avg)
            return 1;
        else
            return -1;
    }
}

public class LaunchCollectionsSortingComparator {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(35,"Virat",88.8);
        Cricketer c2 = new Cricketer(36,"Rohit",68.8);
        Cricketer c3 = new Cricketer(39,"Dhoni",78.8);

        ArrayList<Cricketer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);

    //    Collections.sort(list);

//        Alpha a = new Alpha();
//        Collections.sort(list,a);
 //       System.out.println(list);

        // another way of implementation - anonymous

//        Comparator<Cricketer> c = new Comparator<Cricketer>() {
//            @Override
//            public int compare(Cricketer o1, Cricketer o2) {
//                if (o1.avg> o2.avg)
//                    return 1;
//                else
//                    return -1;
//            }
//        };
        // lambda
        Comparator<Cricketer> c = (Cricketer o1, Cricketer o2)->{
            if (o1.avg> o2.avg)
                return 1;
            else
                return -1;
        };

        Collections.sort(list,c);
        System.out.println(list);

    }
}
