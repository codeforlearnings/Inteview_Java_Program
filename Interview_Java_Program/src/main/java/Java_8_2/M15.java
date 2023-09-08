package Java_8_2;
import java.util.ArrayList;
import java.util.function.Consumer;
class M15 
{
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add("hello");
		list1.add(1000);
		list1.add(1.5);
		list1.add(45);
		list1.add(true);
		ListConsumer consumer = new ListConsumer();
		list1.forEach(consumer);
	}
}
class ListConsumer implements Consumer
{
	public void accept(Object obj)
	{
		System.out.println("consuming:" + obj);
	}
}
