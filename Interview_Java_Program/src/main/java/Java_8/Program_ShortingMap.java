package Java_8;

import java.util.*;

public class Program_ShortingMap {
	
	public static void main(String[] args) {

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);unsortMap.put("b", 5);unsortMap.put("a", 6);unsortMap.put("c", 20);unsortMap.put("d", 1);
        unsortMap.put("e", 7);unsortMap.put("y", 8);unsortMap.put("n", 99);unsortMap.put("g", 50);unsortMap.put("m", 2);
        unsortMap.put("f", 9);
        System.out.println("Original...");
        System.out.println(unsortMap);
LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
unsortMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
System.out.println("Sorted Map   : " + sortedMap);
}

}
