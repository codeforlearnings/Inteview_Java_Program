package Java_8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class M17 {
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
//		Comparator<Integer> comparator = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2);
//			}
//		};
//		list.sort(comparator);
		list.sort((c1, c2) -> c1.compareTo(c2));
		System.out.println(list);
	}
}
