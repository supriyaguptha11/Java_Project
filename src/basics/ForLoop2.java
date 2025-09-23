package basics;

//  How do you write a for loop that prints only even numbers between 1 and 20?
public class ForLoop2 {
    public static void main(String[] args) {
        System.out.println("Even numbers");
    for(int i=2;i <= 20;i++){
        if(i % 2 ==0)
        {
            System.out.print(i + " " );
        }
    }
    }

}
