package java8N;

import java.util.Arrays;
import java.util.List;

public class MethodRefrence {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("apple", "fish","ball","cat");
        //print each
        // list.forEach(x->System.out.println(x));

        //using refrence
        // list.forEach(System.out::println);

        list.sort((a,b)-> a.compareToIgnoreCase(b));
        // System.out.println(list);

        list.sort(String::compareToIgnoreCase);
        // System.out.println(list);




        //convert all string to uppercase
        List<String>upper = list.stream().map(String::toUpperCase).toList();
        // System.out.println(upper);

        // Sort a list of names in alphabetical order
        List<String>sort = list.stream().sorted().toList();
        // System.out.println(sort);

        List<String>sort1 = list.stream().sorted(String::compareToIgnoreCase).toList();
        // System.out.println(sort1);


        //Count how many strings start with the letter "A"
        long ct = list.stream().filter(a-> a.startsWith("a")).count();
        // System.out.println(ct);


        //5. Find the maximum number in a list
        List<Integer>number = Arrays.asList(4,2,8,8,9,3,2,4,6);
        Integer mx = number.stream().max(Integer::compareTo).get();
        // System.out.println(mx);

        //USING Reduce method
        int max = number.stream().reduce(Integer.MIN_VALUE, (a,b)->a>b?a:b);
        // System.out.println(max);

        int min = number.stream().reduce(Integer.MAX_VALUE,(a,b)-> a<b?a:b);
        System.out.println(min);

        //sum of all numbers
        int sum = number.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);
        
        //average
        int sum1 = number.stream().reduce(0,Integer::sum);
        System.out.println(sum1);
        double average = (double) sum1/number.size();
        System.out.println(average);


        // sort with length
        // List<String>sort2 = list.stream().sorted((a,b)-> ())



        // Convert a list of strings to a list of Person objects.

        // List<String>lists = list.stream()
        //                         .map(l-> new P) 


    }
}
