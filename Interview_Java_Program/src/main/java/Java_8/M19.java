package Java_8;
import java.util.HashMap;
import java.util.Map;

public class M19 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8, "test");
		map.put(7, "done");
		map.put(6, "check");
		System.out.println(map);
		map.put(8, "new test");
		System.out.println(map);
		map.putIfAbsent(7, "new done");
		System.out.println(map);
	}

}
