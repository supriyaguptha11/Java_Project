package basics;

//print even numbers and remaining numbers as odd numbers in given range using if-else
// print even numbers and odd numbers upto 50
public class EvenOrOdd {
    public static void main(String[] args) {
        String evenNumbers=" ";
        String oddNumbers=" ";
    for(int i=1; i< 50; i++){
        if(i % 2 ==0){
            evenNumbers = evenNumbers + i +" ";
        }else{
            oddNumbers = oddNumbers + i + " ";
        }
    }
        System.out.println("even numbers:" +evenNumbers);
        System.out.println("odd numbers:" +oddNumbers );

    }
}
