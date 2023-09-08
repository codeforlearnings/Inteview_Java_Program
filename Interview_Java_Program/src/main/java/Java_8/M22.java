package Java_8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class M22 {
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
		Spliterator<Integer> it = list.spliterator();
		it.forEachRemaining(t1 -> System.out.println(t1));		
	}
}
