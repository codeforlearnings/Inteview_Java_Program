package Java_8;
/*
. A Functional interface is an interface that defines one and only one abstract method.
. Functional interfaces provide support for lambda expressions and method references.
. The major benefit of functional interface is we can use lambda expressions to instantiate them and avoid using anonymous class implementation.
. A new annotation @FunctionalInterface has introduced to mark an interface as Functional interface.
. Java has many functional interfaces in java.util.function package.
. Functional interface can have many default method or static method.

//invalid
@FunctionalInterface
interface Inter2{}

//valid
@FunctionalInterface
interface Inter3{
 void show();
}

//valid
@FunctionalInterface
interface Inter4{
 void show();
 default void display(){
}}

//valid
@FunctionalInterface
ingterface Inter4{
 void show();
 static void display(){
}}

//invalid
@FunctionalInterface
interface Inter1{
 void show();
 void display();
}

Runnable ==> run()
Comparable ==> compareTo()
Comparator ==> compare()
ActionListener ==> actionPerformed()
Callable ==> call()

. Functional interfaces are important in Lambdas
. implementation of the functional interface
  
  Runnable r=() -> System.out.println("Hello");
  Comparator<String> comp = (s1,s2) -> s1.compareTo(s2);
  
  Working with Functional Interface
  ---------------------------------------
. Predicate - defines only one abstract method- test() - return Boolean value
  Predicate<Integer> p=i->i%2==0; p.test(10);

. Consumer - defines only one abstract method- accepts() - return void value

*/

import java.util.function.*;

 class Student {
	String name;
	int marks;
	Student(String name, int marks){
		this.name=name;
		this.marks=marks;		
	}
}


public class Functional_Interface {

	public static void main(String[] args) {
		Function<Student, String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Dinstiction]";
			else if(marks>=60) grade="B[1st class]";
			else if(marks>=50) grade="C[Second class]";
			else if(marks>=35) grade="D[Third class]";
			else grade="E[Failed]";
			return grade;	
		};
		Student[] s= {new Student("Durga",100),new Student("Sunny",75),new Student("Binny",35),new Student("Vinny",5),new Student("Bunny",55)};
		
		for(Student s1:s) {
			System.out.println("Student name-"+s1.name);
			System.out.println("Student marks-"+s1.marks);
			System.out.println("Student grade-"+f.apply(s1));
		}}
	
	        
	            
}












