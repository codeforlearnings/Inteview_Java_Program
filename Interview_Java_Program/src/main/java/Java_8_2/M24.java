package Java_8_2;
interface A24
{
	default void test()
	{
		System.out.println("from A ==> test");
	}
}
interface B24
{
	default void test()
	{
		System.out.println("from B ==> test");
	}
}
class C24 implements A24
{
	int i = 10;
}
class M24
{
	public static void main(String[] args) 
	{
		C c1 = new C();
//		c1.test();
		System.out.println("Hello World!");
	}
}
