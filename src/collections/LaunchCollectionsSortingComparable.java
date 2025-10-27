package collections;

import java.util.ArrayList;
import java.util.Collections;
// if target class is available, and you want to make any changes and want to perform sorting then use Comparable
// in Comparable the method we use is compareTo and pass only one object bcz its implemented in the target class only

class Cricketer1 implements Comparable<Cricketer1>
{
    int age;
    String name;
    double avg;

    public Cricketer1(int age, String name, double avg) {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Cricketer1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }

    @Override
    public int compareTo(Cricketer1 o) // one parameter bcz its implementing in the same target class and can use this keyword
    {
        if(this.avg >o.avg)
            return 1;
        else
            return -1;
    }
}

public class LaunchCollectionsSortingComparable {
    public static void main(String[] args)
    {
        Cricketer1 c1 = new Cricketer1(35,"Virat",88.8);
        Cricketer1 c2 = new Cricketer1(36,"Rohit",68.8);
        Cricketer1 c3 = new Cricketer1(39,"Dhoni",78.8);

        ArrayList<Cricketer1> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

    }
}
