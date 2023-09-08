package Java_8_2;
interface A66
{
	void test();
}
class M6
{
	public static void main(String[] args) 
	{
		A66 a1 = () -> {
						System.out.println("from test");
						System.out.println("from test");
						System.out.println("from test");
						System.out.println("from test");
					 };
		a1.test();
		System.out.println("done");
	}
}
