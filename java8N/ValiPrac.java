package java8N;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValiPrac {
    public static void main(String[] args) {
        
        List<Integer> list =Arrays.asList(8,9,2,4,38,7,8,9,5);
        //1.remove duplicate
        List<Integer> unique = list.stream().distinct().toList();
        System.out.println(unique);

        //freq of each char
        String str = "apple";
        Map<Character,Long>freMap = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                    ch -> ch,
                    Collectors.counting()
                ));

            System.out.println(freMap);

        List<Integer>list2 = Arrays.asList(1,5,7,2,3,1,6,7,7,7,6,10);
        Map<Integer,Long>fMap = list2.stream().collect(Collectors.groupingBy(
            num -> num,
            Collectors.counting()
        ));
        System.out.println(fMap);

        // sort in ascending
        List<Integer>asc = list2.stream().sorted().toList();
        System.out.println(asc);

        // sort in desc
        List<Integer>desc = list2.stream().sorted((a,b)->a>b?-1:a<b?1:0).toList();
        List<Integer>desc1 = list2.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(desc1);

        //7. find max and min 
        int min = list2.stream().reduce(Integer.MAX_VALUE,(a,b)->a>b?b:a);
        System.out.println(min);

        int max = list2.stream().reduce(Integer.MIN_VALUE,(a,b)-> a>b?a:b);
        System.out.println(max);

        //merge 2 unsorted list to sorted
        List<Integer>merge = Stream.concat(list.stream(),list2.stream()).sorted().toList();
        System.out.println(merge);

        //sum of all digits of no
        int number = 12345;
        int sum = String.valueOf(number).chars().map(c->c-'0').sum();
        System.out.println(sum);
    }
}
