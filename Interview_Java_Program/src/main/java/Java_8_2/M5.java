package Java_8_2;
interface A55
{
	void test();
}
class M5
{
	public static void main(String[] args) 
	{
		A55 a1 = () -> System.out.println("from test");
		a1.test();
		System.out.println("done");
	}
}
