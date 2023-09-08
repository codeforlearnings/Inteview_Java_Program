package Java_8_2;
interface A0
{
	public static void test()
	{
		System.out.println("from test");
	}
}
class M20 
{
	public static void main(String[] args) 
	{
		A0.test();
		System.out.println("--------");
		A0.test();
		System.out.println("--------");
		A0.test();
		System.out.println("--------");
	}
}
