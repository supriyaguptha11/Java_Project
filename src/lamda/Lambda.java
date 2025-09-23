package lamda;
// lambda expression is a replacement of anonymous inner class

interface Z{
    void show(String s);
}


@FunctionalInterface
interface Person1{
    int add(int x, int y);
}
// we dont want to use this implementation
//class PersonImpl implements Person1{
//    public int add(int x , int y){
//        return x + y;
//    }
//}



public class Lambda {
    public static void main(String[] args) {
//        Person1 p1 =  new Person1 (){
//            public int add(int x , int y){
//             return x + y;
//            }
//        };
// if we write with lambda

        Person1 p2 = (int x , int y) -> {    // lambda expression is a replacement of anonymous inner class
            return x + y;
        };

         // in more shorter way we can write like this also
        // Person1 p2 = (x, y) -> x + y;

        int result = p2.add(5,6);
        System.out.println(result);

        Z obj = new Z() {
            @Override
            public void show(String s) {
                System.out.println(s.length());
            }
        };
        obj.show("Telusko");
// to make it more shorter way we can write
        // Z obj = s -> System.out.println(s.length());



    }
}
