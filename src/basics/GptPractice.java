package basics;//Write a program to count how many numbers between 1 and 100 are divisible by 7, and print those numbers too.

public class GptPractice {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1;i <= 100; i++){
            if(i % 7 == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("The total count is : " + count);
    }
}
