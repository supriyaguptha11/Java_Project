package basics;

//parameterized constructor
public class Student {
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println(name+" " + age);
    }
    public static void main(String[]args){
        Student p =new Student("krishna",21);
        p.display();
    }
}

