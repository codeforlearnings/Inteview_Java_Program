package Java_8_2;
abstract class A25
{
	int i;
	A25(int i)
	{
		this.i = i;
	}
	void test()
	{
		System.out.println("from testL: "+ i);
	}
}
class B25 extends A25
{
	B25(int i)
	{
		super(i);
	}
}
class M25
{
	public static void main(String[] args) 
	{
		B25 b1 = new B25(90);
		B25 b2 = new B25(190);
		b1.test();
		b2.test();
		System.out.println("Hello World!");
	}
}
