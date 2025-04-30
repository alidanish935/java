package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        /*
         * 
         * collect(Collectors.toList()) works on Stream<T>, but IntStream is not Stream<T>.
            So, .boxed() is needed to convert IntStream to Stream<Integer> before collecting.


         */
        int arr[]={1,2,3,4,5,6,7,8,9};

        // gives error becouse lambda funtion is availavle for only collection class
        // arr.forEach((x)->{
        //     System.out.print(x+" ");
        // });

        // Arrays.stream(arr).forEach(x->System.out.println(x));

    //not correct syntax
        // Arrays.stream(arr).map(x->System.out.println(x));

        List<Integer> doubled = Arrays.stream(arr)
        .map(x -> x*2)
        .boxed()
        .collect(Collectors.toList());

        System.out.print(doubled+" ");
        
        List<Integer>evenNum = Arrays.stream(arr)
        .filter(x -> x%2==0)
        .boxed()
        .collect(Collectors.toList());
        
        System.out.print(evenNum+" ");
    }
}
