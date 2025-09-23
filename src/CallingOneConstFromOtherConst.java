
class Practice{
    int num1,num2;
    Practice()
    {
        super();
    }
    Practice(int num1, int num2){

         this.num1 = num1;
         this.num2 = num2;
        System.out.println("2 param ");
    }
    Practice(int num1){
        this(num1,55);         //one-argument constructor to call the two-argument constructor with a default value for num2 as 55 then you should pass both values directly
         this.num1 = num1;
        // num2 = 22;
        System.out.println("1 param");
    }
    void display()
    {
        System.out.println(num1);
        System.out.println(num2);
    }
}

public class CallingOneConstFromOtherConst {
    public static void main(String[] args) {
        Practice p1 = new Practice(4 , 5);
        p1.display();
        Practice p2 = new Practice(4);
        p2.display();
    }

}
