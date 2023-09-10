package Java_8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class Java_8_ShortCoding {
	
	public static void main(String[] args) throws Throwable {
// 1		
	List<Integer> list = new ArrayList<Integer>();
	list.add(100);list.add(10);list.add(130);list.add(300);list.add(125);
	System.out.println(list);
	list.forEach(System.out::println);
//or	
	Iterator<Integer> it = list.iterator();
	it.forEachRemaining(System.out :: println);
//or	
	Stream<Integer> s1 = list.stream();
	List<Integer> list1 = s1.filter(t -> t < 50).collect(Collectors.toList());
	list1.forEach(System.out::println);
//or	
	list.stream().filter(x->x<50).collect(Collectors.toList()).forEach(System.out::println);
	Long l=list.stream().filter(x->x<50).count();
	System.out.println("Count is-"+l);
//or
	List<Integer> r2 = list.stream().map(t -> (t % 2 == 0 ? t : t + 1)).collect(Collectors.toList());
	System.out.println(r2);
//or
	List<Integer> r1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	System.out.println(r1);
//or
	List<Employee1> employees = new ArrayList<Employee1>();
	employees.add(new Employee1("abc", 60000));
	employees.add(new Employee1("xyz", 20000));
	employees.add(new Employee1("vijay", 40000));
	employees.add(new Employee1("bhanu", 10000));
	
	List<Employee1> r3 = employees.stream().sorted(
			(emp1, emp2) -> emp1.getFirstname().compareTo(emp2.getFirstname())).collect(Collectors.toList());
	System.out.println(r3);
//or
	list.removeIf(c1 -> (c1 % 40 == 0));
	System.out.println(list);
//or
	list.replaceAll(c1 -> (c1 + 5));
	System.out.println(list);
//or
	list.sort((c1, c2) -> c1.compareTo(c2));
	System.out.println(list);
//or
	List<Integer> list0 = new ArrayList<Integer>();
	for(int i = 1; i <= 100; i++) {
		list0.add(i);
	}
	Spliterator<Integer> it0 = list0.spliterator();
	Spliterator<Integer> splitIt = it0.trySplit();
	new Thread(() ->{
		it0.forEachRemaining(t1 -> System.out.println("main iterator:" + t1));	
	}).start();
	new Thread(() ->{
		splitIt.forEachRemaining(t1 -> System.out.println("sub iterator:" + t1));	
	}).start();	
//or
	File f1 = new File("C:\\Users\\Pankaj Kumar\\OneDrive\\Core Java\\Java 8 Program\\src");
	Stream<Path> files = Files.list(f1.toPath()); //list method introduced in JDK1.8
    files.forEach(c1 -> System.out.println(c1.getFileName()));
	
//2
	Set<String> set = new HashSet<String>();
	set.add("abc");set.add("abc1");set.add("ab1c");set.add("a1bc");set.add("1abc");
	Stream<String> stream1 = set.stream();
	stream1.forEach(e->System.out.println(e));
//3
	Map<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "ramu");
	map.put(2, "kiran");
	map.put(3, "babu");
	map.put(4, "rao");
	Stream<Entry<Integer, String>> stream2 = map.entrySet().stream();
	Stream<Integer> stream3 = map.keySet().stream();
	Stream<String> stream4 = map.values().stream();
	stream2.forEach(System.out::println);
	stream3.forEach(k->System.out.print(k+" "));
	stream4.forEach(v->System.out.print(v+" "));
//or
	System.out.println("map.get(1):" + map.get(1));
	System.out.println("map.get(3):" + map.get(3));
	System.out.println("map.getOrDefault(4):" + map.getOrDefault(4, "some default"));
//or
	map.put(8, "new test");
	System.out.println(map);
	map.putIfAbsent(7, "new done");
	System.out.println(map);
//or
	map.compute(4, (k, v) -> v.concat("test   "));
	System.out.println(map);
//or
	
//4
	int[] elements = {10, 20, 40, 50, 111};
	IntStream intStream = Arrays.stream(elements);
	intStream.forEach(System.out :: println);
//5
	String[] names = { "abc", "hello", "test" };
	Stream<String> stream5 = Arrays.stream(names);
	stream5.forEach(System.out :: println);
//6
	Stream<Double> stream6 = Stream.of(4.5, 5.9, 6.1, 5.7);
	stream6.forEach(System.out :: println);
//7
	interface A
	{
		void test(int i, String s1);
	}

	A a1 = (x, y) -> {
		System.out.println("from test:" + x);
		System.out.println("from test:" + y);
	 };
     a1.test(10, "abc");
     System.out.println("done");
//8
     class Student {
    		String name;
    		int marks;
    		Student(String name, int marks){
    			this.name=name;
    			this.marks=marks;		
    		}}
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
		
		for(Student s2:s) {
			System.out.println("Student name-"+s2.name);
			System.out.println("Student marks-"+s2.marks);
			System.out.println("Student grade-"+f.apply(s2));
		}
//9		
		// the current date
		LocalDate date = LocalDate.now();
		System.out.println("the current date is "+ date);


		// the current time
		LocalTime time = LocalTime.now();
		System.out.println("the current time is "+time);
		

		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : "+current);


		// to print in a particular format
		DateTimeFormatter format =
		DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = current.format(format);
		
		System.out.println("in formatted manner "+formatedDateTime);


		// printing months days and seconds
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : "+month+" day : "+day+" seconds : "+seconds);

		// printing some specified date
		LocalDate date2 = LocalDate.of(1950,1,26);
		System.out.println("the republic day :"+date2);

		// printing date with current time.
		LocalDateTime specificDate =current.withDayOfMonth(24).withYear(2016);

		System.out.println("specific date with "+"current time : "+specificDate);
//10
        String  aa ="Protijayi Gini";
        String[] stringarray = aa.split("");
        Map<String,Long> map0 =  Arrays.stream(stringarray).collect(Collectors.groupingBy(c -> c , Collectors.counting()));
        map0.forEach( (k, v) -> {
        System.out.println(k + " : "+ v);
        });
//11
     // Creating a list of Prime Numbers
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);

        // Creating a list of Odd Numbers
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);

        // Creating a list of Even Numbers
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " +
                listOfListofInts);

        // Using flatMap for transformating and flattening.
        List<Integer> listofInts  = listOfListofInts.stream()
                .flatMap(l1 -> l1.stream())
                .collect(Collectors.toList());
        System.out.println("The Structure after flattening is : " +
                listofInts);
//12
        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);unsortMap.put("b", 5);unsortMap.put("a", 6);unsortMap.put("c", 20);unsortMap.put("d", 1);
        unsortMap.put("e", 7);unsortMap.put("y", 8);unsortMap.put("n", 99);unsortMap.put("g", 50);unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        System.out.println("Original...");
        System.out.println(unsortMap);
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        unsortMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
         System.out.println("Sorted Map   : " + sortedMap);
//13
         String str = "welcome to java, hello, we Are in Waiting for you";

     	// uppercase first letter of each word
     	        String output = Arrays.stream(str.split(" "))
     	                .map(t -> t.substring(0, 1).toUpperCase() + t.substring(1))
     	                .collect(Collectors.joining(" "));
     	// print the string
     	        System.out.println(output);





	}}


 class Employee1 {
	private String firstname;
	private Integer salary;
	public Employee1(String firstname, Integer salary) {
		super();
		this.firstname = firstname;
		this.salary = salary;
	}
	public String getFirstname() {
		return firstname;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", salary=" + salary + "]";
	}
}
