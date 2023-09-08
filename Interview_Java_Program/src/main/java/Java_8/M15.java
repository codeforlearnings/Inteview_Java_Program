package Java_8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class M15 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(80);
		list.add(70);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list);
		System.out.println("-----");
//		Predicate<Integer> p1 = new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer t) {
//				return t % 40 == 0;
//			}
//		};
//		list.removeIf(p1);
		list.removeIf(c1 -> (c1 % 40 == 0));
		System.out.println(list);
	}
}
