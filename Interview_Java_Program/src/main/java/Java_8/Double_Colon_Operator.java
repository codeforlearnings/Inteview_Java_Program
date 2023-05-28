package Java_8;

import java.util.*;
import java.util.stream.Stream;

/*
 * The double colon (::) operator, also known as method reference operator in Java,
 *  is used to call a method by referring to it with the help of its class directly. 
 *  They behave exactly as the lambda expressions. The only difference it has from 
 *  lambda expressions is that this uses direct reference to the method by name 
 *  instead of providing a delegate to the method.
 *  
 *  Syntax:

<Class name>::<method name>

Using double colon operator:
stream.forEach( System.out::println);

Static method
Syntax:
(ClassName::methodName)

Instance method
Syntax:
(objectOfClass::methodName)

Super method
Syntax:
(super::methodName)

Instance method of an arbitrary object of a particular type
Syntax:
(ClassName::methodName)

Class Constructor
Syntax:
(ClassName::new)
Example:
ArrayList::new

 */

class GFG {
	  
    // static function to be called
    static void someFunction(String s)
    {
        System.out.println(s);
    }}


public class Double_Colon_Operator {

	public static void main(String[] args) {
		// Get the stream
        Stream<String> stream
            = Stream.of("Geeks", "For",
                        "Geeks", "A",
                        "Computer",
                        "Portal");
     // Print the stream
        stream.forEach(s -> System.out.println(s));
        
     // using double colon operator
        stream.forEach(System.out::println);

	}
}
