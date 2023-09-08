package Java_8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class M2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(3, "test");
		map.put(4, "hello");
		map.put(5, "java");
		BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>() {
			
			@Override
			public void accept(Integer t, String u) {
				System.out.println(t + ":" + u);				
			}
		};
		map.forEach(biConsumer);
			
		map.forEach((k, v) -> System.out.println(k + "," + v));
		//map.forEach(System.out :: println);
	}
}
