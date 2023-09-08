package Java_8_2;

interface A23
{
	default void test()
	{
		System.out.println("from A ==> test");
	}
}
interface B23
{
	default void test()
	{
		System.out.println("from B ==> test");
	}
}
//class C23 implements A23, B23
//{
//}
class M23 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
