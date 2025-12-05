package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LaunchStream2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SpringBoot");
        list.add("Alien");
        list.add("Java");


        System.out.println(list);

        Set<String> set = list.stream().collect(Collectors.toSet());

       List<String> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list2);


    }

}
