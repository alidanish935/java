package java8N;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Java8Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		List<Integer>list = Arrays.asList(5,10,15,35,20);
//		
////		List<Integer>evenList =  list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
//		List<Integer>evenList =  list.stream().filter(i -> i%2 == 0).toList();
//		// we can write toList() in place of collect(Collectors.toList());
//		System.out.println(evenList);
		
		
		//select only passed students
		List<Integer>marks = Arrays.asList(50,70,10,40,19,90,86,20);
		
		List<Integer>passedStudents = marks.stream().filter(i -> i>35).toList();
		System.out.println(passedStudents);
		
		// give 5 marks grace to failed students
		
		List<Integer>graceMarks = marks.stream().filter(i -> i<35).map(i-> i+5).toList();
		System.out.println(graceMarks);
		
		// count total no of failed students
		Long ct =  marks.stream().filter(i-> i<35).count();
		System.out.println(ct);
		
		// sort the element from stream
		List<Integer>sortedMarks = marks.stream().sorted().toList();
		System.out.println(sortedMarks);
		
		// custom sorting or sorting in descending order, so will go with comparator
		// comparator is a functional interface that has only method compare
		// compare(obj1, obj2)
		 	// return -ve; if obj1 has come before obj2 , means both obj wont change their position
			// return +ve; if obj1 has come after obj2 , means both obj will change their position, obj2 will come before obj1
			// return 0; if obj1 & obj2 are equal
		
		//for descending order :
			//(a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0
			
//		List<Integer>desc = marks.stream().sorted((a,b) -> (a<b) ?1 :(a>b) ? -1 : 0).toList();
//		List<Integer>desc1 = marks.stream().sorted((a,b)-> b.compareTo(a)).toList();
//		List<Integer>desc1 = marks.stream().sorted((a,b)-> -a.compareTo(b)).toList();
		List<Integer>desc1 = marks.stream().sorted( Comparator.reverseOrder()).toList();
		//same thing writing in different ways
//		System.out.println(desc1);
		
		
		// sorting list of string with length
		List<String>names = Arrays.asList("A","BBB", "AAAAAAAAAAA","DDDDDDD","CCCC");
		
		Comparator<String> c= (a,b)->{
			int l1 = a.length();
			int l2 = b.length();
//			if(l1<l2)return -1;
//			else if(l1>l2)return 1;
//			else return 0;
			
//			OR
			return Integer.compare(l1,l2);
		};
		
		List<String> sortedStringWithLength = names.stream().sorted(c).toList();
		System.out.println(sortedStringWithLength);
		
		List<String> sortedString = names.stream().sorted().toList();
		System.out.println(sortedString);
		
		// Find the second largest number in Array   1,10,12,34,35   ,  n=5
		int arr[] =   {12, 35, 1, 10, 34, 1}; //{5,2,7,2,9,9,8,7,3,6};
		OptionalInt secLar =  Arrays.stream(arr).distinct().sorted().skip(arr.length -6).findFirst();
		if(secLar.isPresent()) {
			System.out.println(secLar);
		}else {
			System.out.println("NOt");
			
		}
		
	}

}
