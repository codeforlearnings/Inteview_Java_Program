package Java_8;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class M24 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		Spliterator<Integer> it = list.spliterator();
		Spliterator<Integer> splitIt = it.trySplit();
		new Thread(() ->{
			it.forEachRemaining(t1 -> System.out.println("main iterator:" + t1));	
		}).start();
		new Thread(() ->{
			splitIt.forEachRemaining(t1 -> System.out.println("sub iterator:" + t1));	
		}).start();
	}
}
