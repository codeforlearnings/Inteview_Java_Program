package Java_8;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class M21 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8, "test");
		map.put(7, "done");
		map.put(6, "check");
		System.out.println(map);
		map.merge(16, "new", new BiFunction<String, String, String>() {
			@Override
			public String apply(String oldValue, String newValue) {
				return oldValue + newValue;
			}
		} );
		
		//map.merge(6, "new", (v1, v2) -> v1 + v2);
		
		System.out.println(map);
		
	}
}
