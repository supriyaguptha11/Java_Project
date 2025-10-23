package collections.generics;

import java.util.ArrayList;

class Employee{
    private int id;
    private String name;
    private  String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


class LaunchGenericsExample {
    public static void main(String[] args) {

        ArrayList <Employee> employee = new ArrayList<>();
        employee.add(new Employee(1,"Roopan", "Bengaluru"));
        employee.add(new Employee(2,"Roopesh", "Mumbai"));
        employee.add(new Employee(3,"Roop","Hyderabad"));

        for(Employee e : employee)
        {
            System.out.println(e);
        }

        // ArrayList<int> e = new ArrayList<>();  // primitive is not allowed

     //   ArrayList<Object> e = new ArrayList<Integer>(); // not allowed parent type and child is also not allowed

        ArrayList<Integer> e = new ArrayList<>(); // can use any wrapper class




    }
}
