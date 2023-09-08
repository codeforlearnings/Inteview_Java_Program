package Java_8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class M13 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
	
//		Stream<Integer> stream1 = list.stream().filter(element -> element % 2 == 0);
//		stream1.forEach(System.out :: println);

		Stream<Integer> stream2 = list.parallelStream().filter(element -> element % 2 == 0);
		stream2.forEach(System.out :: println);

	
	}
}
