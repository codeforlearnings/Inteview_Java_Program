package Java_8;
import java.util.HashMap;
import java.util.Map;

public class M18 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "abc");
		map.put(9, "xyz");
		map.put(8, "test");
		map.put(7, "done");
		map.put(6, "check");
		System.out.println(map);
		System.out.println("map.get(9):" + map.get(9));
		System.out.println("map.get(19):" + map.get(19));
		System.out.println("map.getOrDefault(19):" + map.getOrDefault(19, "some default"));
	}
}
