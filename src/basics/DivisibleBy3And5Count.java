package basics;

public class DivisibleBy3And5Count {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                count++;
            }
        }

        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}

