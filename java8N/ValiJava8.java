package java8N;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ValiJava8 {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(8,9,2,4,38,7,8,9,5);
        //1.remove duplicate
        List<Integer>unique = list.stream().distinct().toList();
        // System.out.println(unique);

        //2.EVEN
        List<Integer>even = list.stream().filter(i->i%2==0).toList();
        // System.out.println(even);

        //2.odd
        List<Integer> odd = list.stream().filter(i->i%2!=0).toList();
        // System.out.println(odd);

        //3. freq of each char in a string
        String str = "apple";
        Map<Character,Long> freq = str.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(
            ch -> ch,
            Collectors.counting()
        ));
        // System.out.println(freq);

        //4. freq of each elm in a array
        List<Integer>list1 = Arrays.asList(1,5,7,2,3,1,6,7,7,7,6,10);
        Map<Integer,Long> freMap = list1.stream().collect(Collectors.groupingBy(
            num -> num,
            Collectors.counting()
        ));
        // System.out.println(freMap);

        //5. Sort the list in ascending order
        List<Integer>sorted = list1.stream().sorted().toList();
        // System.out.println(sorted);

        //5. Sort the list in descending order
        List<Integer> desc = list1.stream().sorted((a,b)->(a>b)?-1:(a<b)?1:0).toList();
        // System.out.println(desc);

        //6. Print all the multiple of 5
        List<Integer>multiple =  list1.stream().filter(i->i%5==0).toList();
        // System.out.println(multiple);
        
        // list1.stream().filter(i->i%5==0).forEach(System.out::println);


        //7. find max and min 
        int max = list1.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b);
        // System.out.println( "max - " +max);

        //min
        int min = list1.stream().reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b);
        // System.out.println("min - "+ min);

        //8. Merge two unsorted list
        
        List<Integer>merge = Stream.concat(list.stream(), list1.stream())
        .sorted().collect(Collectors.toList());
        // System.out.println(merge);


        //8. Merge two unsorted arr

        int arr[]={1,5,7,2,3,1,6};
        int arr1[]={9,8,17,12,13,11,16};

        int mergeArr[]= IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1)).sorted().toArray();

        // Arrays.stream(mergeArr).forEach(i->System.out.print(i+" "));

        System.out.println();
        //9. Sum of all digit of a number
        int number = 12345;
        int sum = String.valueOf(number).chars().map(c->c -'0').sum();
        System.out.println(sum);
    }
}
