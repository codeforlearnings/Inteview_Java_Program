package Java_8_2;

interface A1
{
	int test();
}
class M10
{
	public static void main(String[] args) 
	{
		A1 a1 = () -> 200;
		int i = a1.test();
		System.out.println("done with :" + i);
	}
}
