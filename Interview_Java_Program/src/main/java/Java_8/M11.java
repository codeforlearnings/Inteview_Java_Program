package Java_8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class M11 {
	
		public static void main(String[] args) {
			List<Integer> numbers = new ArrayList<Integer>();
			numbers.add(90);
			numbers.add(45);
			numbers.add(20);
			numbers.add(190);
			numbers.add(15);
			numbers.add(85);
			System.out.println(numbers);
//			List<Integer> r1 = numbers.stream().sorted().collect(Collectors.toList());
//			System.out.println(r1);

			List<Integer> r1 = numbers.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
			System.out.println(r1);

			
		}
}
