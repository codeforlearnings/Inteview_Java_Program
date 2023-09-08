package Java_8_2;
interface A7
{
	void test();
}
class M2
{
	static class B implements A7
	{
		public void test()
		{
			System.out.println("from test");
		}
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("--------");
		B b2 = new B();
		b2.test();
		System.out.println("done");
	}
}
