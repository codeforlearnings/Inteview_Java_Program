package Java_8;

import java.util.*;
import java.util.stream.Collectors;

public class Program_Charactor_Count {
	
	public static void main(String[] args) {
	     //   System.out.println("hi...");
	     //   List<Integer> l1 = List.of(2, 4, 3, 11, 67, 4, 578, 98, 100);
	     //   Stream<Integer> stream = l1.stream();
	     //   Set<Integer> evenNo = stream.filter(i -> i % 2 == 0).collect(Collectors.toSet());


	    //     List<Integer> cond = stream.filter(i1 -> i1 > 200).collect(Collectors.toList());

	        String  aa = "Protijayi Gini";
	        
	        String[] stringarray = aa.split("");

	        //collector produces a ConcurrentMap<K, List<T>>

	        //stream allows you to collect your result in any various forms. You can get you result as set, list or
	        // map and can perform manipulation on the elements.

	        // collect() is mostly used to collect the stream elements to a collection.

	        // groupingBy() method of Collectors class in Java are used for grouping objects by some
	        // property and storing results in a Map instance.

	        // groupingBy() method of Collectors class in Java are used for grouping objects
	        // by some property and storing results in a Map instance.

	        Map<String,Long> map =  Arrays.stream(stringarray).collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	        map.forEach( (k, v) -> {
	            System.out.println(k + " : "+ v);
	        });
	    }

}
