package Java_8;
/*
. Lambdas are anonymous Functions, which does not have any name, No return type, No Modifiers.
. Lambda are not associated with any class. Lambdas are functions.
. They have a list of input parameters, body, return type and possible se of exceptions.
. Lambdas can be assigned to variables or passed as parameter.
. Lambdas are the basic building blocks of Functional programming support in java.
. Java 8 provvides ability to pass a piece of code as parameter to any method.
. Passing code in methods is currently not very friendly in Java, Lambda    help us to make the code cleaner and more flexible.
. Lambdas encourage behaviour parameterization over value parameterization.

. Lambdas is made of parameters, an arrow and its body.

(String s1, String s2)  ->  s2.compareTo(s1);
 parameter              arrow    body

General syntax:
(parameter)  ->  Expression

         or
(parameter)  ->  {statements;}

. Some valid and invalid Lambdas

() -> {}              // valid
() -> "Manish"        // valid
() -> {return "Manish"} // valid
(int a, int b) -> a+b   // valid
(a,b) -> a+b        // valid
(Double d) -> {return "Manish" +d;}  // valid
(Double d) -> return "Manish" +d;    // invalid
(String s) -> {"Manish";}  // invalid

---------------------------------------------------------------------
Object Creation        () -> new Student(99)
Object Consumption     (Student s) -> {SOP(s);}
Boolean Expression     (List<String> list) -> list.isEmpty()
Combining values       (int a, int b) -> a+b
Comparing two objects  (String s1, String s2) -> s1.compareTo(s2)
Extracting value from object  (String s) -> s.length()

---------------------------------------------------------------------
 shorting java_program
 ***********************
*/
import java.util.*;

public class Lambda_Function {
public static void main(String[] args) {
List<Integer> names=Arrays.asList(2,7,5,9,1);
Comparator<Integer>comp=(Integer s1, Integer s2) -> s2.compareTo(s1);
Collections.sort(names,comp);
System.out.println(names);
		}}

//     o/p : [9, 7, 5, 2, 1]



