package Java_8_2;

interface A88
{
	void test(int i);
}
class M8
{
	public static void main(String[] args) 
	{
		A88 a1 = (x) -> System.out.println("from test:" + x);
		a1.test(10);
		System.out.println("done");
	}
}
