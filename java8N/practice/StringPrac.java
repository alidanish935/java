package java8N.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringPrac {
    public static void main(String[] args) {
        List<String>str = Arrays.asList("apple","ball", "papaya","fish","cat","egg");

        //Create a map from a list of strings with string length as value

        Map<String, Integer> map = str.stream().collect(Collectors.toMap(
            word -> word,
            word -> word.length()
            // but this logic will throw error in duplicate words
        ));
        // System.out.println(map);


        List<String> str1=Arrays.asList("apple","ball", "apple","fish","cat","egg");
        Map<String,Integer>map1 = str1.stream().collect(Collectors.toMap(
            word -> word,
            word -> word.length(),
            (existing,newValue) -> existing
        ));
        // System.out.println(map1);

        //8. Join all strings with comma ----------------------------------------
        String join = str1.stream().collect(Collectors.joining(","));
        // System.out.println(join);


        //9. Group strings by their starting letter ----------------------------------------
        List<String>words = Arrays.asList("apple","ball", "apple","ant" ,"fish","cat","flag","bat" ,"egg");
        Map<String,List<String>> grouped = words.stream().collect(Collectors.groupingBy(
            word -> word.substring(0, 1)
        ));
        // System.out.println(grouped);

        //count freq of each string
        Map<String, Long>freq = words.stream().collect(Collectors.groupingBy(
            word -> word,
            Collectors.counting()
        ));
        System.out.println(freq);


        // count the frequency of each character in a string using Java 8.
        String st = "apple";
        Map<Character,Long>freqChar = st.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(
                    ch ->  ch,
                    Collectors.counting()
        ));

        System.out.println(freqChar);

        List<Integer> arr = Arrays.asList(3,1,8,2,9,1,1,9);
        Map<Integer,Long> arrMap = arr.stream().collect(Collectors.groupingBy(
            num -> num,
            Collectors.counting()
        ));
        System.out.println(arrMap);
    }
}
