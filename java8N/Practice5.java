package java8N;

import java.util.Arrays;
import java.util.List;

public class Practice5 {
    public static void main(String[] args) {
        List<String>words = Arrays.asList("apple", "ball", "cat", "dog", "egg");
        
    }
}
/*
 * /******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

// *******************************************************************************/
// import java.util.*;
// import java.util.stream.Collectors;
// import java.util.stream.Stream;

// public class Main
// {
// 	public static void main(String[] args) {
// // 		System.out.println("Hello World");

// 		List<Integer>list = Arrays.asList(9,8,1,6,2,4,9,6,3,2,2);
		
// 		//even
//         List<Integer>even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//         System.out.println(even);
        
//         //odd
//         List<Integer>odd = list.stream().filter(i->i%2!=0).collect(Collectors.toList());
//         System.out.println(odd);
        
//         List<Integer>marks = Arrays.asList(45,90,34,98,67,89,56,45,23);
//         List<Integer>passedStudent = marks.stream().filter(i->i>40).collect(Collectors.toList());
//         System.out.println(passedStudent);
        
//         List<Integer>failed = marks.stream().filter(i->i<40).collect(Collectors.toList());
//         System.out.println(failed);
        
//         //10 grace marks to failed students
//         List<Integer>grace = marks.stream().filter(i->i<40).map(i->i+10).collect(Collectors.toList());
//         System.out.println(grace);
        
//         //count passedStudent
//         long ct = marks.stream().filter(i->i>40).count();
//         System.out.println(ct);
        
//         //sort
//         List<Integer>sorted = marks.stream().sorted().collect(Collectors.toList());
//         System.out.println(sorted);
        
//         //sort in descending
//         List<Integer>desc = marks.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
//         System.out.println(desc);
        
//         List<Integer>desc1 = marks.stream().sorted((a,b)->(a<b)?1:(a>b)?-1:0).collect(Collectors.toList());
//         System.out.println(desc1);
        
//         List<Integer>desc2 = marks.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//         System.out.println(desc2);
        
//         //find max
//         int max = marks.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
//         System.out.println(max);
        
//         //find MIN_VALUE
//         int min = marks.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
//         System.out.println(min);
        
//         List<Integer>merge = Stream.concat(marks.stream(),list.stream()).sorted().collect(Collectors.toList());
//         System.out.println(merge);
        
//         //frequency of each no 
        
//         System.out.println(freq);
            
            
            
//         List<String>words = Arrays.asList("apple", "ball", "cat", "dog", "egg");
//         Map<String, Integer>freqMap = words.stream().collect(Collectors.toMap())
        
//             System.out.println(strLen);
        
// 	}
// }
//  * 
//  */