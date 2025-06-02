package java8N;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,9,2,4,7,5,1,6);
        List<Integer>evenList = list.stream().filter(i-> i%2 ==0).toList();
        // System.out.println(evenList);
        
        List<Integer>oddList = list.stream().filter(i -> i%2 != 0).toList();
        // System.out.println(oddList);

        List<Integer> marks = Arrays.asList(40, 90, 50, 30, 60, 80, 87,35);

        List<Integer> passedList = marks.stream().filter(i -> i>40).toList();
        // System.out.println(passedList);

        List<Integer> failedList = marks.stream().filter(i-> i<40).toList();
        // System.out.println(failedList);

        List<Integer> grace = marks.stream().filter(i -> i<40).map(i->i+5).toList();
        // System.out.println(grace);

        Long ct = marks.stream().filter(i->i<40).count();
        // System.out.println(ct);

        List<Integer> sorted = list.stream().sorted().toList();
        // System.out.println(sorted);

        List<Integer>desc = list.stream().sorted((a,b)-> (a>b)?-1:(a<b)?1:0).toList();
        // System.out.println(desc);

        List<Integer> desc1 = list.stream().sorted((a,b)-> b.compareTo(a)).toList();
        // System.out.println(desc1);

        List<Integer> desc2 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(desc2);
    }
}
