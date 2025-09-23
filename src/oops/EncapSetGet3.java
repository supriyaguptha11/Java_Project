package oops;
// name conflict between local variable and instance variable called shadowing
class Learner
        {
           private int id;  // Instance variable
           private String name; // Instance variable
           private String city;  // Instance variable
            void setId(int i)
            {
                id = i;                    // take different local variable name and assign to instance variable
            }
           // void setName(String name) // local variable
           // void setName(String n)
            void setName(String name)  // local variable
            {
                //name = name;          // right side local variable im assigning to left side instance variable with same name so,
                // name = n;               //  compiler will come and get confuse what to assign and not assign any value
                 this.name = name;
            }                            // so, only default values will print, now "this" keyword comes into picture
                                           // this keyword it refers to currently running object. no problem occurs
            void setCity(String city)
            {
                //city = city;
                this.city = city;
            }
            int getId()
            {
                return id;
            }
            String getName()
            {
                return name;
            }
            String getCity()
            {
                return city;
            }


        }
public class EncapSetGet3 {
    public static void main(String[] args) {
        Learner learner = new Learner();
        learner.setId(1);
        learner.setName("Priya");
        learner.setCity("Hyderabad");
        int id = learner.getId();               // here we are assigning to id and print it in next line using sout
        System.out.println("The id is " + id);
        System.out.println("The name is " + learner.getName());
        System.out.println(learner.getCity());  // without assigning we are printing it

        // we can create multiple objects for one class, we have class name as learner and creating another object for that class
        Learner learner2 = new Learner();
        learner2.setId(2);
        learner2.setName("krishna");
        learner2.setCity("mahabubnagar");
        int id2 = learner2.getId();               // here we are assigning to id and print it in next line using sout
        System.out.println("The id is " + id2);
        System.out.println("The name is " + learner2.getName());
        System.out.println(learner2.getCity());

    }
}
