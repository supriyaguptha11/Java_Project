package basics;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println("Input array before reversing" + num);
//        int[] num = {1,2,3,4};
        for(int i = 0; i<num.size()/2 ; i++){
            int temp = num.get(i);
            num.set(i, num.get(num.size()-i-1));
            num.set(num.size()-i-1, temp);
        }
        System.out.println("array after reversing" + num);

    }
}
