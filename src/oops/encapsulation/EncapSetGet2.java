package oops.encapsulation;

class Student
{
   private int id;
   private String name;
    void setId(int i){
        id = i;
    }
    void setName(String n)
    {
        name = n;
    }
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }

}
public class EncapSetGet2 {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(1235);
        st.setName("Kris");
        System.out.println(st.getId());
        System.out.println(st.getName());

    }
}
