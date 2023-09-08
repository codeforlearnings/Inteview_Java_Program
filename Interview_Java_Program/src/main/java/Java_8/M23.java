package Java_8;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class M23 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		Spliterator<Integer> it = list.spliterator();
		Spliterator<Integer> splitIt = it.trySplit();
		it.forEachRemaining(t1 -> System.out.println("main iterator:" + t1));		
		splitIt.forEachRemaining(t1 -> System.out.println("sub iterator:" + t1));
	}
}
