package basics;//print even numbers and remaining numbers as odd numbers in given range by creating 2 separate "for" loops

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Even numbers: ");
        for(int i=0;i < 10;i++){
            if(i % 2 ==0){
                System.out.print(" " +i);
            }

        }
        System.out.println("\nodd numbers: ");
        for(int i=0; i<10; i++){
            if(i % 2 !=0){
                System.out.print(" " +i);
            }
        }
    }
}
