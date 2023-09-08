package Java_8;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class M20 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8, "test");
		map.put(7, "done");
		map.put(6, "check");
		System.out.println(map);
//		map.compute(6, new BiFunction<Integer, String, String>() {
//			public String apply(Integer t, String u) { return u.concat("   test");}
//		});
		
		map.compute(6, (k, v) -> v.concat("test   "));
		
		System.out.println(map);
		
	}

}
