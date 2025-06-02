package java8N;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8String {
    public static void main(String[] args) {
        List<String>str = Arrays.asList("apple","ball", "papaya","fish","cat","egg");
        
        //Create a map from a list of strings with string length as value
        //length of each string, 
        // this will throw error in case duplicate key
        Map<String,Integer>map = str.stream()
        .collect(Collectors.toMap(
            word -> word,
            word -> word.length()
            ));
            
            // System.out.println(map);
// output -> {papaya=6, apple=5, ball=4, egg=3, fish=4, cat=3}
        // to handle error in case duplicate key
        List<String>str1 = Arrays.asList("apple","ball", "apple","fish","cat","egg");
        Map<String,Integer>map1 = str1.stream().collect(
            Collectors.toMap(
                word-> word,
                word-> word.length(),
                (existing,newValue)->existing)
        );
        // System.out.println(map1);
//output -> {ball=4, apple=5, egg=3, cat=3, fish=4}
        //8. Join all strings with comma ----------------------------------------
        List<String>count = Arrays.asList("one ","two ","three ");
        String st = count.stream().collect(Collectors.joining(","));
        // System.out.println(st);// output -> one ,two ,three 





        //9. Group strings by their starting letter ----------------------------------------
        List<String>words = Arrays.asList("apple","ball", "apple","ant" ,"fish","cat","flag","bat" ,"egg");
        Map<String, List<String>> grouped = words.stream()
            .collect(Collectors.groupingBy(
             word -> word.substring(0, 1)
         ));

        //  System.out.println(grouped);


        Map<String, Long>freq = words.stream().collect(
            Collectors.groupingBy(
                word-> word,
                Collectors.counting()
            )
        );

        System.out.println(freq);

    }
}
