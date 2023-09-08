package Java_8_2;
import java.util.ArrayList;
import java.util.function.Consumer;
class M18
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(123);
		list1.add(1000);
		list1.add(199);
		list1.add(45);
		list1.add(4565);
		list1.forEach((element)->System.out.println("consuming:" + element));
	}
}
