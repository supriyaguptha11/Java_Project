package streamAPI;
// once stream is consumed you cannot reuse that stream
// in our case example streamData1 is already in use, so you cannot reuse it
// one operation at a time to a stream
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(5);
        list.add(72);
        list.add(18);
        list.add(12);
        list.add(44);
        System.out.println(list);
//        Collections.sort(list); // we are sorting the data, but it affects the actual data
//        System.out.println(list);
        //create a Stream of collection, so that it won't affect the original collection

//        Stream<Integer> streamData1 = list.stream();
//        Stream<Integer> sortedStream = streamData1.sorted();
//        Stream<Object> streamData2 = sortedStream.map(n->n*2);
//        streamData2.forEach(n-> System.out.println(n));

      // sortedStream.forEach(n-> System.out.println(n));

        list.stream()
        .sorted()
        .map(n->n*2)
        .forEach(n-> System.out.println(n));


        String n = "ALIEN";
        int length = n.toLowerCase()
              .toUpperCase()
              .concat("JAVA")
              .length();





       // System.out.println(list);
    }
}
