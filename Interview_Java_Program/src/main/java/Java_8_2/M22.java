package Java_8_2;
interface A22
{
	void test1();
	default void test2()
	{
		System.out.println("from A.test2()");
	}
}
class B22 implements A22
{
	public void test1()
	{
		System.out.println("from B.test1");
	}
}
class C22 implements A22
{
	public void test1()
	{
		System.out.println("from C.test1");
	}
}
class D22 implements A22
{
	public void test1()
	{
		System.out.println("from D.test1");
	}
}
class M22 
{
	public static void main(String[] args) 
	{
		B22 b1 = new B22();
		b1.test1();
		C22 c1 = new C22();
		c1.test1();
		D22 d1 = new D22();
		d1.test1();
		d1.test2();
		System.out.println("done");
	}
}
