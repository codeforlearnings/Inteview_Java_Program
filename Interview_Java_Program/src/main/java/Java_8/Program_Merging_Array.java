package Java_8;
import java.util.*;

public class Program_Merging_Array {
	
	public static void main(String[] args) {

        List<Integer> li=Arrays.asList(1,2,33,54,4,87,55,99,43);

        Collections.reverse(li);
        System.out.println(li);

        List<Integer> number = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println(
                "Reverse order of given List :- ");

        // the number list will be reversed using this method
        Collections.reverse(li);
        System.out.println("Reverse order - "+li);

        Collections.sort(li);
        System.out.println(li);

        List<List<Integer>> l2=Arrays.asList(li,number);

        System.out.println("List data after merzing-"+l2);

    }

}
