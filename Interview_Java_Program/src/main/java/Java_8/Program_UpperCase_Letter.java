package Java_8;
import java.util.*;
import java.util.stream.Collectors;

public class Program_UpperCase_Letter {
	
	 public static void main(String[] args) {
	        String str = "welcome to java, hello, we Are in Waiting for you";

	// uppercase first letter of each word
	        String output = Arrays.stream(str.split(" "))
	                .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
	                .collect(Collectors.joining(" "));
	// print the string
	        System.out.println(output);
	    }

}
