package java8N;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfosysPrac {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(9,8,1,6,2,4,9,6,3,2,2);
        //even
        List<Integer>even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        // System.out.println(even);

        //odd
        List<Integer>odd= list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        // System.out.println(odd);

        List<Integer> marks = Arrays.asList(45,90,34,98,67,89,56,45,23);
        List<Integer>passedStudents = marks.stream().filter(i->i>40).collect(Collectors.toList());
        // System.out.println(passedStudents);

        //give 10 grace marks to failedstudents
        List<Integer>graced = marks.stream().filter(i->i<40).map(i->i+10).collect(Collectors.toList());
        // System.out.println(graced);

        long ct = marks.stream().filter(i-> i<40).count();
        // System.out.println(ct);

        //sortList
        List<Integer>sort = marks.stream().sorted().collect(Collectors.toList());
        // System.out.println(sort);

        //sort in descending
        List<Integer>desc = marks.stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toList());
        // System.out.println(desc);

        List<Integer>desc1 = marks.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        // System.out.println(desc1);

        //max
        int max = marks.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        // System.out.println(max);

        int min = marks.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
        // System.out.println(min);

        //merge 2 list
        List<Integer>merge= Stream.concat(marks.stream(),list.stream()).sorted()
        .collect(Collectors.toList());
        // System.out.println(merge);

        //freq of each num
        Map<Integer,Long>freq = list.stream().collect(Collectors.groupingBy(
            num -> num,
            Collectors.counting()
        ));

        // System.out.println(freq);


        List<String>str = Arrays.asList("apple", "ball", "cat", "dog", "egg");
        Map<String,Integer>map = str.stream().collect(Collectors.toMap(
            word -> word,
            word -> word.length()
        ));
        System.out.println(map);

        // if contains duplicate then
        List<String>str1= Arrays.asList("apple", "ball", "cat", "dog", "egg","apple");
        Map<String,Integer>map1 = str1.stream().collect(Collectors.toMap(
            word -> word,
            word -> word.length(),
            (existing, newValue)->existing
        ));

        System.out.println(map1);

        List<String>count = Arrays.asList("one","two","three","four");
        String s = count.stream().collect(Collectors.joining(","));
        System.out.println(s);

        //9. Sum of all digit of a number
        int number = 12345;
        int sum = String.valueOf(number).chars().map(c->c-'0').sum();
        System.out.println(sum);


        String str2 = "apple";
        Map<Character,Long>fMap = str2.chars().mapToObj(c -> (char)c)
                    .collect(Collectors.groupingBy(
                        num->num,
                        Collectors.counting()
                    ));

        System.out.println(fMap);

    }
}
