package Java_8_2;
interface A44
{
	void test();
}
class M4
{
	public static void main(String[] args) 
	{
		A44 a1 = new A44()
		{
			public void test()
			{
				System.out.println("from test");
			}
		};
		a1.test();
		System.out.println("done");
	}
}
