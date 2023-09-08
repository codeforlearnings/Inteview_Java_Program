package Java_8_2;
interface A77
{
	void test(int i);
}
class M7
{
	public static void main(String[] args) 
	{
		A77 a1 = (int x) -> System.out.println("from test:" + x);
		a1.test(10);
		System.out.println("done");
	}
}
