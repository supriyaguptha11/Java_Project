package collections.generics;

import java.util.ArrayList;
import java.util.List;

class Human
{
    int age;
    public void disp()
    {
        System.out.println("Humans are best creature");
    }
}
class Student extends Human
{

}
class Employees
{

}


public class LaunchGenericsUpperBound
{
    public static void main(String[] args) {

     Object obj = new Object();
     String s1 = new String("Alien");

     obj = s1; //  storing whatever there is string storing in object as it is a parent

     //   s= obj; // not possible directly parent to child u can downcast it

        Human h = new Human();

        Student s = new Student();

        h=s;
       // s=h; // compile time error, else downcast

//        ArrayList<Human> hlist1 = new ArrayList<>();
//        ArrayList<Student> slist1 = new ArrayList<>();
//
//        hlist1 = slist1; //not allowed


//        ArrayList<?> hlist2 = new ArrayList<>();  // ? is unknown type or wild card
//        ArrayList<Student> slist2 = new ArrayList<>();
//        hlist2 = slist2;  // allowed bcz unknown type is , any type
//
//
//        ArrayList<? extends Human> hlist3 = new ArrayList<>();  // upperbound,// human type or child of human
//        ArrayList<Student> slist3 = new ArrayList<>();
//        ArrayList<Employees> elist3 = new ArrayList<>();   // if want to add employees
//        hlist3 = slist3;
//       // hlist3 = elist3; //  no relation between employee and human so not possible
//
//        ArrayList<Object> olist3 = new ArrayList<>();
     //   hlist3 = olist3; object is not a child its parent type so not allowed



//        ArrayList<?> hlist4 = new ArrayList<>();
//        ArrayList<Employees> elist4 = new ArrayList<>();
//
//        hlist4 = elist4;  // no relation btw human and employees still allowed bcz it wild card/ unknown type


//
//        ArrayList<? super Human> hlist3 = new ArrayList<>();  // lowerbound // either human or parent of human
//        ArrayList<Student> slist3 = new ArrayList<>();
//        ArrayList<Employees> elist3 = new ArrayList<>();
//        ArrayList<Object> olist3 = new ArrayList<>();


      //  hlist3 = elist3; // not allowed
     //  hlist3 = slist3; // bcz student is child
      //  hlist3 = olist3; // allowed bcz object is parent of human



//        ArrayList<Human> hlist3 = new ArrayList<>();
//        hlist3.add(new Human());
//        hlist3.add(new Human());
//        hlist3.add(new Human());
//        invokeDisp(hlist3);

        ArrayList<Student> slist3 = new ArrayList<>();
        slist3.add(new Student());
        slist3.add(new Student());
        slist3.add(new Student());
        invokeDisp(slist3);

    }
    public static void invokeDisp(List<? extends Human>list) // human or child of human
//    public static void invokeDisp(List< Human>list) // only human
    {
        for (Human h : list)
        {
            System.out.println(h);
        }

    }



}
