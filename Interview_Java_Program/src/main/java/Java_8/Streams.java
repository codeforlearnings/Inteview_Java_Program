package Java_8;

/*
Collections:- If we want represent a group of object in single entity than we should go with Collections.
Streams :- if we want process object from collection than we should go with Streams.
Stream is a inteface comes java.util.Stream package

Stream s=collection.Stream();
Stream can configure with
-------------------------
Stream - filter(), map(), collect(), count(), sorted(), sorted(Comparator), min(Comparator), max(Comparator), forEach(), toArray().
*/

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		ArrayList<Integer> I=new ArrayList<Integer>();
		I.add(10); I.add(20); I.add(30); I.add(80); I.add(55); I.add(40);
		
		List<Integer> I2=I.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(I2);
		
		I.stream().forEach(i->System.out.println("square of "+i+" is - "+i*i));
		}}


