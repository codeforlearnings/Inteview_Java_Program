package Java_8_2;
interface A2
{
	int test();
}
class M11
{
	public static void main(String[] args) 
	{
		A2 a1 = () -> {
						System.out.println("from test");
						return 200;
					 };
		int i = a1.test();
		System.out.println("done with :" + i);
	}
}
