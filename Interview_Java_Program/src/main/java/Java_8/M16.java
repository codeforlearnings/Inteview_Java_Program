package Java_8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class M16 {
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
//		UnaryOperator<Integer> operator = new UnaryOperator<Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				return t + 5;
//			}
//		};
//		list.replaceAll(operator);
		list.replaceAll(c1 -> (c1 + 5));
		System.out.println(list);
	}

	
}
