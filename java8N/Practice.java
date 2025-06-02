package java8N;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10,15, 35,20,45,30);
        
        // filter even 
        List<Integer> evenList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
        // System.out.println(evenList);
        
        // other way
        List<Integer>even2 = list.stream().filter(i -> i%2 == 0).toList();
        // System.out.println(even2);

        List<Integer> odd = list.stream().filter(i -> i%2 != 0).toList();
        // System.out.println(odd);


        //select only passed student
        List<Integer>student = Arrays.asList(55, 90, 75, 35,80,45,30);
        List<Integer>passed = student.stream().filter(i -> i>40).toList();

        // System.out.println(passed);
        
        List<Integer>failed = student.stream().filter(i->i<40).toList();
        // System.out.println(failed);

		// count total no of failed students
        Long ct = student.stream().filter(i -> i<40).count();
        // System.out.println(ct);

		// give 5 marks grace to failed students
        List<Integer>grace = student.stream().filter(i -> i<40 ).map(i -> i+5).toList();
        // System.out.println(grace);

        List<Integer> sortedList = student.stream().sorted().toList();
        // System.out.println(sortedList);

        // custom sorting or sorting in descending order, so will go with comparator
		// comparator is a functional interface that has only method compare
		// compare(obj1, obj2)
		 	// return -ve; if obj1 has come before obj2 , means both obj wont change their position
			// return +ve; if obj1 has come after obj2 , means both obj will change their position, obj2 will come before obj1
			// return 0; if obj1 & obj2 are equal
		
		//for descending order :
			//(a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0

        List<Integer>desc = student.stream().sorted((a,b)-> (a<b)?1 :(a>b)?-1:0).toList();
        System.out.println(desc);

		// sorting list of string with length
        List<String>names = Arrays.asList("A","BBB", "AAAAAAAAAAA","DDDDDDD","CCCC");

        Comparator<String>c = (a,b)->{
            int l1 = a.length();
            int l2 = b.length();
            // if(l1<l2) return -1;
            // else if(l1>l2) return 1;
            // else return 0;

            // or
            // return Integer.compare(l2, l1);// descending
            return Integer.compare(l1, l2);// ascending
        };

        //
        //here it is sorting based on length
        List<String> sList = names.stream().sorted(c).toList();
        System.out.println(sList);

        //here it is sorting based on alphabate
        List<String>sortedStrings = names.stream().sorted().toList();
        System.out.println(sortedStrings);

		// Find the second largest number in Array   1,10,12,34,35   ,  n=5
        int arr[] = {1,10,12,34,35};
        OptionalInt sec = Arrays.stream(arr).distinct().boxed()
                        .sorted(Comparator.reverseOrder())
                        .skip(1).mapToInt(Integer::intValue)
                        .findFirst();
        System.out.println(sec.getAsInt());

    }
}
