package basics;

// Count how many numbers between 1 and 100 are divisible by both 3 and 5
public class DivisibleByBoth3And5Count {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i <= 100; i++){
            if((i % 3 == 0) && (i % 5 ==0)){
                count++;
                System.out.println(i); //numbers that are meeting both condition

            }
        } System.out.println(count); // prints total count

    }
}
