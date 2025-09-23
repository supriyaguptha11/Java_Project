package basics;// multiples of 3

public class ForLoop3 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
