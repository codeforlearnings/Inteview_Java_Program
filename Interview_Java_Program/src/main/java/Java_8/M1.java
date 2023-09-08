package Java_8;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class M1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(10);
		list.add(130);
		list.add(300);
		list.add(125);
		System.out.println(list);
		for(Integer obj : list) {
			System.out.print(obj + ", ");
		}
		System.out.println();
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t + ", ");
			}
		};
		list.forEach(consumer);
		list.forEach(element -> System.out.print(element + ", " ));
		System.out.println();
		list.forEach(System.out :: print);
		System.out.println();
		list.forEach(System.out :: println);
		
		Set<String> set = new HashSet<String>();
		set.add("abc");
		set.add("abc1");
		set.add("ab1c");
		set.add("a1bc");
		set.add("1abc");
		Stream<String> stream1 = set.stream();
		stream1.forEach(System.out :: println);

	}

}
