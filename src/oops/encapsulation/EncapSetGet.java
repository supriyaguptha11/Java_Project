
// Encapsulation , setters and getters for private

package oops.encapsulation;
class Employee
{
    private int id;
    private String name;
    // setters are used to assign value by the outsider bcz its private
    void setId(int i)
    {
        id = i;
    }
    void setName(String n)
    {
        name = n;
    }
// getters are used to get the values to the outsider it means outside the class bcz of private
     int getId() {
        return id;
    }
    String getName(){
        return name;
    }
}
public class EncapSetGet {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(4);                       // setting the value to id
        emp.setName("Krishna");
        System.out.println(emp.getId());      // printing it using get
        System.out.println(emp.getName());

    }
}
