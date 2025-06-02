package java8N;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Practice3 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(3,9,2,6,5,8,9,4);
        List<Integer>even = list.stream().filter(i->i%2==0).toList();
        // System.out.println(even);

        List<Integer>odd = list.stream().filter(i -> i%2!=0).toList();
        // System.out.println(odd);

        List<Integer>marks = Arrays.asList(89,34,50,20,90,10,98,40,50);
        List<Integer>passed = marks.stream().filter(i->i>35).toList();
        // System.out.println(passed);

        List<Integer>failed = marks.stream().filter(i -> i<35).toList();
        // System.out.println(failed);

        List<Integer>grace = marks.stream().filter(i->i<35).map(i->i+5).toList();
        // System.out.println(grace);

        //sort
        List<Integer>sorted = list.stream().sorted().toList();
        // System.out.println(sorted);

        // sort in descending order
        List<Integer>desc = list.stream().sorted((a,b)-> (a<b)?1:(a>b)?-1:0).toList();
        System.out.println(desc);

        List<Integer>desc1 = list.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(desc1);

        List<Integer>desc2 = list.stream().sorted( Comparator.reverseOrder()).toList();
    
        // find 2nd Highest marks
        Optional<Integer>sec = marks.stream().distinct().sorted((a,b)->(a<b)?1:(a>b)?-1:0).skip(1).findFirst();
        System.out.println(sec);
        
        int sec1 = marks.stream().distinct().sorted((a,b)->(a<b)?1:(a>b)?-1:0).skip(1).findFirst().get();
        System.out.println(sec1);

    }
}
