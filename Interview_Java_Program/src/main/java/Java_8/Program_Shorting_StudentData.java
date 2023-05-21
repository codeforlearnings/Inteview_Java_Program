package Java_8;

import java.util.*;

class Students {
    String name;
    int age;
    int id;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    Students(String n, int a, int i){
        name = n;
        age = a;
        id = i;
    }

    @Override public String toString() {
        return ("Student[ "+"Name:"+this.getName()+
                " Age: "+ this.getAge() +
                " Id: "+ this.getId()+"]");
    }
}

public class Program_Shorting_StudentData {
	 public static void main(String[] args) {
	        List<Students> studentlist = new ArrayList<Students>();
	        studentlist.add(new Students("Jon", 22, 1001));
	        studentlist.add(new Students("Steve", 19, 1003));
	        studentlist.add(new Students("Kevin", 23, 1005));
	        studentlist.add(new Students("Ron", 20, 1010));
	        studentlist.add(new Students("Lucy", 18, 1111));
	        System.out.println("Before Sorting the student data:");

	        //java 8 forEach for printing the list
	        studentlist.forEach((s)->System.out.println(s));

	        System.out.println("After Sorting the student data by Age:");

	        //Lambda expression for sorting by age
	        studentlist.sort((Students s1, Students s2)->s1.getAge()-s2.getAge());

	        //java 8 forEach for printing the list
	        studentlist.forEach((s)->System.out.println(s));

	        System.out.println("After Sorting the student data by Name:");
	        //Lambda expression for sorting the list by student name
	        studentlist.sort((Students s1, Students s2)->s1.getName().compareTo(s2.getName()));
	        studentlist.forEach((s)->System.out.println(s));
	        System.out.println("After Sorting the student data by Id:");
	        //Lambda expression for sorting the list by student id
	        studentlist.sort((Students s1, Students s2)->s1.getId()-s2.getId());
	        studentlist.forEach((s)->System.out.println(s));
	    }
}
