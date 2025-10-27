package lamda;
/// this works only with interface and only one method that is called Functional Interface
//Functional Interface  -  a interface which has only one method
// normal interface - we can have multiple methods
// if we give multiple methods it will confuse like which one to go bcz we are not mentioning any method name while creating object

 interface P
{
    void show();
}

//class R extends P{
//    @Override
//    public void show() {
//        System.out.println("B in show");
//    }
//}
public class LamdaExperession {
    public static void main(String[] args) {
//        P obj = new P(); //  general way of creating object
//        P obj1 = new R() {
//            public void show() {
//                System.out.println("B in show");
//            }
//        };          // another way of overriding while creating

  // now lets go with lambda expression
        P p1 = () -> System.out.println("lambda in show");
        p1.show();
    }
}
