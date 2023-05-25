package Java_11;

/*
 * (var s1, var s2) -> s1 + s2
 * (var s1, s2) -> s1 + s2 //no skipping allowed
   (var s1, String y) -> s1 + y //no mixing allowed

    var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.
 * 
 */


import java.util.stream.IntStream;

public class Local_Variable_Syntax_Lambda_Parameters {
	
	public static void main(String[] args)
    {

// Java program to show the Variable
// used in the lambda expression
		
       IntStream.of(1, 2, 3, 5, 6, 7)
           .filter((var i) -> i % 2 == 0)
           .forEach(System.out::println);
       
// Variable without using lambda expression
       
        IntStream.of(1, 2, 3, 5, 6, 7)
        .filter(i -> i % 2 == 0)
        .forEach(System.out::println);
    }

}
