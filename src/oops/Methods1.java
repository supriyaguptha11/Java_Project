package oops;

//Types of Methods can be written

class Calculator {
    int num1, num2, res;
// Method without Parameters and Arguments
//    void add() {
//        int num1 = 10;
//        int num2 = 20;
//        int res = num1 + num2;
//        System.out.println("result is : " + res);
//    }

    // Method with parameters and arguments
    // if parameters passed then arguments must
//    void add(int num1, int num2){
//        res = num1 + num2;
//        System.out.println(res);
//    }

    // using return type no need to write void we need to specify the type which one we are returning in place of void
//    int add()
//    {
//        num1 = 6;
//        num2 = 10;
//        res = num1 + num2;
//        System.out.println(res);
//        return res;
//    }
    // another way of writing it
//    int add(){
//        num1 = 10;
//        num2 = 20;
//        res = num1 + num2;
//        return res;
//    }
// return type with parameters and arguments
    int add(int num1, int num2)
    {
        res = num1 + num2;
        return res;
    }


}
    public class Methods1 {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            //calc.add();
            //calc.add(10,5);
            //calc.add();
//            int result = calc.add();     // whatever the return value res, im storing it in result and printing it, call  method and capture the return value
//            System.out.println(result);

            int result = calc.add(10 , 8);
            System.out.println(result);


        }
    }

